package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Buscar {

	private JFrame frame4;
	private JButton btnMatrcula;
	private JButton btnDni;
	private JButton btnFactura;
	private JButton btnVolver;
	private JLabel lblBuscar;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscar window = new Buscar();
					window.frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Buscar() {
		initialize();
		propiedades();
		eventos();
	}

	private void initialize() {
		frame4 = new JFrame();
		btnMatrcula = new JButton("MATR\u00CDCULA");
		btnDni = new JButton("DNI");
		btnFactura = new JButton("FACTURA");
		btnVolver = new JButton("VOLVER");
		lblBuscar = new JLabel("BUSCAR VEH\u00CDCULO/CLIENTE/FACTURA");
	}

	private void propiedades() {
		frame4.setBounds(100, 100, 474, 315);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		btnMatrcula.setBounds(10, 71, 139, 114);
		frame4.getContentPane().add(btnMatrcula);
		
		btnDni.setBounds(159, 71, 139, 114);
		frame4.getContentPane().add(btnDni);
		
		btnFactura.setBounds(308, 71, 139, 114);
		frame4.getContentPane().add(btnFactura);
		
		btnVolver.setBounds(186, 221, 89, 23);
		frame4.getContentPane().add(btnVolver);
		
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBuscar.setBounds(70, 11, 360, 31);
		frame4.getContentPane().add(lblBuscar);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	private void eventos() {
		btnMatrcula.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});		
	}
	
	
	public JFrame getFrame4() {
		return frame4;
	}
}
