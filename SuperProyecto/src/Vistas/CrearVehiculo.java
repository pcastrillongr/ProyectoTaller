package Vistas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import Models.Cliente;
import Models.Container;
import Models.Vehiculo;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.List;
import javax.swing.SwingConstants;

public class CrearVehiculo {

	private JFrame frame3;
	private JLabel lblmatricula;
	private JLabel lblMarca;
	private JLabel lblModelo;
	private JLabel lblPuertas;
	private JLabel lbltipodiesel;
	private JLabel lblanio;
	private JLabel lblcv;
	private JTextField txtmatricula;
	private JTextField txtmodelo;
	private JTextField txtcv;
	private JButton btncrear;
	private String[] marca;
	private String[] tipo;
	private String[] color;
	private Vehiculo coche;
	private JLabel lblColor;
	private JSpinner spinner;
	private JList listmarca;
	private JScrollPane scrollPanemarca;
	private JList listtipo;
	private JList listcolor;
	private JScrollPane scrollPanecolor;
	private JSpinner spinnerpuertas;
	private JLabel foto;
	private JButton btnempleado;

	public CrearVehiculo() {

		frame3 = new JFrame();
		lblmatricula = new JLabel("Matricula:");

		lblMarca = new JLabel("Marca:");

		lblModelo = new JLabel("Modelo:");

		lblPuertas = new JLabel("Puertas:");

		lbltipodiesel = new JLabel("Diesel o Gasolina:");

		lblanio = new JLabel("A\u00F1o Matriculacion:");

		lblcv = new JLabel("CV:");

		txtmodelo = new JTextField();

		txtcv = new JTextField();

		btncrear = new JButton("CREAR");
		btncrear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));

		spinner = new JSpinner();

		txtmatricula = new JTextField();

		tipo = new String[] { "Diesel", "Gasolina" };
		marca = new String[] { "Peugeot", "Dacia", "Citroen", "Volkswagen", "Seat", "Audi", "BMW", "KIA", "Mercedes",
				"Renault", "Ford", "Land Rover", "Mitsubishi", "Jaguar", "Range Rover" };
		color = new String[] { "Rojo", "Azul", "Verde", "Marrón", "Negro", "Blanco", "Veige", "Amarillo", "Lila",
				"Gris" };
		spinnerpuertas = new JSpinner();
		listmarca = new JList(marca);
		listcolor = new JList(color);
		listtipo = new JList(tipo);

		scrollPanemarca = new JScrollPane(listmarca);

		scrollPanecolor = new JScrollPane(listcolor);

		foto = new JLabel("");
		
		 btnempleado = new JButton("<html><br>CREAR PROPIETARIO<br></html>");
		
		 btnempleado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		 btnempleado.setVerticalAlignment(SwingConstants.TOP);

		initialize();

	}

	private void initialize() {

		propiedades();
		eventos();
	}

	private void propiedades() {

		frame3.setBounds(100, 100, 450, 353);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		frame3.getContentPane().add(lblmatricula);
		frame3.getContentPane().add(lblMarca);
		frame3.getContentPane().add(lblModelo);
		frame3.getContentPane().add(lblPuertas);
		frame3.getContentPane().add(lbltipodiesel);
		frame3.getContentPane().add(lblanio);
		frame3.getContentPane().add(lblcv);
		frame3.getContentPane().add(txtmatricula);
		txtmatricula.setColumns(10);
		frame3.getContentPane().add(txtmodelo);
		txtmodelo.setColumns(10);
		txtmodelo.setBounds(99, 162, 90, 26);
		frame3.getContentPane().add(txtcv);
		txtcv.setColumns(10);
		txtcv.setBounds(332, 161, 97, 26);
		lblPuertas.setBounds(25, 214, 90, 14);
		lblPuertas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbltipodiesel.setBounds(200, 126, 133, 14);
		lbltipodiesel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblModelo.setBounds(25, 167, 90, 14);
		lblModelo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblMarca.setBounds(24, 126, 72, 14);
		lblMarca.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblmatricula.setBounds(24, 77, 90, 14);
		lblmatricula.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));

		frame3.getContentPane().add(btncrear);
		frame3.getContentPane().add(txtmatricula);
		txtmatricula.setColumns(10);
		txtmatricula.setBounds(99, 71, 90, 26);

		lblColor = new JLabel("Color:");
		lblColor.setBounds(205, 213, 61, 16);
		lblColor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		frame3.getContentPane().add(lblColor);

		spinner.setModel(new SpinnerNumberModel(2017, 1900, 2017, 1));
		frame3.getContentPane().add(spinner);

		listmarca.setBounds(99, 126, 89, 16);
		frame3.getContentPane().add(scrollPanemarca);
		frame3.getContentPane().add(listtipo);

		listcolor.setBounds(430, 214, -101, 14);
		frame3.getContentPane().add(scrollPanecolor);

		listtipo.setBounds(332, 111, 97, 39);

		lblcv.setBounds(200, 167, 66, 14);
		lblcv.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));

		spinnerpuertas.setBounds(99, 208, 89, 28);
		frame3.getContentPane().add(spinnerpuertas);

		
		btnempleado.setBounds(9, 261, 123, 64);
		frame3.getContentPane().add(btnempleado);
		btnempleado.setVisible(false);

		foto.setIcon(new ImageIcon("/Users/cristinavilas/Desktop/taller3.png"));
		foto.setBounds(34, 6, 444, 319);
		frame3.getContentPane().add(foto);

		scrollPanecolor.setBounds(332, 212, 100, 46);

		scrollPanemarca.setBounds(94, 109, 95, 46);

		spinner.setBounds(332, 75, 107, 20);

		btncrear.setBounds(144, 261, 161, 64);

		lblanio.setBounds(200, 77, 133, 14);
		lblanio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));

	}

	public JFrame getFrame() {
		return frame3;
	}

	private void eventos() {
		btncrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean escorrecto = true;
				int contador = 0;

				/**
				 * Hacemos las validaciones ,y contamos con un contador los
				 * aciertos, si llega al numero total de campos nos creara el
				 * objeto con los atributos introducidos
				 */

				// matricula
				Pattern pat = Pattern.compile("^[0-9]{4}[a-zA-Z]{3}$");
				Matcher mat = pat.matcher(txtmatricula.getText());

				if (txtmatricula.getText().isEmpty()) {

					JOptionPane.showMessageDialog(frame3, "ERROR: Inserte una matricula correcta");
				}
				if (!mat.matches()) {
					JOptionPane.showMessageDialog(frame3, "ERROR: Inserte una matricula correcta");
				} else {
					contador += 1;
				}

				// marca

				String marca = (String) listmarca.getSelectedValue();
				if (marca == null) {
					JOptionPane.showMessageDialog(frame3, "ERROR: Seleccione una marca ");

				} else {

					contador += 1;
				}

				// modelo

				if (txtmodelo.getText().isEmpty()) {

					JOptionPane.showMessageDialog(frame3, "ERROR: Inserte un modelo correcto");
				} else {

					contador += 1;
				}

				// puertas no necesita validacion

				// anho matriculacion tampoco

				// tipo gasoil
				String tipo = (String) listtipo.getSelectedValue();
				if (tipo == null) {

					JOptionPane.showMessageDialog(frame3, "ERROR: Seleccione tipo de combustible");
					escorrecto = false;
				}
				{

					contador += 1;
				}

				// CV

				int numero2 = 0;
				try {
					numero2 = Integer.parseInt(new String(txtcv.getText()));

				} catch (Exception e2) {

					JOptionPane.showMessageDialog(frame3, "ERROR: Los CV deben ser numericas");
					escorrecto = false;

				}

				if (escorrecto) {
					if (numero2 <= 0) {
						JOptionPane.showMessageDialog(frame3, "ERROR: Los CV deben ser >0");

					} else {
						contador += 1;
					}
				}

				// color
				String color = (String) listcolor.getSelectedValue();
				if (color == null) {

					JOptionPane.showMessageDialog(frame3, "ERROR: Seleccione un color ");
				} else {

					contador += 1;
				}

				if (contador == 6) {

					coche = new Vehiculo();

					coche.setMatricula(txtmatricula.getText());
					coche.setMarca(marca);
					coche.setModelo(txtmodelo.getText());
					coche.setNumPuertas((int) spinnerpuertas.getValue());
					coche.setTipoGas(tipo);

					coche.setAnioMatriculacion((int) spinner.getValue());
					coche.setCv((short) numero2);

					coche.setAnioMatriculacion((int) spinner.getValue());

					coche.setColor(color);

					Container.getListaVehiculos().add(coche);

					JOptionPane.showMessageDialog(frame3, "VEHICULO ANHADIDO");
					
					txtmatricula.setEnabled(false);
					scrollPanemarca.setEnabled(false);
					listmarca.setEnabled(false);
					txtmodelo.setEnabled(false);
					spinner.setEnabled(false);
					listtipo.setEnabled(false);
					txtcv.setEnabled(false);
					listcolor.setEnabled(false);
					scrollPanecolor.setEnabled(false);
					btncrear.setEnabled(false);
					
					btnempleado.setVisible(true);

				}

			}
		});
		
		// Accion del boton crear empleado
		
		 btnempleado.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mouseClicked(MouseEvent e) {
			 		
			 			Propietario window=new Propietario();
			 		window.getFrame6().setVisible(true);
			 		frame3.setVisible(false);
			 		//CREACION DE EMPLEADO
			 	}
			 });

	}
}