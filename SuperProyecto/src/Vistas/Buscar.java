package Vistas;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

import Models.Container;
import Models.Vehiculo;
import javax.swing.ImageIcon;

public class Buscar {

	private JFrame frame4;
	private JButton btnMatrcula;
	private JButton btnDni;
	private JButton btnFactura;
	private JButton btnVolver;
	private JTextField textFieldDatos;
	private JButton btnBuscar;
	private JLabel lblBusqueda;
	private JLabel lblFoto;
	
	
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
		lblBusqueda = new JLabel("");
		btnBuscar = new JButton("BUSCAR");
		textFieldDatos = new JTextField();
	}

	private void propiedades() {
		frame4.setBounds(100, 100, 474, 315);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		frame4.setTitle("BUSCAR VEH�CULO");
		
		btnMatrcula.setBounds(10, 151, 139, 114);
		frame4.getContentPane().add(btnMatrcula);
		
		btnDni.setBounds(170, 151, 139, 114);
		frame4.getContentPane().add(btnDni);
		
		btnFactura.setBounds(319, 151, 139, 114);
		frame4.getContentPane().add(btnFactura);
		
		btnVolver.setBounds(184, 11, 89, 23);
		frame4.getContentPane().add(btnVolver);
		
		
		lblBusqueda.setBounds(159, 71, 180, 14);
		lblBusqueda.setVisible(false);
		frame4.getContentPane().add(lblBusqueda);
		
		textFieldDatos.setBounds(81, 197, 172, 23);
		textFieldDatos.setVisible(false);
		frame4.getContentPane().add(textFieldDatos);
		textFieldDatos.setColumns(10);
		
		btnBuscar.setBounds(308, 186, 89, 44);
		btnBuscar.setVisible(false);
		frame4.getContentPane().add(btnBuscar);
		
		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(Buscar.class.getResource("/Imagenes/lupa.jpg")));
		lblFoto.setBounds(0, 0, 458, 276);
		frame4.getContentPane().add(lblFoto);
		Image img = new ImageIcon(Buscar.class.getResource("/Imagenes/lupa.jpg")).getImage();
		Image newImg = img.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), java.awt.Image.SCALE_SMOOTH);
		lblFoto.setIcon(new ImageIcon(newImg));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	private void eventos() {
		btnMatrcula.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ocultarComponentesPpales();
				lblBusqueda.setText("B�SQUEDA POR MATR�CULA");
				MostrarComponentesBusqueda();
			}
		});	
		
		
		btnDni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ocultarComponentesPpales();
				lblBusqueda.setText("B�SQUEDA POR DNI");
				MostrarComponentesBusqueda();
			}
		});
		
		
		btnFactura.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ocultarComponentesPpales();
				lblBusqueda.setText("B�SQUEDA POR FACTURA");
				MostrarComponentesBusqueda();
			}
		});
		
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String modo;
				
				modo = lblBusqueda.getText();
				
				switch(modo){
				case "B�SQUEDA POR MATR�CULA": 
					busquedaPorMatricula(textFieldDatos.getText());
					break;
				case "B�SQUEDA POR DNI": 
					busquedaPorDni(textFieldDatos.getText());
					break;
				case "B�SQUEDA POR FACTURA": 
					JOptionPane.showMessageDialog(getFrame4(), "B�SQUEDA POR FACTURA");
					break;
				}
			}

			

			
		});
		
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mostrarComponentesPpales();
				ocultarComponentesBusqueda();
				
				Principal window=new Principal();
				window.getFrame2().setVisible(true);
				frame4.dispose();
			}
		});
	}
	
	
	public JFrame getFrame4() {
		return frame4;
	}
	
	private void mostrarComponentesPpales(){
		btnMatrcula.setVisible(true);
		btnDni.setVisible(true);
		btnFactura.setVisible(true);
	}
	
	
	private void ocultarComponentesPpales(){
		btnMatrcula.setVisible(false);
		btnDni.setVisible(false);
		btnFactura.setVisible(false);
	}
	
	private void MostrarComponentesBusqueda() {
		btnBuscar.setVisible(true);
		textFieldDatos.setVisible(true);
		lblBusqueda.setVisible(true);
	}
	
	
	private void ocultarComponentesBusqueda() {
		btnBuscar.setVisible(false);
		textFieldDatos.setVisible(false);
		lblBusqueda.setVisible(false);
	}
	
	
	private void busquedaPorMatricula(String matricula) {
		boolean escorrecto = false;
		Vehiculo.CochePrueba();
		for(Vehiculo c: Container.getListaVehiculos()){
			if(c.getMatricula().equals(matricula)){
			
				Container.getVehiculosAux().add(c);
				escorrecto = true;
			}
		}
		if(!escorrecto){
			JOptionPane.showMessageDialog(frame4, "La matricula introducida no se encuentra en nuestra base de datos");
			}
		else{

			MostrarVehiculo ventana = new MostrarVehiculo();
			ventana.getFrame8().setVisible(true);
			frame4.setVisible(false);
		}
		
	}
	
	private void busquedaPorDni(String dni) {
		boolean escorrecto = false;
		Vehiculo.CochePrueba();		
		for(Vehiculo c: Container.getListaVehiculos()){
			if(c.getDniCliente().equals(dni)){
				Container.getVehiculosAux().add(c);
				escorrecto = true;
			}
		}
		
		if(!escorrecto){
		JOptionPane.showMessageDialog(frame4, "El dni introducido no se encuentra en nuestra base de datos");
		}
		if(escorrecto){
			MostrarVehiculo ventana = new MostrarVehiculo();
			ventana.getFrame8().setVisible(true);
			frame4.setVisible(false);
			
		}
	}

	
}
