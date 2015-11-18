package gestorFacturas;

public class Banco {
	
	private int id;
	private String nombre;
	private NumeroCuenta cuenta;
	private String web;
	public Banco(int id, String nombre, NumeroCuenta cuenta, String web) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.web = web;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public NumeroCuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(NumeroCuenta cuenta) {
		this.cuenta = cuenta;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
	

}
