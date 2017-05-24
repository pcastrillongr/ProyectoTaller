package Vistas;

import java.awt.EventQueue;
import java.util.ArrayList;

import Vistas.CrearVehiculo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;

public class Presupuesto {

	private JFrame frame7;
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
	private JLabel lblNumeroid;
	private JList list;
	private String[]estados={"No Reparado","Reparado y esperando al cliente","Reparado y entregado"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Presupuesto window = new Presupuesto();
					window.frame7.setVisible(true);
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
		frame7 = new JFrame();		
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
	    lblNumeroid = new JLabel("");		
	    list = new JList(estados);
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
		frame7.setBounds(100, 100, 450, 300);
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.getContentPane().setLayout(null);
		
		lblFInicio.setBounds(10, 36, 77, 14);
		frame7.getContentPane().add(lblFInicio);
		
		lblFEntrega.setBounds(10, 86, 77, 14);
		frame7.getContentPane().add(lblFEntrega);
		
		lblNumeroDeReparacion.setBounds(10, 11, 114, 14);
		frame7.getContentPane().add(lblNumeroDeReparacion);
		
		lblPresupuesto.setBounds(111, 36, 81, 14);
		frame7.getContentPane().add(lblPresupuesto);
		
		lblEstado.setBounds(240, 36, 46, 14);
		frame7.getContentPane().add(lblEstado);
		
		lblComentario.setBounds(20, 134, 69, 14);
		frame7.getContentPane().add(lblComentario);
		
		txtComentario.setBounds(20, 152, 204, 98);
		frame7.getContentPane().add(txtComentario);
		
		btnEditar.setBounds(234, 183, 89, 67);
		frame7.getContentPane().add(btnEditar);
		btnVolver.setBounds(333, 183, 89, 67);
		frame7.getContentPane().add(btnVolver);
		
		
		txtFechaInicio.setBounds(10, 55, 86, 20);
		frame7.getContentPane().add(txtFechaInicio);
		txtFechaInicio.setColumns(10);
		
		
		txtFechaFinalizacion.setBounds(10, 103, 86, 20);
		frame7.getContentPane().add(txtFechaFinalizacion);
		txtFechaFinalizacion.setColumns(10);
		
		
		txtPresupuesto.setBounds(111, 55, 86, 20);
		frame7.getContentPane().add(txtPresupuesto);
		txtPresupuesto.setColumns(10);
		
		
		lblNumeroid.setBounds(134, 11, 46, 14);
		frame7.getContentPane().add(lblNumeroid);
		
		
		list.setBounds(238, 57, 184, 60);
		frame7.getContentPane().add(list);
	    
	}
	
	public void eventos(){
		
	}
}
