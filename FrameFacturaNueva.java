package gestorFacturas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class FrameFacturaNueva extends JFrame {

	private JPanel contentPane;
	private JTextField tfValor;
	private JTextField tfIVA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameFacturaNueva frame = new FrameFacturaNueva();
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
	public FrameFacturaNueva() {setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 600, 350);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	
	JLabel lblRegistrarse = new JLabel("NUEVA FACTURA");
	lblRegistrarse.setBounds(249, 27, 86, 14);
	contentPane.add(lblRegistrarse);
	
	JLabel lblEmpresa = new JLabel("Empresa");
	lblEmpresa.setBounds(30, 67, 55, 14);
	contentPane.add(lblEmpresa);
		
	JComboBox cbxEmpresa = new JComboBox();
	//String strEmpresas = comboEmpresa.getSelectedItem().toString();
	cbxEmpresa.setBounds(89, 64, 96, 20);
	contentPane.add(cbxEmpresa);
	
	JButton btnAadir = new JButton("A\u00F1adir");
	btnAadir.setBounds(195, 63, 66, 23);
	contentPane.add(btnAadir);
	
	JLabel lblFechaInicio = new JLabel("Fecha Inicio");
	lblFechaInicio.setBounds(271, 67, 66, 14);
	contentPane.add(lblFechaInicio);
	
	JSpinner spFechaInicioDia = new JSpinner();
	spFechaInicioDia.setModel(new SpinnerNumberModel(15,1,31,1));
	int intFechaInicioDia = Integer.parseInt(spFechaInicioDia.getValue().toString());
	spFechaInicioDia.setBounds(340, 64, 39, 20);
	contentPane.add(spFechaInicioDia);
	
	JLabel lblFechaInicioDia = new JLabel("Dia");
	lblFechaInicioDia.setBounds(389, 67, 20, 14);
	contentPane.add(lblFechaInicioDia);
	
	JSpinner spFechaInicioMes = new JSpinner();
	spFechaInicioMes.setModel(new SpinnerNumberModel(6,1,12,1));
	int intFechaInicioMes = Integer.parseInt(spFechaInicioMes.getValue().toString());
	spFechaInicioMes.setBounds(419, 64, 35, 20);
	contentPane.add(spFechaInicioMes);
	
	JLabel lblMes = new JLabel("Mes");
	lblMes.setBounds(464, 67, 29, 14);
	contentPane.add(lblMes);
	
	JSpinner spFechaInicioAnyo = new JSpinner();
	spFechaInicioAnyo.setModel(new SpinnerNumberModel(2015,2014,2050,1));
	int intFechaInicioAnyo = Integer.parseInt(spFechaInicioAnyo.getValue().toString());
	spFechaInicioAnyo.setBounds(495, 64, 55, 20);
	contentPane.add(spFechaInicioAnyo);
	
	JLabel lblAnyo = new JLabel("A\u00F1o");
	lblAnyo.setBounds(554, 67, 20, 14);
	contentPane.add(lblAnyo);
	
	
	JLabel lblFechaFin = new JLabel("Fecha Fin");
	lblFechaFin.setBounds(271, 99, 66, 14);
	contentPane.add(lblFechaFin);
	
	JSpinner spFechaFinDia = new JSpinner();
	spFechaFinDia.setModel(new SpinnerNumberModel(15,1,31,1));
	int intFechaFinDia = Integer.parseInt(spFechaFinDia.getValue().toString());
	spFechaFinDia.setBounds(340, 96, 39, 20);
	contentPane.add(spFechaFinDia);
	
	JLabel label = new JLabel("Dia");
	label.setBounds(389, 99, 20, 14);
	contentPane.add(label);
	
	JSpinner spFechaFinMes = new JSpinner();
	spFechaFinMes.setModel(new SpinnerNumberModel(6,1,12,1));
	int intFechaFinMes = Integer.parseInt(spFechaFinMes.getValue().toString());
	spFechaFinMes.setBounds(419, 95, 35, 20);
	contentPane.add(spFechaFinMes);
	
	JLabel label_1 = new JLabel("Mes");
	label_1.setBounds(464, 99, 29, 14);
	contentPane.add(label_1);
	
	JSpinner spFechaFinAnyo = new JSpinner();
	spFechaFinAnyo.setModel(new SpinnerNumberModel(2015,2014,2050,1));
	int intFechaFinAnyo = Integer.parseInt(spFechaFinAnyo.getValue().toString());
	spFechaFinAnyo.setBounds(495, 96, 55, 20);
	contentPane.add(spFechaFinAnyo);
	
	JLabel lblFechaFinAnyo= new JLabel("A\u00F1o");
	lblFechaFinAnyo.setBounds(554, 99, 20, 14);
	contentPane.add(lblFechaFinAnyo);
	
	
	
	
	JLabel lblConcepto = new JLabel("Concepto");
	lblConcepto.setBounds(30, 92, 46, 14);
	contentPane.add(lblConcepto);
	
	JTextArea taConcepto = new JTextArea();
	JScrollPane scrollConcepto = new JScrollPane(taConcepto);
	//scrollConcepto.setVerticalScrollBarPolicy(JScroll.Vertical);
	String strConcepto = taConcepto.getText();
	taConcepto.setBounds(89, 95, 172, 70);
	contentPane.add(scrollConcepto);
	
	JLabel lblValor = new JLabel("Valor");
	lblValor.setBounds(291, 148, 29, 14);
	contentPane.add(lblValor);
	
	tfValor = new JTextField();
	tfValor.setBounds(340, 145, 86, 20);
	int intValor = Integer.parseInt(tfValor.getText());
	contentPane.add(tfValor);
	tfValor.setColumns(10);
	
	JLabel lblIva = new JLabel("IVA");
	lblIva.setBounds(445, 148, 20, 14);
	contentPane.add(lblIva);
	
	tfIVA = new JTextField();
	int intIVA = Integer.parseInt(tfIVA.getText());
	tfIVA.setBounds(475, 145, 86, 20);
	contentPane.add(tfIVA);
	tfIVA.setColumns(10);
	
	JLabel lblPagado = new JLabel("Pagado");
	lblPagado.setBounds(406, 186, 46, 14);
	contentPane.add(lblPagado);
	
	JCheckBox chckbxPagado = new JCheckBox("");
	if (chckbxPagado.isSelected()) {boolean checkPagado = true;} 
	chckbxPagado.setBounds(447, 182, 29, 23);
	contentPane.add(chckbxPagado);
	
	JLabel lblFormaDePago = new JLabel("Forma de Pago");
	lblFormaDePago.setBounds(30, 186, 80, 14);
	contentPane.add(lblFormaDePago);
	
	JComboBox cbxFormaPago = new JComboBox();
	//JComboBox comboFormaPago.getSelectedItem().toString();
	cbxFormaPago.setBounds(120, 183, 138, 20);
	contentPane.add(cbxFormaPago);

	
	JButton btnAceptar = new JButton("Aceptar");
	btnAceptar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			//crearUsuario(strEmpresas,strFechaInicioDia,strFechaInicioMes,strFechaInicioAnyo,strFechaFinDia,strFechaFinMes,strFechaFinAnyo,strConcepto,intValor,intIVA,checkPagado,strFormaPago);
		}
	});
	btnAceptar.setBounds(145, 267, 89, 23);
	contentPane.add(btnAceptar);
	
	JButton btnCancelar = new JButton("Cancelar");
	btnCancelar.setBounds(367, 267, 89, 23);
	contentPane.add(btnCancelar);
	
	}//fin del constructor
	
	
	//Métodos
		protected void crearUsuario(String strEmpresas, String strFechaInicioDia, String strFechaInicioMes, String strFechaInicioAnyo,
				                    String strFechaFinDia, String strFechaFinMes, String strFechaFinAnyo, String strConcepto, 
				                    int intValor, int intIVA, boolean checkPagado, String strFormaPago) {
		
			
			
			
			JButton btnImagenCreaFactura = new JButton("");
			btnImagenCreaFactura.setIcon(new ImageIcon("F:\\DAM2\\ADA\\1Trimestre\\2MANEJO DE CONEXIONES\\PROYECTOGestorFacturas\\imagenes\\FacturaCreada.jpg"));
			btnImagenCreaFactura.setBounds(260, 2216, 118, 42);
			contentPane.add(btnImagenCreaFactura);
		}//fin del metodo
	
	
}//fin de la clase
