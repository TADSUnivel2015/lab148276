package br.tezza.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class MdbLogistica  implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	@Override
	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;
		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;

				LOGGER.info("MDB Logistica esta realizando a entrega.");
				LOGGER.info("Processando...");

				Thread.sleep(30000);

				LOGGER.info("Entrega finalizada.");

			} else {
				LOGGER.warning("Message of Wrong type: " + rcvMessage);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
