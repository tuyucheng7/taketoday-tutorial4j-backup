/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.3
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cn.tuyucheng.taketoday.petstore.client.api;

import cn.tuyucheng.taketoday.petstore.client.model.Order;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Map;

/**
 * API tests for StoreApi
 */
@Ignore
public class StoreApiTest {

	private final StoreApi api = new StoreApi();


	/**
	 * Delete purchase order by ID
	 * <p>
	 * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void deleteOrderTest() {
		Long orderId = null;
		api.deleteOrder(orderId);

		// TODO: test validations
	}

	/**
	 * Returns pet inventories by status
	 * <p>
	 * Returns a map of status codes to quantities
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getInventoryTest() {
		Map<String, Integer> response = api.getInventory();

		// TODO: test validations
	}

	/**
	 * Find purchase order by ID
	 * <p>
	 * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getOrderByIdTest() {
		Long orderId = null;
		Order response = api.getOrderById(orderId);

		// TODO: test validations
	}

	/**
	 * Place an order for a pet
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void placeOrderTest() {
		Order body = null;
		Order response = api.placeOrder(body);

		// TODO: test validations
	}

}
