package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Models.Cliente;
import Models.Container;
import Models.Validaciones;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarCliente {

	private JFrame frame9;
	private JTextField textNombre;
	private JTextField textApellido1;
	private JTextField textApellido2;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JTextField textEmail;
    private JLabel lblNombre;
	private JLabel lblPrimerApellido;
	private JLabel lblSegundoApellido;
	private JLabel lblCliente;
	private JLabel lblDni;
	private JLabel lblDireccion;
	private JLabel lblTelefono;
    private JLabel lblEmail;
    private JButton btnVolver;
    private  JButton btnEditar;
    private JButton btnGuardar;
    private JButton btnCancelar;
    
    /**
	 * Create the application.
	 */
	public MostrarCliente() {
		frame9 = new JFrame();
		 lblNombre = new JLabel("Nombre");
		 lblPrimerApellido = new JLabel("Primer Apellido");
		 lblSegundoApellido = new JLabel("Segundo Apellido");
		 lblCliente = new JLabel("Cliente");
		 lblDni = new JLabel("");
		 lblDireccion = new JLabel("Direccion");
		 lblTelefono = new JLabel("Telefono");
		 lblEmail = new JLabel("Email");
		 textNombre = new JTextField();
		 textApellido1 = new JTextField();
		 textApellido2 = new JTextField();
		 textDireccion = new JTextField();
		 textTelefono = new JTextField();
		 textEmail = new JTextField();
		 btnVolver = new JButton("Volver");
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
			
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		propiedades();
		eventos();
		mostrar();
	}
	
	
	public void propiedades(){
		frame9.setBounds(100, 100, 450, 300);
		frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame9.getContentPane().setLayout(null);
		
		
		lblNombre.setBounds(10, 67, 46, 14);
		frame9.getContentPane().add(lblNombre);
		
		
		textNombre.setBounds(144, 64, 86, 20);
		frame9.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		
		lblPrimerApellido.setBounds(10, 92, 70, 14);
		frame9.getContentPane().add(lblPrimerApellido);
		
		
		textApellido1.setBounds(144, 89, 86, 20);
		frame9.getContentPane().add(textApellido1);
		textApellido1.setColumns(10);
		
		
		textApellido2.setBounds(144, 115, 86, 20);
		frame9.getContentPane().add(textApellido2);
		textApellido2.setColumns(10);
		
		
		lblSegundoApellido.setBounds(10, 118, 96, 14);
		frame9.getContentPane().add(lblSegundoApellido);
		
		
		lblCliente.setBounds(10, 21, 46, 14);
		frame9.getContentPane().add(lblCliente);
		
		
		lblDni.setBounds(84, 21, 86, 14);
		frame9.getContentPane().add(lblDni);
		
		
		lblDireccion.setBounds(10, 143, 70, 14);
		frame9.getContentPane().add(lblDireccion);
		
		
		lblTelefono.setBounds(10, 168, 70, 14);
		frame9.getContentPane().add(lblTelefono);
		
		
		lblEmail.setBounds(10, 193, 70, 14);
		frame9.getContentPane().add(lblEmail);
		
		
		textDireccion.setBounds(144, 140, 86, 20);
		frame9.getContentPane().add(textDireccion);
		textDireccion.setColumns(10);
		
		
		textTelefono.setBounds(144, 165, 86, 20);
		frame9.getContentPane().add(textTelefono);
		textTelefono.setColumns(10);
		
		
		textEmail.setBounds(144, 190, 180, 20);
		frame9.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		
		btnVolver.setBounds(10, 227, 89, 23);
		frame9.getContentPane().add(btnVolver);
		
		
		btnEditar.setBounds(144, 227, 89, 23);
		frame9.getContentPane().add(btnEditar);
		
		btnGuardar = new JButton("Guardar");
		
		btnGuardar.setBounds(269, 227, 89, 23);
		frame9.getContentPane().add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		
		btnCancelar.setBounds(141, 227, 89, 23);
		frame9.getContentPane().add(btnCancelar);
		btnCancelar.setVisible(false);
		btnGuardar.setVisible(false);
	
	}
	
	public JFrame getFrame9() {
		return frame9;
	}

	
	public void eventos(){
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				MostrarVehiculo ventana = new MostrarVehiculo();
				ventana.getFrame8().setVisible(true);
				frame9.setVisible(false);
				
				
			}
		});
		
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnCancelar.setVisible(true);
				btnEditar.setVisible(false);
				btnGuardar.setVisible(true);
				
			}
		});
		
		
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
            boolean escorrecto = true;
				
				for(Cliente c : Container.getListaClientes()){
				if(!textNombre.getText().equals(c.getNombre())){
					Validaciones.validarNombre(textNombre.getText());
					if(textNombre.getText().equals("0")){
						escorrecto=false;
					}
				}
				if(!textApellido1.getText().equals(c.getApellido1())){
					Validaciones.apellido1(textApellido1.getText());
					if(textApellido1.getText().equals("0")){
						escorrecto=false;
					}
				}
				if(!textApellido2.getText().equals(c.getApellido2())){
					Validaciones.apellido2(textApellido2.getText());
					if(textApellido2.getText().equals("0")){
						escorrecto=false;
					}
				}
				if(!textDireccion.getText().equals(c.getDireccion())){
					Validaciones.validarDireccion(textDireccion.getText());
					if(textDireccion.getText().equals("0")){
						escorrecto=false;
					}
				}
				if(!textEmail.getText().equals(c.getEmial())){
					Validaciones.validarEmail(textEmail.getText());
					if(textEmail.getText().equals("0")){
						escorrecto=false;
					}
				}
			    if(!textTelefono.getText().equals(c.getTlf())){
			    	Validaciones.validarTelefono(textTelefono.getText());
			    	if(textTelefono.getText().equals("0")){
						escorrecto=false;
					}
				}
			    
			    if(escorrecto){	
			    }
					
				}
			
			}
		});
		
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				btnCancelar.setVisible(false);
				btnEditar.setVisible(true);
				btnGuardar.setVisible(false);
				
			}
		});
	}
	
	private void mostrar(){
		
		Cliente.ClientePrueba();
	
		for(Cliente c : Container.getListaClientes()){
			
			if(c.getNif().equals(Container.getVehiculosAux().get(Container.getVehiculosAux().size()-1).getDniCliente()))
		{
				
			lblDni.setText(c.getNif());
			textNombre.setText(c.getNombre());
            textApellido1.setText(c.getApellido1());
			textApellido2.setText(c.getApellido2());
			textDireccion.setText(c.getDireccion());
			textEmail.setText(c.getEmaill());
			textTelefono.setText(c.getTlf());
			
		}
		}
	}
}
