package Vistas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import Models.Vehiculo;

public class CrearVehiculo {

	private JFrame frame3;
	private JLabel lblmatricula;
	private  JLabel lblMarca ;
	private JLabel lblModelo; 
	private JLabel lblPuertas; 
	private JLabel lbltipodiesel; 
	private JLabel lblanio ;
	private JLabel lblcv ;
	private JTextField txtmatricula;
	private JTextField txtmarca;
	private JTextField txtmodelo;
	private JTextField txtpuertas;
	private JTextField txttipo;
	private JTextField txtcv;
	private JButton btncrear;
	private Vehiculo coche;
	private JLabel lblColor;
	private JTextField txtcolor;
	private JSpinner spinner;
	


	public CrearVehiculo() {
		
		frame3=new JFrame();
		 lblmatricula = new JLabel("Matricula:");
		 lblMarca = new JLabel("Marca:");
		 lblModelo = new JLabel("Modelo:");
		 lblPuertas = new JLabel("Puertas:");
		 lbltipodiesel = new JLabel("Diesel o Gasolina:");
		 lblanio = new JLabel("A\u00F1o Matriculacion:");
		 lblcv = new JLabel("CV:");
		 txtmarca = new JTextField();
		 txtmodelo = new JTextField();
		 txtpuertas = new JTextField();
		 txttipo = new JTextField();
		 txtcv = new JTextField();
		 btncrear = new JButton("CREAR");
			spinner = new JSpinner();
		 txtmatricula = new JTextField();
		initialize();
		
	
	}

	private void initialize() {
		
		propiedades();
		eventos();
	}
	

	private void propiedades()
	{
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		lblmatricula.setBounds(25, 77, 90, 14);
		frame3.getContentPane().add(lblmatricula);
		
		lblMarca.setBounds(25, 126, 72, 14);
		frame3.getContentPane().add(lblMarca);
		
		lblModelo.setBounds(25, 167, 90, 14);
		frame3.getContentPane().add(lblModelo);
		
		lblPuertas.setBounds(25, 214, 90, 14);
		frame3.getContentPane().add(lblPuertas);
		
		lbltipodiesel.setBounds(201, 49, 120, 14);
		frame3.getContentPane().add(lbltipodiesel);
		
		lblanio.setBounds(201, 89, 120, 14);
		frame3.getContentPane().add(lblanio);
		
		lblcv.setBounds(221, 126, 66, 14);
		frame3.getContentPane().add(lblcv);
		

		txtmatricula.setBounds(99, 71, 90, 26);
		frame3.getContentPane().add(txtmatricula);
		txtmatricula.setColumns(10);
		
		txtmarca.setBounds(99, 120, 90, 26);
		frame3.getContentPane().add(txtmarca);
		txtmarca.setColumns(10);
		
		txtmodelo.setBounds(99, 161, 90, 26);
		frame3.getContentPane().add(txtmodelo);
		txtmodelo.setColumns(10);
		
		txtpuertas.setBounds(99, 208, 90, 26);
		frame3.getContentPane().add(txtpuertas);
		txtpuertas.setColumns(10);
		
		txttipo.setBounds(310, 43, 97, 26);
		frame3.getContentPane().add(txttipo);
		txttipo.setColumns(10);
		
		
		txtcv.setBounds(310, 120, 97, 26);
		frame3.getContentPane().add(txtcv);
		txtcv.setColumns(10);
		
		btncrear.setBounds(234, 189, 161, 64);
		frame3.getContentPane().add(btncrear);
		
		
		txtmatricula.setBounds(99, 71, 90, 26);
		frame3.getContentPane().add(txtmatricula);
		txtmatricula.setColumns(10);
		
		lblColor = new JLabel("Color:");
		lblColor.setBounds(25, 34, 61, 16);
		frame3.getContentPane().add(lblColor);
		
		txtcolor = new JTextField();
		txtcolor.setBounds(99, 29, 90, 26);
		frame3.getContentPane().add(txtcolor);
		txtcolor.setColumns(10);
		
	
		spinner.setModel(new SpinnerNumberModel(2017, 1900, 2017, 1));
		spinner.setBounds(310, 86, 97, 20);
		frame3.getContentPane().add(spinner);
		
	}
	public JFrame getFrame() {
		return frame3;
	}

	

