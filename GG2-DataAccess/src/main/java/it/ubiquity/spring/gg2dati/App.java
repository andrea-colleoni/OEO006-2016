package it.ubiquity.spring.gg2dati;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/dataContext.xml");
		
		Client c = ctx.getBean(Client.class);
		c.stampaElencoPersone();

	}

}
