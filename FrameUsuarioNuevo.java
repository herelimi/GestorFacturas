package gestorFacturas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameUsuarioNuevo extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirmarPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameUsuarioNuevo frame = new FrameUsuarioNuevo();
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
	public FrameUsuarioNuevo() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblRegistrarse = new JLabel("REGISTRARSE");
		lblRegistrarse.setBounds(175, 25, 86, 14);
		contentPane.add(lblRegistrarse);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(78, 67, 129, 14);
		contentPane.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(240, 64, 86, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
	
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(78, 99, 129, 14);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(240, 95, 86, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblConfirmarPassword = new JLabel("Confirmar password");
		lblConfirmarPassword.setBounds(78, 129, 129, 14);
		contentPane.add(lblConfirmarPassword);
		
		txtConfirmarPassword = new JPasswordField();
		txtConfirmarPassword.setBounds(240, 126, 86, 20);
		contentPane.add(txtConfirmarPassword);
		txtConfirmarPassword.setColumns(10);
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (txtPassword.getText().equalsIgnoreCase(txtConfirmarPassword.getText())) {
					String user = txtLogin.toString();
					String password = txtPassword.toString();
					crearUsuario(user,password);
				}else{
					JButton btnImagenError = new JButton("");
					btnImagenError.setIcon(new ImageIcon("F:\\DAM2\\ADA\\ProyectosADA\\gestorFacturas\\imagenes\\error.jpg"));
					btnImagenError.setBounds(154, 160, 118, 42);
					contentPane.add(btnImagenError);
				}
					
			}

			
		});
		btnAceptar.setBounds(89, 210, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(262, 210, 89, 23);
		contentPane.add(btnCancelar);
		
		

		
	}


	
	
	//Métodos
	protected void crearUsuario(String user, String password) {
		// TODO Auto-generated method stub
		txtLogin.getText();
		txtPassword.getText();
		
		JButton btnImagenCreaUser = new JButton("");
		btnImagenCreaUser.setIcon(new ImageIcon("F:\\DAM2\\ADA\\1Trimestre\\2MANEJO DE CONEXIONES\\PROYECTOGestorFacturas\\imagenes\\usuarioCreado.jpg"));
		btnImagenCreaUser.setBounds(154, 160, 118, 42);
		contentPane.add(btnImagenCreaUser);
	}
}
