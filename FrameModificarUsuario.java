package gestorFacturas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class FrameModificarUsuario extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfEmail;
	private JPasswordField pfActual;
	private JPasswordField pfNueva;
	private JPasswordField pfConfirmacion;
	private JButton btnGuardar, btnCancelar, btnNuevaImagen;
	private Usuario usuario;
	private File imagen;

	/**
	 * Create the frame.
	 */
	public FrameModificarUsuario(Usuario usuario) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);

		this.usuario = usuario;
		
		imagen = new File(usuario.getImagen);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel txtNombre = new JLabel("Nombre:");
		txtNombre.setBounds(6, 37, 61, 16);
		contentPane.add(txtNombre);
		
		JLabel txtEmail = new JLabel("e-mail:");
		txtEmail.setBounds(6, 85, 61, 16);
		contentPane.add(txtEmail);
		
		JLabel txtContraseaActual = new JLabel("Contraseña actual:");
		txtContraseaActual.setBounds(6, 134, 128, 16);
		contentPane.add(txtContraseaActual);
		
		JLabel txtContraseaNueva = new JLabel("Contraseña nueva:");
		txtContraseaNueva.setBounds(6, 162, 128, 16);
		contentPane.add(txtContraseaNueva);
		
		JLabel txtConfirmar = new JLabel("Confirmar:");
		txtConfirmar.setBounds(6, 190, 128, 16);
		contentPane.add(txtConfirmar);
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.setBounds(367, 6, 61, 16);
		contentPane.add(lblFoto);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(79, 32, 130, 26);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(79, 80, 130, 26);
		contentPane.add(tfEmail);
		
		pfActual = new JPasswordField();
		pfActual.setBounds(145, 129, 128, 26);
		contentPane.add(pfActual);
		
		pfNueva = new JPasswordField();
		pfNueva.setBounds(145, 157, 128, 26);
		contentPane.add(pfNueva);
		
		pfConfirmacion = new JPasswordField();
		pfConfirmacion.setBounds(145, 185, 128, 26);
		contentPane.add(pfConfirmacion);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(92, 243, 117, 29);
		contentPane.add(btnGuardar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(221, 242, 117, 29);
		contentPane.add(btnCancelar);
		
		btnNuevaImagen = new JButton("NUEVA");
		btnNuevaImagen.setBounds(327, 121, 117, 29);
		contentPane.add(btnNuevaImagen);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(btnCancelar))
		
			
		if(e.getSource().equals(btnGuardar)){
			
			if(comprobarContrasenya(pfActual.getText()))
				modUsuario();
		}
		
		if(e.getSource().equals(btnNuevaImagen))
			buscarImagen();
		
			
			
	}
	
	
	public void  buscarImagen(){
		JFileChooser fc = new JFileChooser();
		
		 int returnVal = fc.showOpenDialog(FrameModificarUsuario.this);

         if (returnVal == JFileChooser.APPROVE_OPTION)
             imagen = fc.getSelectedFile();
         
         
         repaint();
         
	}
	
	public boolean comprobarContrasenya(String password){
		
		if( password.equals(usuario.getPassword()))
			return true;
		
		else
			return false;
		
	}
	
	public void modUsuario(){
		
		if(tfNombre != null)
			usuario.setNombre(tfNombre.getText());
		
		if(tfEmail != null){
			
			if(Usuario.comprobarEmail(tfEmail.getText()))
				usuario.setEmainl(tfEmail.getText())
				
			else
				System.out.println("Mal");
		}
		
		usuario.setImagen = imagen.getAbsolutePath();
		
		
	}
	
	
	public void panit(Graphics g){
		super.paint(g);
		
		ImageIcon img = new ImageIcon(getClass().getResource(imagen.getAbsolutePath()));
		
		g.drawImage(img.getImage(), 350, 10, null);
		
	}
}
