package br.tezza.jaxWS;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.tezza.ejb.EjbProduto;
import br.tezza.pojo.Produto;

@WebService
public class ProdutoWS {

	@EJB
	EjbProduto produtoEjb;

	@WebMethod(operationName = "gravar")
	@WebResult(name="resultadoGravar")
	public void gravar(@WebParam(name="paramProduto")Produto produto) {
		produtoEjb.criar(produto);
	}

	@WebMethod(operationName = "excluir")
	@WebResult(name="resultadoExcluir")
	public void excluir(@WebParam(name="paramId")Long id) {
		produtoEjb.deletar(id);
	}

	@WebMethod(operationName = "atualizar")
	@WebResult(name="resultadoAtualizar")
	public void atualizar(@WebParam(name="paramProduto")Produto produto) {
		produtoEjb.atualizar(produto);
	}

	@WebMethod(operationName = "listarTodos")
	@WebResult(name="resultadoListarTodos")
	public List<Produto> listarTodos(){

		List<Produto> resultado = produtoEjb.listarTodos();

		return resultado;
	}

}
