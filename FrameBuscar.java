package gestorFacturas;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameBuscar extends JFrame {

	private JPanel panelBuscar;
	private String aBuscar;
	private Usuario usuario;
	private String filtro, campo, coincidir;
	private JComboBox comboBoxBuscarEn;
	private JComboBox comboBoxBuscar;
	private JComboBox comboBoxCoincidir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBuscar frame = new FrameBuscar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameBuscar() {
		setTitle("BUSCAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 217);
		panelBuscar = new JPanel();
		panelBuscar.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelBuscar);
		panelBuscar.setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setBounds(6, 32, 48, 16);
		panelBuscar.add(lblBuscar);
		
		comboBoxBuscar = new JComboBox();
		comboBoxBuscar.setBounds(99, 28, 236, 27);
		panelBuscar.add(comboBoxBuscar);
		
		JLabel lblBuscarEn = new JLabel("Buscar en");
		lblBuscarEn.setBounds(6, 87, 61, 16);
		panelBuscar.add(lblBuscarEn);
		
		comboBoxBuscarEn = new JComboBox();
		comboBoxBuscarEn.setBounds(99, 83, 236, 27);
		panelBuscar.add(comboBoxBuscarEn);
		llenar("campos");
		
		JLabel lblCoincidir = new JLabel("Coincidir");
		lblCoincidir.setBounds(6, 142, 61, 16);
		panelBuscar.add(lblCoincidir);
		
		comboBoxCoincidir = new JComboBox();
		comboBoxCoincidir.setBounds(99, 138, 236, 27);
		panelBuscar.add(comboBoxCoincidir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();
			}
		});
		btnBuscar.setBounds(367, 52, 117, 29);
		panelBuscar.add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(367, 109, 117, 29);
		panelBuscar.add(btnCancelar);
		
		
	}
	public void buscar(String filtro, String campo, String coincidir){
		
		
		
	}
	public void llenarCB(String iDfiltro){
		ArrayList<String> consultaSQL;
		
		if(iDfiltro.equals(campos)){
			consultaSQL=ConsultaSql.consultaCampos(iDfiltro);
			
			for(int i=0; i<consultaSQL.size(); i++){
				comboBoxBuscarEn.addItem(consultaSQL.get(i));
			}
		}
		if(iDfiltro.equals(campos)){
			consultaSQL=ConsultaSql.consultaCampos(iDfiltro);
			
			for(int i=0; i<consultaSQL.size(); i++){
				comboBoxBuscar.addItem(consultaSQL.get(i));
			}
		}
		if(iDfiltro.equals(campos)){
			consultaSQL=ConsultaSql.consultaCampos(iDfiltro);
			
			for(int i=0; i<consultaSQL.size(); i++){
				comboBoxCoincidir.addItem(consultaSQL.get(i));
	}
		
}
