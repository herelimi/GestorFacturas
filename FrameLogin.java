package gestorFacturas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtPassword;
	private JComboBox basesDatos;
	static ArrayList <Sector> alBD = new ArrayList <Sector>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin() {setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	
	JLabel lblAcceso = new JLabel("ACCESO AL SISTEMA DE FACTURACION PERSONAL");
	lblAcceso.setBounds(65, 24, 286, 14);
	contentPane.add(lblAcceso);
	
	JLabel lblLogin = new JLabel("Login");
	lblLogin.setBounds(78, 67, 129, 14);
	contentPane.add(lblLogin);
	
	JTextField txtLogin = new JTextField();
	txtLogin.setBounds(240, 64, 86, 20);
	String user = txtLogin.toString();
	contentPane.add(txtLogin);
	txtLogin.setColumns(10);

	
	JLabel lblPassword = new JLabel("Password");
	lblPassword.setBounds(78, 99, 129, 14);
	contentPane.add(lblPassword);
	
	txtPassword = new JPasswordField();
	String password = txtPassword.toString();
	txtPassword.setBounds(240, 95, 86, 20);
	contentPane.add(txtPassword);
	txtPassword.setColumns(10);
	
	if (ComprobarUsuario(user,password)==false){
		
		Object[] textoSalir = {"Si", "No"};
		int opcion = JOptionPane.showOptionDialog(getRootPane(), 
				"¿Desea Registrarse? ",				//Mensaje para el usuario
				"Usuario No existe!!!...", 			//Titulo de la ventana
				JOptionPane.YES_NO_OPTION, 			//tipo de opcion:  si o no
				JOptionPane.QUESTION_MESSAGE,		//tipo de mensaje
				null, 								//muestra icono por defecto  u otro icono
				textoSalir,							//array con opciones
				textoSalir[1]);  					//opcion a mostrar por defecto= si
		        if (opcion == 1){ FrameUsuarioNuevo nuevoUser = new FrameUsuarioNuevo(); }
		
	}else{
		txtLogin.setText(" ");		//Borrar campos de texto
		txtPassword.setText(" ");
	}
	 
	
	JLabel lblBD = new JLabel("Base de Datos");
	lblBD.setBounds(78, 129, 129, 14);
	contentPane.add(lblBD);
	
	
	JButton btnAceptar = new JButton("Aceptar");
	btnAceptar.setBounds(89, 210, 89, 23);
	contentPane.add(btnAceptar);
	
	JButton btnCancelar = new JButton("Cancelar");
	btnCancelar.setBounds(262, 210, 89, 23);
	contentPane.add(btnCancelar);
	
	
	JComboBox objBD = new JComboBox();
	llenarComboBox();
	
	//objBD.setModel(new DefaultComboBoxModel(new String[] { " ", " ", "" }));
	objBD.setBounds(240, 126, 92, 20);
	contentPane.add(objBD);
	
	

	
	}
	
	
	
	//Metodo que llena el comboBox de bases de datos
	public void llenarComboBox(){
		
		for (int i=0; i<alBD.size(); i++){
			
			//objBD.addItem(alBD.get(i).getNombre());
			
		}	
		

	}//fin del metodo llenarComboBox()
	
	
	
	
	//Metodo que llena el array list de bases de datos
		public void llenarArrayList(){

			

		}//fin del metodo llenarBD()
	
	
		
		
	
	//Metodo para comprobar que el usuario existe
	public boolean ComprobarUsuario(String user, String password){
		
		//la conexion se controlara desde otro lado.....
		return true;
		
		
	}//fin del metodo ComprobarUsuario()
	
	
	
}
