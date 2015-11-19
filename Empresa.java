package gestorFacturas;

public class Empresa {
	
	//Declaracion de variables
	private String id;
	private String nombre;
	private Sector sector;
	
	//Constructor
	public Empresa(String id, String nombre, Sector sector) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sector = sector;
	}
	
	
	//Setters y Getters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	
	

}
