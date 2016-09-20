package br.tezza.pojo;

import java.util.List;
import java.io.Serializable;
import java.math.BigDecimal;

public class PojoVenda implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int idVenda;
	private List<String> itensVenda;
	private BigDecimal totalVenda;

	public PojoVenda() {

	}

	public PojoVenda(int idVenda, List<String> itensVenda, BigDecimal totalVenda) {
		this.idVenda = idVenda;
		this.itensVenda = itensVenda;
		this.totalVenda = totalVenda;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public List<String> getItensVenda() {
		return itensVenda;
	}

	public void setItensVenda(List<String> itensVenda) {
		this.itensVenda = itensVenda;
	}

	public BigDecimal getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(BigDecimal totalVenda) {
		this.totalVenda = totalVenda;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
