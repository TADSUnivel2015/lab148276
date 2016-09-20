package br.tezza.tempo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataHora {

	private Date resultado = new Date(System.currentTimeMillis());
	private SimpleDateFormat formatarDate;

	// Retorna a data.
	public String getData() {
		formatarDate = new SimpleDateFormat("dd-mm-yyyy");
		return formatarDate.format(resultado);
	}

	//Retorna a hora.
	public String getHora() {
		formatarDate = new SimpleDateFormat("HH:MM:ss");
		return formatarDate.format(resultado);

	}

}
