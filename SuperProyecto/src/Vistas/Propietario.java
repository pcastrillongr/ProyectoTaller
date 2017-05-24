package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
import javax.swing.DropMode;
import javax.swing.JList;

public class Propietario {

	private JFrame frame6;
	private JTextField textNombre;
	private JTextField textApellido1;
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
	private JTextField textSApellido;
	private JTextField textLetra;
	private JLabel lblLetra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propietario window = new Propietario();
					window.frame6.setVisible(true);
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
		textApellido1 = new JTextField();
		labelApellido = new JLabel("Primero Apellido");
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

		frame6 = new JFrame();

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		propiedades();
		eventos();
	}

	public void propiedades() {

		labelPropietario.setBounds(180, 11, 83, 26);
		labelNombre.setBounds(9, 52, 53, 14);
		textNombre.setBounds(10, 71, 122, 20);
		textNombre.setColumns(10);
		textApellido1.setBounds(9, 114, 123, 20);
		textApellido1.setColumns(10);
		labelApellido.setBounds(9, 100, 105, 14);
		labelDNI.setBounds(10, 192, 43, 14);
		textDNI.setBounds(9, 206, 94, 20);
		textDNI.setColumns(10);
		labelTeléfono.setBounds(156, 145, 61, 14);
		textTeléfono.setBounds(156, 161, 142, 20);
		textTeléfono.setColumns(10);
		labelEmail.setBounds(156, 100, 41, 14);
		textEmail.setBounds(158, 114, 140, 20);
		textEmail.setColumns(10);
		labelDirección.setBounds(156, 52, 61, 14);
		textDirección.setBounds(158, 71, 140, 20);
		textDirección.setColumns(10);
		buttonVolver.setBounds(281, 275, 94, 50);
		buttonCrear.setBounds(83, 276, 94, 48);
		frame6.setTitle("PROPIETARIO");
		frame6.setBounds(100, 100, 465, 374);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame6.getContentPane().setLayout(null);
		frame6.getContentPane().add(labelPropietario);
		frame6.getContentPane().add(labelNombre);
		frame6.getContentPane().add(textNombre);
		frame6.getContentPane().add(textApellido1);
		frame6.getContentPane().add(labelApellido);
		frame6.getContentPane().add(labelDNI);
		frame6.getContentPane().add(textDNI);
		frame6.getContentPane().add(labelTeléfono);
		frame6.getContentPane().add(textTeléfono);
		frame6.getContentPane().add(labelEmail);
		frame6.getContentPane().add(textEmail);
		frame6.getContentPane().add(labelDirección);
		frame6.getContentPane().add(textDirección);
		frame6.getContentPane().add(buttonVolver);
		frame6.getContentPane().add(buttonCrear);

		textSApellido = new JTextField();
		textSApellido.setBounds(9, 161, 123, 20);
		frame6.getContentPane().add(textSApellido);
		textSApellido.setColumns(10);

		JLabel lblSApelldio = new JLabel("Segundo Apellido");
		lblSApelldio.setBounds(9, 145, 105, 14);
		frame6.getContentPane().add(lblSApelldio);

		textLetra = new JTextField();
		textLetra.setBounds(111, 206, 22, 20);
		frame6.getContentPane().add(textLetra);
		textLetra.setColumns(10);

		lblLetra = new JLabel("Letra");
		lblLetra.setBounds(111, 192, 46, 14);
		frame6.getContentPane().add(lblLetra);
	}

	public void eventos() {
		buttonCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean escorrecto = true;
				char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
				String letrasdni = "TRWAGMYFPDXBNJZSQVHLCKE";
				String letra = textLetra.getText();
				int dni = 0;
				int telefono;
				/**
				 * Verificar Nombre
				 *
				 */
				if (textNombre.getText().isEmpty()) {

					JOptionPane.showMessageDialog(frame6, "Debes escribir un nombre");
					escorrecto = false;
				}
				for (int i = 0; i < textNombre.getText().length(); i++) {
					for (int j = 0; j < textNombre.getText().length(); i++) {
						if (textNombre.getText().charAt(i) == c[j]) {

							JOptionPane.showMessageDialog(frame6, "Debes escribir un nombre");
							escorrecto = false;

						}

					}

				}

				/**
				 * Verificar apellido1
				 */

				if (textApellido1.getText().isEmpty()) {

					JOptionPane.showMessageDialog(frame6, "Debes escribir un Apellido");
					escorrecto = false;
				}
				for (int i = 0; i < textApellido1.getText().length(); i++) {
					for (int j = 0; j < textApellido1.getText().length(); i++) {
						if (textApellido1.getText().charAt(i) == c[j]) {

							JOptionPane.showMessageDialog(frame6, "Debes escribir un Apellido que no contenga numeros");
							escorrecto = false;

						}

					}
				}

				/**
				 * Verificar Apellido2
				 */

				if (textSApellido.getText().isEmpty()) {

					JOptionPane.showMessageDialog(frame6, "Debes escribir un Apellido");
					escorrecto = false;
				}
				for (int i = 0; i < textSApellido.getText().length(); i++) {
					for (int j = 0; j < textSApellido.getText().length(); i++) {
						if (textSApellido.getText().charAt(i) == c[j]) {

							JOptionPane.showMessageDialog(frame6, "Debes escribir un Apellido que no contenga numeros");
							escorrecto = false;

						}

					}
				}

				/**
				 * Validar DNI
				 */
				if (textDNI.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame6, "Debes introducir un dni");
					escorrecto = false;
				}
				if (textDNI.getText().length() != 8) {
					JOptionPane.showMessageDialog(frame6, "El dni debe contener 8 digitos");
					escorrecto = false;
				}
				if (textLetra.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame6, "El dni debe contener 9 digitos");
					escorrecto = false;
				}
				if (textLetra.getText().length() != 1) {
					JOptionPane.showMessageDialog(frame6, "La letra debe ser 1 sola");
					escorrecto = false;
				}

				try {
					dni = Integer.parseInt(textDNI.getText());

				} catch (Exception ee) {

					JOptionPane.showMessageDialog(frame6, "El numero de dni debe ser numerico");
					escorrecto = false;
				}

				for (int i = 0; i < letrasdni.length(); i++) {

					if (letra.toUpperCase().equals(letrasdni.charAt(i))) {
						escorrecto = true;

					}
				}

				/**
				 * Direccion
				 */
				if (textDirección.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame6, "Debes introducir una Direccion");
					escorrecto = false;

				}

				/**
				 * Email
				 */

				if (textEmail.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame6, "Debes introducir un Email");
					escorrecto = false;

				}

				/**
				 * Telefono
				 */
				if (textTeléfono.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame6, "Debes introducir un Telefono");
					escorrecto = false;
				}
				if (textTeléfono.getText().length() != 9) {
					JOptionPane.showMessageDialog(frame6, "El Telefono debe disponer de 9 digitos");
					escorrecto = false;
				}
				try {
					telefono = Integer.parseInt(textTeléfono.getText());

				} catch (Exception ee) {

					JOptionPane.showMessageDialog(frame6, "El numero de telefono debe ser numerico");
					escorrecto = false;
				}

			}

		});
		buttonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				CrearVehiculo windows = new CrearVehiculo();
				windows.getFrame().setVisible(true);
				frame6.setVisible(false);
			
			}
		});

	}
}
