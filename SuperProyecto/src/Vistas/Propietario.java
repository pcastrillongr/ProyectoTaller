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

public class Propietario {

	private JFrame frmPropietario;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDNI;
	private JTextField textTeléfono;
	private JTextField textEmail;
	private JTextField textDirección;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPropietario = new JFrame();
		frmPropietario.setTitle("PROPIETARIO");
		frmPropietario.setBounds(100, 100, 450, 300);
		frmPropietario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel labelPropietario = new JLabel("PROPIETARIO");
		labelPropietario.setBounds(180, 11, 83, 26);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(20, 46, 53, 14);
		
		textNombre = new JTextField();
		textNombre.setBounds(91, 43, 86, 20);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(91, 74, 86, 20);
		textApellido.setColumns(10);
		
		JLabel labelApellido = new JLabel("Apellido");
		labelApellido.setBounds(20, 77, 37, 14);
		
		JLabel labelDNI = new JLabel("DNI");
		labelDNI.setBounds(30, 112, 43, 25);
		
		textDNI = new JTextField();
		textDNI.setBounds(91, 114, 86, 20);
		textDNI.setColumns(10);
		
		JLabel labelTeléfono = new JLabel("Tel\u00E9fono");
		labelTeléfono.setBounds(20, 151, 42, 14);
		
		textTeléfono = new JTextField();
		textTeléfono.setBounds(91, 148, 86, 20);
		textTeléfono.setColumns(10);
		
		JLabel labelEmail = new JLabel("E-Mail");
		labelEmail.setBounds(250, 60, 41, 17);
		
		textEmail = new JTextField();
		textEmail.setBounds(301, 58, 86, 20);
		textEmail.setColumns(10);
		
		JLabel labelDirección = new JLabel("Direcci\u00F3n");
		labelDirección.setBounds(248, 117, 43, 14);
		
		textDirección = new JTextField();
		textDirección.setBounds(301, 114, 86, 20);
		textDirección.setColumns(10);
		
		JButton buttonVolver = new JButton("VOLVER");
		buttonVolver.setBounds(299, 189, 94, 50);
		
		JButton buttonCrear = new JButton("CREAR");
		buttonCrear.setBounds(91, 190, 94, 48);
		buttonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
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
}
