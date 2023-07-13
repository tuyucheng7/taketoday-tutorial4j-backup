package cn.tuyucheng.taketoday.reactive.service;

import cn.tuyucheng.taketoday.async.producer.OrderProducer;
import cn.tuyucheng.taketoday.constants.OrderStatus;
import cn.tuyucheng.taketoday.domain.Order;
import cn.tuyucheng.taketoday.reactive.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Slf4j
@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderProducer orderProducer;

	public Mono<Order> createOrder(Order order) {
		LOGGER.info("Create order invoked with: {}", order);
		return Mono.just(order)
			.map(o -> {
				return o.setLineItems(o.getLineItems()
					.stream()
					.filter(l -> l.getQuantity() > 0)
					.collect(Collectors.toList()));
			})
			.flatMap(orderRepository::save)
			.map(o -> {
				orderProducer.sendMessage(o.setOrderStatus(OrderStatus.INITIATION_SUCCESS));
				return o;
			})
			.onErrorResume(err -> {
				return Mono.just(order.setOrderStatus(OrderStatus.FAILURE)
					.setResponseMessage(err.getMessage()));
			})
			.flatMap(orderRepository::save);
	}

	public Flux<Order> getOrders() {
		LOGGER.info("Get all orders invoked.");
		return orderRepository.findAll();
	}
}
