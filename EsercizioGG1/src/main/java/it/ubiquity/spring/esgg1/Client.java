package it.ubiquity.spring.esgg1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	List<Messaggio> elencoMessaggi;
	MessageSender sender;

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		Client c = ctx.getBean(Client.class);
		c.creaMessaggiDiTest();
		c.inviaMessaggi();
	}

	public Client() {
		super();
		elencoMessaggi = new ArrayList<Messaggio>();
	}

	private void creaMessaggiDiTest() {
		Messaggio m = new Messaggio();
		m.setOggetto("Test 1");
		m.setCorpo("Corpo test 1");
		m.setDestinatario("Destinatario test 1");
		elencoMessaggi.add(m);

	}

	private void inviaMessaggi() {
		for (Messaggio m : elencoMessaggi) {
			sender.send(m);
		}
	}

	public void setSender(MessageSender sender) {
		this.sender = sender;
	}

}
