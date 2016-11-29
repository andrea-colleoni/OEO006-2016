package it.ubiquity.spring.esgg1;

public class SMSSender implements MessageSender {

	public void send(Messaggio messaggio) {
		System.out.println("Invio SMS a: " + messaggio.getDestinatario());
	}

}
