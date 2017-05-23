package Vistas;

import java.awt.EventQueue;
import java.util.ArrayList;

import Vistas.CrearVehiculo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Presupuesto {

	private JFrame frame5;
	private JLabel lblFInicio; 
	private JLabel lblFEntrega; 
	private JLabel lblNumeroDeReparacion; 
	private JLabel lblPresupuesto;
	private JLabel lblEstado;
	private JLabel lblComentario;
	private JTextPane txtComentario;
	private JButton btnEditar;
	private JButton btnVolver;
	private JTextField txtFechaInicio;
	private JTextField txtFechaFinalizacion;
	private JTextField txtPresupuesto;
	private JTextField txtEstado;
	private JLabel lblNumeroid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Presupuesto window = new Presupuesto();
					window.frame5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Presupuesto() {
		frame5 = new JFrame();		
		lblFInicio = new JLabel("Fecha Inicio");
		lblFEntrega = new JLabel("Fecha Entrega");
		lblNumeroDeReparacion = new JLabel("Numero de Reparacion");
		lblPresupuesto = new JLabel("Presupuesto");
		lblEstado = new JLabel("Estado");
		lblComentario = new JLabel("Comentarios");
		txtComentario = new JTextPane();
		btnEditar = new JButton("Editar");
	    btnVolver = new JButton("Volver");
	    txtFechaInicio = new JTextField();
	    txtFechaFinalizacion = new JTextField();
	    txtPresupuesto = new JTextField();
	    txtEstado = new JTextField();
	    lblNumeroid = new JLabel("");		
	    
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		propiedades();
		
		eventos();
	}
	
	public void propiedades(){
		frame5.setBounds(100, 100, 450, 300);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		lblFInicio.setBounds(10, 48, 77, 14);
		frame5.getContentPane().add(lblFInicio);
		
		lblFEntrega.setBounds(111, 48, 77, 14);
		frame5.getContentPane().add(lblFEntrega);
		
		lblNumeroDeReparacion.setBounds(10, 11, 114, 14);
		frame5.getContentPane().add(lblNumeroDeReparacion);
		
		lblPresupuesto.setBounds(204, 48, 69, 14);
		frame5.getContentPane().add(lblPresupuesto);
		
		lblEstado.setBounds(294, 48, 46, 14);
		frame5.getContentPane().add(lblEstado);
		
		lblComentario.setBounds(20, 134, 69, 14);
		frame5.getContentPane().add(lblComentario);
		
		txtComentario.setBounds(20, 152, 204, 98);
		frame5.getContentPane().add(txtComentario);
		
		btnEditar.setBounds(234, 183, 89, 67);
		frame5.getContentPane().add(btnEditar);
		btnVolver.setBounds(333, 183, 89, 67);
		frame5.getContentPane().add(btnVolver);
		
		
		txtFechaInicio.setBounds(10, 67, 86, 20);
		frame5.getContentPane().add(txtFechaInicio);
		txtFechaInicio.setColumns(10);
		
		
		txtFechaFinalizacion.setBounds(107, 67, 86, 20);
		frame5.getContentPane().add(txtFechaFinalizacion);
		txtFechaFinalizacion.setColumns(10);
		
		
		txtPresupuesto.setBounds(198, 67, 86, 20);
		frame5.getContentPane().add(txtPresupuesto);
		txtPresupuesto.setColumns(10);
		
		
		txtEstado.setBounds(294, 67, 86, 20);
		frame5.getContentPane().add(txtEstado);
		txtEstado.setColumns(10);
		
		
		lblNumeroid.setBounds(134, 11, 46, 14);
		frame5.getContentPane().add(lblNumeroid);
	
	}
	
	public void eventos(){
		
	}
	

}
