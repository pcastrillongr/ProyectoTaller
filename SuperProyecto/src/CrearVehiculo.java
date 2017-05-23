import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CrearVehiculo {

	private JFrame frame;
	private JLabel lblmatricula;
	private  JLabel lblMarca ;
	private JLabel lblModelo; 
	private JLabel lblPuertas; 
	private JLabel lbltipodiesel; 
	private JLabel lblNewLabel_1 ;
	private JLabel lblNewLabel_2 ;


	public CrearVehiculo() {
		
		frame=new JFrame();
		 lblmatricula = new JLabel("Matricula:");
		 lblMarca = new JLabel("Marca:");
		 lblModelo = new JLabel("Modelo:");
		 lblPuertas = new JLabel("Puertas:");
		 lbltipodiesel = new JLabel("Diesel o Gasolina:");
		 lblNewLabel_1 = new JLabel("A\u00F1o Matriculacion:");
		 lblNewLabel_2 = new JLabel("CV:");

		
		initialize();
		
	
	}

	private void initialize() {
		
		propiedades();
		eventos();
	}
	

	private void propiedades()
	{
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblmatricula.setBounds(25, 77, 67, 14);
		frame.getContentPane().add(lblmatricula);
		
		lblMarca.setBounds(25, 126, 46, 14);
		frame.getContentPane().add(lblMarca);
		
		lblModelo.setBounds(25, 167, 46, 14);
		frame.getContentPane().add(lblModelo);
		
		lblPuertas.setBounds(25, 214, 46, 14);
		frame.getContentPane().add(lblPuertas);
		
		lbltipodiesel.setBounds(256, 77, 84, 14);
		frame.getContentPane().add(lbltipodiesel);
		
		lblNewLabel_1.setBounds(256, 126, 96, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2.setBounds(256, 167, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
	}
	private void eventos()
	{
		
	}
}
