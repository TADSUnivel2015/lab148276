package br.tezza.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.inject.spi.ProcessObserverMethod;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.tezza.ejb.ProcessEntrega;
import br.tezza.pojo.PojoEntrega;

@WebServlet("/entrega")
public class Entrega extends HttpServlet{

	@EJB
	ProcessEntrega processEntrega; // Faz a injeção na variável.

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Processo de entrega foi iniciado...");

		// Instância um objeto do tipo Entrega para repassar ao EJB ProcessEntrega.
		PojoEntrega entrega = new PojoEntrega(1, new Date());

		System.out.println("Gerando remessa de entrega...");

		// Envia o objeto
		processEntrega.processarEntrega(entrega);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("Entrega despachada.");
	}

}
