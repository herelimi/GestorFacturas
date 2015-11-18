package gestorFacturas;

import java.awt.Color;
import java.awt.Font;

public class Theme {
	
	private Font fuente;
	private Color bgPanel;
	private Color bgButton;
	private Color bgLinea1;
	private Color bgLinea2;
	public Theme(Font fuente, Color bgPanel, Color bgButton, Color bgLinea1, Color bgLinea2) {
		super();
		this.fuente = fuente;
		this.bgPanel = bgPanel;
		this.bgButton = bgButton;
		this.bgLinea1 = bgLinea1;
		this.bgLinea2 = bgLinea2;
	}
	public Font getFuente() {
		return fuente;
	}
	public void setFuente(Font fuente) {
		this.fuente = fuente;
	}
	public Color getBgPanel() {
		return bgPanel;
	}
	public void setBgPanel(Color bgPanel) {
		this.bgPanel = bgPanel;
	}
	public Color getBgButton() {
		return bgButton;
	}
	public void setBgButton(Color bgButton) {
		this.bgButton = bgButton;
	}
	public Color getBgLinea1() {
		return bgLinea1;
	}
	public void setBgLinea1(Color bgLinea1) {
		this.bgLinea1 = bgLinea1;
	}
	public Color getBgLinea2() {
		return bgLinea2;
	}
	public void setBgLinea2(Color bgLinea2) {
		this.bgLinea2 = bgLinea2;
	}


}
