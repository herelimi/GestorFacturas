package gestorFacturas;

public class TipoUsuario {
	
	//Declaracion de variables
	private int id;
	private String nombre;
	private ArrayList<Permiso> permisos;
	
	
	//Constructor
	public TipoUsuario(int id, String nombre, ArrayList<Permiso> permisos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.permisos = permisos;
	}
	
	
	//Getters y Setters
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
	public ArrayList<Permiso> getPermisos() {
		return permisos;
	}
	public void setPermisos(ArrayList<Permiso> permisos) {
		this.permisos = permisos;
	}
	
	
	
	

}
