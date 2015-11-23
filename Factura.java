package gestorFacturas;


public class Factura {
	private int id;
	private Empresa empresa;
	private double valor;
	private boolean estado;
	private Periodo periodo;
	private String descripcion;
	private int iva;
	private FormaDePago formaPago;
	
	
	public Factura(int id, Empresa empresa, double valor, boolean estado,
			Periodo periodo, String descripcion, int iva, FormaDePago formaPago) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.valor = valor;
		this.estado = estado;
		this.periodo = periodo;
		this.descripcion = descripcion;
		this.iva = iva;
		this.formaPago = formaPago;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Periodo getPerido() {
		return periodo;
	}
	public void setPerido(Periodo perido) {
		this.periodo = perido;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public FormaDePago getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(FormaDePago formaPago) {
		this.formaPago = formaPago;
	}
	
	

}
