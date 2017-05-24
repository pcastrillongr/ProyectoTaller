package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Propietario {

	private JFrame frmPropietario; 
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDNI; 
	private JTextField textTeléfono; 
	private JTextField textEmail; 
	private JTextField textDirección; 
	private JLabel labelPropietario; 
	private JLabel labelNombre;   
	 private JLabel labelApellido; 
	private JLabel labelDNI;
	private JLabel labelTeléfono;
	private JLabel labelEmail;
	private JLabel labelDirección;
	private JButton buttonVolver; 
	private JButton buttonCrear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propietario window = new Propietario();
					window.frmPropietario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Propietario() {
		
	 labelPropietario = new JLabel("PROPIETARIO");
	  labelNombre = new JLabel("Nombre");
	  textNombre = new JTextField();
	  textApellido = new JTextField();
	   labelApellido = new JLabel("Apellido");
	    labelDNI = new JLabel("DNI");
	    textDNI = new JTextField();
	    labelTeléfono = new JLabel("Tel\u00E9fono");
	    textTeléfono = new JTextField();
	    labelEmail = new JLabel("E-Mail");
	    textEmail = new JTextField();
	    labelDirección = new JLabel("Direcci\u00F3n");
	    textDirección = new JTextField();
	    buttonVolver = new JButton("VOLVER");
	   
	     buttonCrear = new JButton("CREAR");
	
	 	frmPropietario = new JFrame();
		
		
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
		
		labelPropietario.setBounds(180, 11, 83, 26);
		labelNombre.setBounds(20, 46, 53, 14);
		textNombre.setBounds(91, 43, 86, 20);
		textNombre.setColumns(10);
		textApellido.setBounds(91, 74, 86, 20);
		textApellido.setColumns(10);
		labelApellido.setBounds(20, 77, 37, 14);
		labelDNI.setBounds(30, 112, 43, 25);
		textDNI.setBounds(91, 114, 86, 20);
		textDNI.setColumns(10);
		labelTeléfono.setBounds(20, 151, 42, 14);
		textTeléfono.setBounds(91, 148, 86, 20);
		textTeléfono.setColumns(10);
		labelEmail.setBounds(250, 60, 41, 17);
		textEmail.setBounds(301, 58, 86, 20);
		textEmail.setColumns(10);
		labelDirección.setBounds(248, 117, 43, 14);
		textDirección.setBounds(301, 114, 86, 20);
		textDirección.setColumns(10);
		buttonVolver.setBounds(299, 189, 94, 50);
		buttonCrear.setBounds(91, 190, 94, 48);
		frmPropietario.setTitle("PROPIETARIO");
		frmPropietario.setBounds(100, 100, 450, 300);
		frmPropietario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		

		frmPropietario.getContentPane().setLayout(null);
		frmPropietario.getContentPane().add(labelPropietario);
		frmPropietario.getContentPane().add(labelNombre);
		frmPropietario.getContentPane().add(textNombre);
		frmPropietario.getContentPane().add(textApellido);
		frmPropietario.getContentPane().add(labelApellido);
		frmPropietario.getContentPane().add(labelDNI);
		frmPropietario.getContentPane().add(textDNI);
		frmPropietario.getContentPane().add(labelTeléfono);
		frmPropietario.getContentPane().add(textTeléfono);
		frmPropietario.getContentPane().add(labelEmail);
		frmPropietario.getContentPane().add(textEmail);
		frmPropietario.getContentPane().add(labelDirección);
		frmPropietario.getContentPane().add(textDirección);
		frmPropietario.getContentPane().add(buttonVolver);
		frmPropietario.getContentPane().add(buttonCrear);
	}
	
	
	public void eventos() {
	     buttonCrear.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mouseClicked(MouseEvent arg0) {
		     	}
		     });
	     buttonVolver.addMouseListener(new MouseAdapter() {
		    	@Override
		    	public void mouseClicked(MouseEvent e) {
		    	}
		    }); 
	     
	}
	}

