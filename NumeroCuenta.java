package gestorFacturas;

public class NumeroCuenta {
	
	//Declaracion de variables
	private int[] codigoBancario;
	private int [] codigoOficina;
	private int [] digitoControl;
	private int [] cuenta;
	
	//Constructor
	public NumeroCuenta(int[] codigoBancario, int[] codigoOficina, int[] digitoControl, int[] cuenta) {
		this.codigoBancario = codigoBancario;
		this.codigoOficina = codigoOficina;
		this.digitoControl = digitoControl;
		this.cuenta = cuenta;
	}
	
	//Getters y Setters
	public int[] getCodigoBancario() {
		return codigoBancario;
	}

	public void setCodigoBancario(int[] codigoBancario) {
		this.codigoBancario = codigoBancario;
	}

	public int[] getCodigoOficina() {
		return codigoOficina;
	}

	public void setCodigoOficina(int[] codigoOficina) {
		this.codigoOficina = codigoOficina;
	}

	public int[] getDigitoControl() {
		return digitoControl;
	}

	public void setDigitoControl(int[] digitoControl) {
		this.digitoControl = digitoControl;
	}

	public int[] getCuenta() {
		return cuenta;
	}

	public void setCuenta(int[] cuenta) {
		this.cuenta = cuenta;
	}
	


	
	
	

}
