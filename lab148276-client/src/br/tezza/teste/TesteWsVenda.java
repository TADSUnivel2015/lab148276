package br.tezza.teste;

import br.tezza.wsclientEntrega.IOException_Exception;
import br.tezza.wsclientEntrega.ServletException_Exception;
import br.tezza.wsclientVenda.PojoVenda;
import br.tezza.wsclientVenda.VendaJaxWS;
import br.tezza.wsclientVenda.VendaJaxWSService;

public class TesteWsVenda {

	public static void main(String[] args) throws IOException_Exception, ServletException_Exception, br.tezza.wsclientVenda.IOException_Exception, br.tezza.wsclientVenda.ServletException_Exception {
		 VendaJaxWSService venda = new VendaJaxWSService();
		 VendaJaxWS port = venda.getVendaJaxWSPort();

		 PojoVenda resultadoVenda = port.enviarVenda();

		 System.out.println(resultadoVenda.toString());
	}

}
