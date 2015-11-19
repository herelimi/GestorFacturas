package gestorFacturas;

import java.util.ArrayList;

public class Usuario {
	private int id;
	private String nombre;
	private String password;
	private String mail;
	private String foto;
	private ArrayList<Factura> facturas;
	private ArrayList<Consulta> consultas;
	
	

	public Usuario(int id, String nombre, String password,
			String mail, String foto, ArrayList<Factura> facturas,
			ArrayList<Consulta> consultas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.mail = mail;
		this.foto = foto;
		this.facturas = facturas;
		this.consultas = consultas;
	}
	

	public Usuario(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public ArrrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}
	

}
