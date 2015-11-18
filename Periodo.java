package gestorFacturas;

import java.util.GregorianCalendar;

public class Periodo {
	
	private GregorianCalendar fechaInicio;
	private GregorianCalendar fechaFin;
	
	public Periodo(GregorianCalendar fechaInicio, GregorianCalendar fechaFin) {
		
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public GregorianCalendar getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(GregorianCalendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public GregorianCalendar getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(GregorianCalendar fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	

}
