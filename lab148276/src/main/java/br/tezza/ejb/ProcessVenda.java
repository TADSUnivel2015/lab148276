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
import javax.jms.Topic;

import br.tezza.pojo.PojoVenda;

@Stateless
public class ProcessVenda {

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic topicVenda;

    public void processarVenda(PojoVenda venda) {

    	System.out.println("Venda recebida pelo EJB Process Venda");

    	final Destination destination = topicVenda;

    	ObjectMessage message = context.createObjectMessage();

    	try {

			message.setObject(venda);
			context.createProducer().send(destination, message);

			System.out.println("A venda foi repassada.");
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