	private void eventos()
	{
		 btncrear.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mouseClicked(MouseEvent e) {
			 		
			 		boolean escorrecto = false;
			 		int contador=0;
			 		
			 		
			 		/**
			 		 * Hacemos las validaciones ,y contamos con un contador los aciertos,
			 		 * si llega al numero total de campos nos creara el objeto con los atributos introducidos
			 		 */
			 		
			 		//matricula
			 		
			 		if(txtmatricula.getText().isEmpty())
			 		{
			 			
			 			JOptionPane.showMessageDialog(frame3, "ERROR: Inserte una matricula correcta");
			 		}
			 		else{
			 			
			 			contador+=1;
			 		}
			 		
			 		//marca
			 		
			 		if(txtmarca.getText().isEmpty())
			 		{
			 			
			 			JOptionPane.showMessageDialog(frame3, "ERROR: Inserte una marca correcta");
			 		}
			 		else{
			 			
			 			contador+=1;
			 		}
			 		
			 		
			 		//modelo 
			 		
			 		if(txtmodelo.getText().isEmpty())
			 		{
			 			
			 			JOptionPane.showMessageDialog(frame3, "ERROR: Inserte un modelo correcto");
			 		}
			 		else{
			 			
			 			contador+=1;
			 		}
			 		
			 		//puertas 
			 		int numero=0;
			 		try{
						numero=Integer.parseInt(new String(txtpuertas.getText()));
						
					}catch(Exception e2){
						
						JOptionPane.showMessageDialog(frame3, "ERROR: Las puertas deben ser numericas");
						escorrecto=false;
						
					
					}
					
					if(escorrecto)
					{
						if(numero<2||numero>5){
							JOptionPane.showMessageDialog(frame3, "ERROR: Introduzca un numero correcto");

						}
						else{
							contador+=1;
						}
					}
					
					//tipo gasoil
					
					if(txttipo.getText().isEmpty())
			 		{
			 			
			 			JOptionPane.showMessageDialog(frame3, "ERROR: Inserte tipo de combustible");
			 			escorrecto=false;
			 		}
					if(escorrecto){
						
						
						if(txttipo.getText().toUpperCase().equals("GASOIL")||txttipo.getText().toUpperCase().equals("GASOLINA")){
							
							JOptionPane.showMessageDialog(frame3, "ERROR: Inserte Gasoil o Gasolina");
						}
						else{
							
							contador+=1;
						}
					}
					
					//año
					
					
				
					
					//CV
					
					
					int numero3=0;
			 		try{
						numero3=Integer.parseInt(new String(txtcv.getText()));
						
					}catch(Exception e2){
						
						JOptionPane.showMessageDialog(frame3, "ERROR: Los CV deben ser numericas");
						escorrecto=false;
						
					
					}
					
					if(escorrecto)
					{
						if(numero3<=0){
							JOptionPane.showMessageDialog(frame3, "ERROR: Los CV deben ser >0");

						}
						else{
							contador+=1;
						}
					}
					
					//color
					
					if(txtcolor.getText().isEmpty())
			 		{
			 			
			 			JOptionPane.showMessageDialog(frame3, "ERROR: Inserte un color ");
			 		}
					
					
			 		else{
			 			
			 			contador+=1;
			 		}
					
					if(contador==7)
					{
						
						coche=new Vehiculo();
						
						coche.setMatricula(txtmatricula.getText());
						coche.setMarca(txtmarca.getText());
						coche.setModelo(txtmodelo.getText());
						coche.setNumPuertas((byte) numero);
						coche.setTipoGas(txttipo.getText());
						coche.setAnioMatriculacion((int) spinner.getValue());
						coche.setCv((short) numero3);
						coche.setColor(txtcolor.getText());
						
						
							//Container.getListaVehiculos().add(coche);
							JOptionPane.showMessageDialog(frame3, "VEHICULO ANHADIDO");
						
						
						
					}
					else{
						
						JOptionPane.showMessageDialog(frame3, "el contador no vale");
					}
			 		
					
			 		
			 	}
			 });
		
		
	}
}