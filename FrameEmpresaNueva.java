package gestorFacturas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class FrameEmpresaNueva extends JFrame {

	private JPanel contentPane;
	private Usuario usuario;
	private JTextField txtCif;
	private JTextField txtNombre;
	private JComboBox comboSector;
	private ArrayList<Sector> sectores;
	private String nombreEmpresa;
	private String CIF;
	private Sector sector;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameEmpresaNueva frame = new FrameEmpresaNueva();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void crearEmpresa(){
		
		Empresa empresa=new Empresa( CIF,  nombreEmpresa,  sector);
		CIF=txtCif.getText();
		nombreEmpresa=txtNombre.getText();
		sector.setNombre(comboSector.getSelectedItem().toString());
	}

	/**
	 * Create the frame.
	 */
	public FrameEmpresaNueva() {
		setTitle("AÑADIR EMPRESA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCif = new JLabel("CIF");
		lblCif.setBounds(6, 31, 30, 16);
		contentPane.add(lblCif);
		
		txtCif = new JTextField();
		txtCif.setBounds(84, 26, 130, 26);
		contentPane.add(txtCif);
		txtCif.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(6, 81, 61, 16);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(84, 76, 130, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblSector = new JLabel("Sector");
		lblSector.setBounds(6, 135, 61, 16);
		contentPane.add(lblSector);
		
		comboSector = new JComboBox();
				for(int i=0; i<sectores.size(); i++)
					comboSector.addItem(sectores.get(i).getNombre());
				
		comboSector.setBounds(84, 131, 130, 27);
		contentPane.add(comboSector);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearEmpresa();
			}
		});
		btnGuardar.setBounds(6, 200, 117, 29);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//comrpobar que funciona
			}
		});
		btnCancelar.setBounds(127, 200, 117, 29);
		contentPane.add(btnCancelar);
	}
}
