package it.ubiquity.spring.esgg1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Client {

	List<Messaggio> elencoMessaggi;
	
	@Autowired
	MessageSender sender;

//	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
//		
//		Client c = ctx.getBean(Client.class);
//		c.inviaMessaggi();
//	}

	public Client() {
		super();
		elencoMessaggi = new ArrayList<Messaggio>();
	}

	public void inviaMessaggi() {
		for (Messaggio m : elencoMessaggi) {
			sender.send(m);
		}
	}

	public void setSender(MessageSender sender) {
		this.sender = sender;
	}

	public List<Messaggio> getElencoMessaggi() {
		return elencoMessaggi;
	}

	public void setElencoMessaggi(List<Messaggio> elencoMessaggi) {
		this.elencoMessaggi = elencoMessaggi;
	}

}
