package Vistas;
//
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Models.Cliente;
import Models.Container;

public class Propietario1 {

	private JFrame frame6;
	private JButton btnAsignar;
	private JButton btnCrear;
	private JButton btnVolver;
	private JTextField textDni;
	private JButton btnBuscar;
	private JLabel lblaux;
	private JButton btnVolver2;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Propietario1() {
		frame6 = new JFrame();
		btnAsignar = new JButton("<html>Asignar<br>a<br> cliente</html>");
		btnCrear = new JButton("<html>Crear <br> cliente</html>");
		btnVolver = new JButton("Volver");
		btnBuscar = new JButton("Buscar");
		lblaux = new JLabel("");
		textDni = new JTextField();
		btnVolver2 = new JButton("Volver");
		initialize();
	}

	public JFrame getFrame6() {
		return frame6;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		propiedades();
		eventos();

	}

	public void propiedades() {
		frame6.setBounds(100, 100, 450, 300);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.getContentPane().setLayout(null);
		frame6.getContentPane().add(btnAsignar);

		btnAsignar.setBounds(57, 76, 102, 95);
		frame6.getContentPane().add(btnCrear);
		btnCrear.setBounds(261, 76, 102, 95);

		btnVolver.setBounds(169, 206, 89, 45);
		frame6.getContentPane().add(btnVolver);

		lblaux.setBounds(169, 76, 82, 14);
		frame6.getContentPane().add(lblaux);
		lblaux.setVisible(false);

		textDni.setBounds(169, 106, 86, 20);
		frame6.getContentPane().add(textDni);
		textDni.setColumns(10);
		textDni.setVisible(false);
		
		btnBuscar.setBounds(169, 148, 82, 23);
		frame6.getContentPane().add(btnBuscar);

		
		
		btnVolver2.setBounds(169, 206, 89, 45);
		frame6.getContentPane().add(btnVolver2);
		btnBuscar.setVisible(false);
		btnVolver2.setVisible(false);
	}

	public void eventos() {
		btnAsignar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblaux.setVisible(true);
				textDni.setVisible(true);
				btnBuscar.setVisible(true);
				lblaux.setText("Introduzca dni");
                btnVolver.setVisible(false);
                btnVolver2.setVisible(true);
				btnCrear.setVisible(false);
				btnAsignar.setVisible(false);

			}
		});

		btnCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Propietario ventana = new Propietario();
				ventana.getFrame7().setVisible(true);
				frame6.setVisible(false);

			}
		});
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cliente c = new Cliente();
				Container.getListaClientes().add(c);
				if (textDni.getText().isEmpty()) {
					JOptionPane.showConfirmDialog(frame6, "Introduzca dni");
				}
				for (int i = 0; i < Container.getListaClientes().size(); i++) {
					if (Container.getListaClientes().get(i).getNif().equals(textDni.getText())) {
						JOptionPane.showConfirmDialog(frame6,
								"Quiere añadir este vehiculo a el cliente con dni: " + textDni.getText());
					}
				}

			}

		});

		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame6.setVisible(false);
				CrearVehiculo ventana = new CrearVehiculo();
				ventana.getFrame().setVisible(true);
			}
		});
		
		btnVolver2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblaux.setVisible(false);
				textDni.setVisible(false);
				btnBuscar.setVisible(false);
				btnVolver.setVisible(true);
				btnVolver2.setVisible(false);
				btnCrear.setVisible(true);
				btnAsignar.setVisible(true);
				
			}
		});

	}
}
