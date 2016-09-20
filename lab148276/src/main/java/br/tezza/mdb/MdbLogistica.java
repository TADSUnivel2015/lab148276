package br.tezza.mdb;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.tezza.pojo.Log;
import br.tezza.tempo.DataHora;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class MdbLogistica  implements MessageListener {


	@PersistenceContext(unitName = "lab148276-persistence-unit")
	private EntityManager em;

	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	@Override
	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;
		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;

				Log log = new Log();
				log.setNome("MdbLogistica");
				log.setInformacao("MDBLogistica esta realizando a entrega.");
				log.setData(new DataHora().getData());
				log.setHora(new DataHora().getHora());

				em.persist(log);

				log.setInformacao("Processando...");

				em.persist(log);

				Thread.sleep(30000);

				log.setInformacao("Entrega finalizada.");
				em.persist(log);

			} else {
				LOGGER.warning("Message of Wrong type: " + rcvMessage);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
