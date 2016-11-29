package it.ubiquity.spring.esgg1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(AppConfig.class)
public class TestConfig {

	@Bean
	@Scope("prototype")
	public MessageSender sender() {
		return new SMSSender();
	}
}
