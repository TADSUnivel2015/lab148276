package br.tezza.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.management.RuntimeErrorException;
import java.util.logging.Logger;

import br.tezza.pojo.PojoVenda;
import br.tezza.servlet.Venda;

@MessageDriven(name = "MdbVenda", activationConfig = {
	    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class MdbVenda implements MessageListener {

	 private final static Logger LOGGER = Logger.getLogger(MdbVenda.class.toString());

	@Override
	public void onMessage(Message rcvMessage) {

		ObjectMessage msg = null;
		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;
				PojoVenda venda = (PojoVenda) msg.getObject();

				System.out.println("MDBVenda: venda concluida!");
			} else {
				LOGGER.warning("Message of Wrong type MdbVenda: " + rcvMessage);
			}
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}

}
