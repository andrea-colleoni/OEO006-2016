package it.ubiquity.spring.gg3aspectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses={ AdvisedClass.class })
public class AspectjConfig {
	
	@Bean
	public LogAspect logAspect() {
		return new LogAspect();
	}
}
