package it.ubiquity.patterns.abstractfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/appContext.xml");
		
		AbstractUIFactory factory = ctx.getBean(AbstractUIFactory.class);
		System.out.println(factory);
		factory = ctx.getBean(AbstractUIFactory.class);
		System.out.println(factory);
		factory = ctx.getBean(AbstractUIFactory.class);
		System.out.println(factory);
		factory = ctx.getBean(AbstractUIFactory.class);
		System.out.println(factory);
		factory = ctx.getBean(AbstractUIFactory.class);
		System.out.println(factory);
		factory = ctx.getBean(AbstractUIFactory.class);
		System.out.println(factory);
		
		Window w = factory.createWindow();
		
		
		Window wSpring = (Window)ctx.getBean("win300");
		System.out.println(wSpring);
		wSpring = (Window)ctx.getBean("win300");
		System.out.println(wSpring);
		wSpring = (Window)ctx.getBean("win200");
		System.out.println(wSpring);
		wSpring = (Window)ctx.getBean("win200");
		System.out.println(wSpring);
		
		//Client c = new Client(); => xml riga 7
		//WinUIFactory factory = new WinUIFactory();
		
		// wiring
		//c.setFactory(new WinUIFactory());

		Client c = (Client)ctx.getBean("cl1");
		Client c2 = (Client)ctx.getBean("cl1");
		Client c3 = (Client)ctx.getBean("cl1");
		Client c4 = (Client)ctx.getBean("cl1");
		
		//Client c = ctx.getBean(Client.class); 
		c.go();
	}

}
