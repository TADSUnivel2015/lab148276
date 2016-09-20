package br.tezza.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.tezza.pojo.Produto;

@Stateless
public class EjbProduto {

	@PersistenceContext(unitName = "lab148276-persistence-unit")
	private EntityManager em;


	public void criar(Produto entity) {
		em.persist(entity);
	}

	public void deletar(Long id) {

		Produto entity = em.find(Produto.class, id);
		em.remove(entity);
	}

	public List<Produto> listarTodos() {
		List<Produto> resultado = em.createNativeQuery
				("select * from Produto", Produto.class).getResultList();
		return resultado;
	}

	public void atualizar(Produto produto) {

		em.merge(produto);

	}

}
