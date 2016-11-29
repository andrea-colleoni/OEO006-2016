package it.ubiquity.spring.esgg1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "/testContext.xml" })
public class ClientTest {
	
	@Autowired
	private Client client;

	@Test
	public void testInviaMessaggi() {
		creaMessaggiDiTest();
		client.inviaMessaggi();
	}
	
	private void creaMessaggiDiTest() {
		Messaggio m = new Messaggio();
		m.setOggetto("Test 1");
		m.setCorpo("Corpo test 1");
		m.setDestinatario("Destinatario test 1");
		client.getElencoMessaggi().add(m);

	}
}
