package it.ubiquity.spring.esgg1;

public class MailSender implements MessageSender {

	public void send(Messaggio messaggio) {
		System.out.println("Invio MAIL a: " + messaggio.getDestinatario());
	}

}
