package it.ubiquity.spring.gg3aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
		
		ClasseEsempio ce = ctx.getBean(ClasseEsempio.class);
		System.out.println("Inizio");
		ce.met1();
		ce.met2("ciao");
		ce.met3();
		System.out.println("Fine");
	}

}
