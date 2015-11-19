package gestorFacturas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import java.awt.Color;

public class FrameApp extends JFrame {

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameApp frame = new FrameApp();
					frame.setVisible(true);
					frame.setExtendedState(frame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	private JPanel contentPane;
	
	public FrameApp() {
		
		
		getContentPane().setLayout(new BorderLayout());
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArchivo = new JMenu("ARCHIVO");
		menuBar.add(menuArchivo);
		
		JMenuItem menuNuevaFactura = new JMenuItem("Nueva Factura");
		menuArchivo.add(menuNuevaFactura);
		
		JMenuItem menuNuevaEmpresa = new JMenuItem("Nueva Empresa");
		menuArchivo.add(menuNuevaEmpresa);
		
		JMenuItem menuModificarUsuario = new JMenuItem("Modificar Usuario");
		menuArchivo.add(menuModificarUsuario);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuArchivo.add(menuSalir);
		
		JMenu menuTheme = new JMenu("TEMA");
		menuBar.add(menuTheme);
		
		JRadioButton rbtnBlue = new JRadioButton("Blue Sky");
		menuTheme.add(rbtnBlue);
		
		JRadioButton rbtnPink = new JRadioButton("Pink Barbie");
		menuTheme.add(rbtnPink);
		
		JRadioButton rbtnPurple = new JRadioButton("Purple Rain");
		menuTheme.add(rbtnPurple);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		
		/*contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);*/
		
		
		JPanel panelNorte = new JPanel();
		panelNorte.setLayout(new GridLayout(3,3));
		getContentPane().add(panelNorte, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 500, 42);
		panelNorte.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNuevaFactura = new JButton("Nueva factura");
		toolBar.add(btnNuevaFactura);
		
		JButton btnBuscarFactura = new JButton("Buscar facturas");
		toolBar.add(btnBuscarFactura);
		
		JButton btnNuevaEmpresa = new JButton("Nueva empresa");
		toolBar.add(btnNuevaEmpresa);
		
		JButton btnBuscarEmpresas = new JButton("Buscar empresas");
		toolBar.add(btnBuscarEmpresas);
		
		JLabel lblNombre = new JLabel("Hola");
		getContentPane().add(lblNombre);
		
		//hola caracola
		
		

	}
}
