package br.tezza.ejb;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Queue;

import br.tezza.pojo.PojoEntrega;

@Stateless
public class ProcessEntrega {

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queuePedido;

    public void processarEntrega (PojoEntrega entrega) {

    	System.out.println("Entrega recebida pelo EJB Process Entrega");

    	final Destination destination = queuePedido;

    	ObjectMessage message = context.createObjectMessage();

    	try {

			message.setObject(entrega);
			context.createProducer().send(destination, message);

			System.out.println("A entrega foi repassada.");
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
