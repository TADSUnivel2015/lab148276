package br.tezza.jaxWS;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.tezza.ejb.ProcessVenda;
import br.tezza.pojo.PojoVenda;

@WebService
public class VendaJaxWS extends HttpServlet{

	@EJB
	ProcessVenda processVenda; // Faz a injeção na variável.

	@WebMethod(operationName = "enviarVenda")
	@WebResult(name="resultadoVenda")
	@Override
	protected void doDelete(@WebParam(name="paramReq")HttpServletRequest req, @WebParam(name="paramResp")HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Processo de venda foi iniciado...");

		// Lista com itens comprados.
		List<String> itensVenda = new ArrayList<>();
		itensVenda.add("Arroz");
		itensVenda.add("Feijão");
		itensVenda.add("Carne");

		// Instância um objeto do tipo Venda para repassar ao EJB ProcessVenda.
		PojoVenda venda = new PojoVenda(1, itensVenda, new BigDecimal(250.50));

		System.out.println("Gerando processo de venda...");

		// Envia o objeto
		processVenda.processarVenda(venda);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("Processo de venda foi encaminhado.");
	}


}
