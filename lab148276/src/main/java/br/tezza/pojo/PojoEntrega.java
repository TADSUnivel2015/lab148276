package br.tezza.pojo;

import java.io.Serializable;
import java.util.Date;

public class PojoEntrega implements Serializable{

	private int idEntrega;
	private Date dataEntrega;

	public PojoEntrega() {

	}

	public PojoEntrega(int idEntrega, Date dataEntrega) {
		this.idEntrega = idEntrega;
		this.dataEntrega = dataEntrega;
	}

	public int getIdEntrega() {
		return idEntrega;
	}

	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

}
