package it.ubiquity.spring.gg3aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AopConfig {

	@Bean
	public MethodBeforeAdvice logBefore() {
		System.out.println("definito l'advice");
		return new LogMetodi();
	}
//	
//	@Bean
//	public ClasseEsempio esempio() {
//		return new ClasseEsempio();
//	}
//	
	@Bean
	public ProxyFactoryBean classeEsempioProxy() {
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		
		// target 
		pfb.setTarget(new ClasseEsempio());
		
		pfb.setInterceptorNames("regexpPointcutAdvisor");
		System.out.println("definito il proxy dinamico");
		return pfb;
	}
	
	@Bean
	public NameMatchMethodPointcut m1PointCut() {
		NameMatchMethodPointcut nmmp = new NameMatchMethodPointcut();
		nmmp.setMappedNames("met1");
		System.out.println("definito il pointcut");
		return nmmp;
	}
	
	@Bean
	public RegexpMethodPointcutAdvisor regexpPointcutAdvisor() {
		RegexpMethodPointcutAdvisor rmpa = new RegexpMethodPointcutAdvisor();
		rmpa.setPattern(".*met*.*");
		rmpa.setAdvice(logBefore());
		return rmpa;
	}
	
	@Bean
	public DefaultPointcutAdvisor advisor() {
		DefaultPointcutAdvisor dpa = new DefaultPointcutAdvisor();
		dpa.setPointcut(m1PointCut());
		dpa.setAdvice(logBefore());
		System.out.println("definito l'advisor");
		return dpa;
	}
	
}
