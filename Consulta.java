package gestorFacturas;

public class Consulta {
	
	private int id;
	private String busqueda;
	private int idUsuari;
	public Consulta(int id, String busqueda, int idUsuari) {
		super();
		this.id = id;
		this.busqueda = busqueda;
		this.idUsuari = idUsuari;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusqueda() {
		return busqueda;
	}
	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}
	public int getIdUsuari() {
		return idUsuari;
	}
	public void setIdUsuari(int idUsuari) {
		this.idUsuari = idUsuari;
	}
	
	

}
