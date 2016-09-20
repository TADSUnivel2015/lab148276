package br.tezza.teste;

import java.util.List;

import br.tezza.wsclientProduto.Produto;
import br.tezza.wsclientProduto.ProdutoWS;
import br.tezza.wsclientProduto.ProdutoWSService;

public class TesteWsProduto {

	public static void main(String[] args) {

		ProdutoWSService servico = new ProdutoWSService();
		ProdutoWS port = servico.getProdutoWSPort();

		Produto produto = new Produto();
		produto.setDescricao("Macarrão");
		produto.setCodigoBarras("215454512");
		produto.setPreco(9.00);

		port.gravar(produto);
		imprimir(port);

		produto.setDescricao("Feijão");
		produto.setCodigoBarras("5415454577");
		produto.setPreco(5.75);
		port.atualizar(produto);
		imprimir(port);

		port.excluir(2L);
		imprimir(port);

	}

	private static void imprimir(ProdutoWS port) {
		List<Produto> listarTodos = port.listarTodos();

		for (Produto p : listarTodos) {
			System.out.println( "Id: " + p.getId() + ","
					+ " Descricão: " + p.getDescricao() + ","
							+ " CodBarras: " + p.getCodigoBarras() + ","
									+ " Preço:  " + p.getPreco());
		}
	}

}
