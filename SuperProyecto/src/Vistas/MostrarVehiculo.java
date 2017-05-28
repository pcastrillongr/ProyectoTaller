package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MostrarVehiculo {

	private JFrame frame8;
	private JLabel lblmatricula;
	private JLabel lblmarca;
	private JLabel lblmodelo;
	private JLabel lblNpuertas;
	private JLabel lblcolor;
	private JLabel lblCombustible;
	private JLabel lblAniomatriculacion;
	private JLabel lblDniCliente;
	private JButton btnatras;
	private JLabel lbcv;
	private JLabel lblvehiculo;
	private JLabel lblmatricula2;
	private JLabel lblmarca2;
	private JLabel lblmodelo2;
	private JLabel lblnpuertas2;
	private JLabel lblcolor2;
	private JLabel lblcombustible2;
	private JLabel lblaniomatriculacion2;
	private JLabel lblcv2;

	public MostrarVehiculo() {
		frame8 = new JFrame();

		lblmatricula = new JLabel("Matricula:");
		lblmarca = new JLabel("Marca:");
		lblmodelo = new JLabel("Modelo:");
		lblNpuertas = new JLabel("N\u00BAPuertas:");
		lblcolor = new JLabel("Color:");
		lblCombustible = new JLabel("Combustible:");
		lblAniomatriculacion = new JLabel("AnioMatriculacion:");
		lblDniCliente = new JLabel("DNI Cliente:");
		btnatras = new JButton("Atras");
		lbcv = new JLabel("CV:");
		lblvehiculo = new JLabel("VEHICULO");

		lblmatricula2 = new JLabel("");

		lblmarca2 = new JLabel("");

		lblmodelo2 = new JLabel("");

		lblnpuertas2 = new JLabel("");

		lblcolor2 = new JLabel("");

		lblcombustible2 = new JLabel("");

		lblaniomatriculacion2 = new JLabel("");

		lblcv2 = new JLabel("");
		//

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Propiedades();
		eventos();

	}

	private void Propiedades() {

		frame8.setBounds(100, 100, 450, 300);
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame8.getContentPane().setLayout(null);

		lblmatricula.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblmatricula.setBounds(18, 105, 101, 16);
		frame8.getContentPane().add(lblmatricula);

		lblmarca.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 13));
		lblmarca.setBounds(18, 153, 61, 16);
		frame8.getContentPane().add(lblmarca);

		lblmodelo.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblmodelo.setBounds(18, 193, 73, 16);
		frame8.getContentPane().add(lblmodelo);

		lblNpuertas.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblNpuertas.setBounds(18, 235, 101, 16);
		frame8.getContentPane().add(lblNpuertas);

		lblcolor.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblcolor.setBounds(228, 105, 61, 16);
		frame8.getContentPane().add(lblcolor);

		lblCombustible.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblCombustible.setBounds(228, 153, 95, 16);
		frame8.getContentPane().add(lblCombustible);

		lblAniomatriculacion.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblAniomatriculacion.setBounds(228, 193, 139, 16);
		frame8.getContentPane().add(lblAniomatriculacion);

		lbcv.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lbcv.setBounds(228, 235, 61, 16);
		frame8.getContentPane().add(lbcv);

		lblDniCliente.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblDniCliente.setBounds(260, 20, 95, 16);
		frame8.getContentPane().add(lblDniCliente);

		lblvehiculo.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 19));
		lblvehiculo.setBounds(70, 18, 145, 16);
		frame8.getContentPane().add(lblvehiculo);

		btnatras.setBounds(377, 249, 73, 29);
		frame8.getContentPane().add(btnatras);

		lblmatricula2 = new JLabel("");
		lblmatricula2.setBounds(102, 105, 101, 16);
		frame8.getContentPane().add(lblmatricula2);

		lblmarca2 = new JLabel("");
		lblmarca2.setBounds(102, 153, 101, 16);
		frame8.getContentPane().add(lblmarca2);

		lblmodelo2 = new JLabel("");
		lblmodelo2.setBounds(103, 193, 100, 16);
		frame8.getContentPane().add(lblmodelo2);

		lblnpuertas2 = new JLabel("");
		lblnpuertas2.setBounds(102, 235, 101, 16);
		frame8.getContentPane().add(lblnpuertas2);

		lblcolor2 = new JLabel("");
		lblcolor2.setBounds(332, 105, 101, 16);
		frame8.getContentPane().add(lblcolor2);

		lblcombustible2 = new JLabel("");
		lblcombustible2.setBounds(335, 153, 98, 16);
		frame8.getContentPane().add(lblcombustible2);

		lblaniomatriculacion2 = new JLabel("");
		lblaniomatriculacion2.setBounds(379, 193, 61, 16);
		frame8.getContentPane().add(lblaniomatriculacion2);

		lblcv2 = new JLabel("");
		lblcv2.setBounds(273, 235, 61, 16);
		frame8.getContentPane().add(lblcv2);
	}

	private void eventos() {

		btnatras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Principal window = new Principal();
				window.getFrame2().setVisible(true);
				frame8.dispose();
			}
		});
	}
}
