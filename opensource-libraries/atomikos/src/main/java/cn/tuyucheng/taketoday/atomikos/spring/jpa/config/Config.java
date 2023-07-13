package cn.tuyucheng.taketoday.atomikos.spring.jpa.config;

import cn.tuyucheng.taketoday.atomikos.spring.jpa.Application;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.SystemException;

@Configuration
@EnableTransactionManagement
public class Config {

	@Bean(initMethod = "init", destroyMethod = "close")
	public UserTransactionManager userTransactionManager() throws SystemException {
		UserTransactionManager userTransactionManager = new UserTransactionManager();
		userTransactionManager.setTransactionTimeout(300);
		userTransactionManager.setForceShutdown(true);
		return userTransactionManager;
	}

	@Bean
	public JtaTransactionManager transactionManager() throws SystemException {
		JtaTransactionManager jtaTransactionManager = new JtaTransactionManager();
		jtaTransactionManager.setTransactionManager(userTransactionManager());
		jtaTransactionManager.setUserTransaction(userTransactionManager());
		return jtaTransactionManager;
	}

	@Bean
	public Application application() {
		return new Application();
	}

}