package br.tezza.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@JMSDestinationDefinitions(
		value = {
				@JMSDestinationDefinition(
						name = "java:/queue/QueuePedido",
						interfaceName = "javax.jms.Queue",
						destinationName = "QueuePedido"
						),
				@JMSDestinationDefinition(
						name = "java:/topic/TopicVenda",
						interfaceName = "javax.jms.Topic",
						destinationName = "TopicVenda"
						)
		})

@WebServlet("/Config")
public class Config extends HttpServlet {

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queuePedido;

	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic topicVenda;

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("<h1>Quickstart: Example demonstrates the use of <strong>JMS 2.0</strong> and <strong>EJB 3.2 Message-Driven Bean</strong> in WildFly 8.</h1>");
		try {

			// topicVenda
			boolean useTopic = req.getParameterMap().keySet().contains("topicVenda");
			final Destination destinationTopic = useTopic ? topicVenda : queuePedido;

			out.write("Enviando mensagem para: " + destinationTopic);

			String textTopic = " foi enviada: ";
			context.createProducer().send(destinationTopic, textTopic);
			out.write("Message: " + textTopic + "</br>");

			out.write("Fim do processo");

			// queuePedido
			boolean useQueue = req.getParameterMap().keySet().contains("queuePedido");
			final Destination destinationQueue = useQueue ? topicVenda : queuePedido;

			out.write("Enviando mensagem para: " + destinationQueue);

			String textQueue = " foi enviada: ";
			context.createProducer().send(destinationTopic, textQueue);
			out.write("Message: " + textQueue + "</br>");

			out.write("Fim do processo");

		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

}
