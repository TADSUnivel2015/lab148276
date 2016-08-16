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

@WebServlet("/config")
public class Config extends HttpServlet {
	/**
	 *
	 */
	private static final long serialVersionUID = 6928990017251760934L;

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queuePedido;

	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic topicVenda;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("<h1>Quickstart: Trabalho 3º Bimestre.</h1>");
		try {
			boolean useTopic = req.getParameterMap().keySet().contains("topicVenda");
			final Destination destination = useTopic ? topicVenda : queuePedido;

			out.write("Enviando mensagem para: " + destination);

			String text = " foi enviada: ";
			context.createProducer().send(destination, text);
			out.write("</br> Message: " + text + "</br>");

			out.write("Fim do processo" + "</br>");


		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

}
