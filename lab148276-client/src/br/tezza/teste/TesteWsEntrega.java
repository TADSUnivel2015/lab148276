package br.tezza.teste;

import br.tezza.wsclientEntrega.EntregaJaxWS;
import br.tezza.wsclientEntrega.EntregaJaxWSService;
import br.tezza.wsclientEntrega.IOException_Exception;
import br.tezza.wsclientEntrega.PojoEntrega;
import br.tezza.wsclientEntrega.ServletException_Exception;

public class TesteWsEntrega {

	public static void main(String[] args) throws IOException_Exception, ServletException_Exception {
		 EntregaJaxWSService entrega = new EntregaJaxWSService();
		 EntregaJaxWS port = entrega.getEntregaJaxWSPort();

		 PojoEntrega produto = port.enviarEntrega();

		 System.out.println(produto.toString());
	}

}
