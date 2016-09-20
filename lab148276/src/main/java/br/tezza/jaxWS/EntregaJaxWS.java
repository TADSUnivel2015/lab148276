package br.tezza.jaxWS;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.tezza.ejb.ProcessEntrega;
import br.tezza.pojo.PojoEntrega;

@WebService
public class EntregaJaxWS extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@EJB
	ProcessEntrega processEntrega; // Faz a injeção na variável.

	@WebMethod(operationName = "enviarEntrega")
	@WebResult(name="resultadoEntrega")
	@Override
	protected void doGet(@WebParam(name="paramReq")HttpServletRequest req, @WebParam(name="paramResp")HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Processo de entrega foi iniciado...");

		// Instância um objeto do tipo Entrega para repassar ao EJB ProcessEntrega.
		PojoEntrega entrega = new PojoEntrega(1, new Date());

		System.out.println("Gerando remessa de entrega...");

		// Envia o objeto
		processEntrega.processarEntrega(entrega);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("Processo de entrega foi despachado.");
	}

}
