package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Models.Container;
import Models.Vehiculo;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

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
	private JButton btnDatosClientes;
	private JButton btnLeft;
	private JButton btnEditar ;
	private int id=0;
	private JButton btnRigth;
	private JLabel lblNvehiculos;
	private JButton btnFacturacion;
	private JSpinner spinnerNP;
	private JSpinner spinnerAM ;
	public JFrame getFrame8() {
		return frame8;
	}

	public void setFrame8(JFrame frame8) {
		this.frame8 = frame8;
	}

	private JLabel lblaniomatriculacion2;
	private JLabel lblcv2;
	private JTextField textMarca;
	private JTextField textModelo;
	private JTextField textColor;
	private JTextField textComb;
	private JTextField textCv;
	private JTextField txtMatricula;

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
		btnDatosClientes = new JButton("Datos Cliente");
		btnLeft = new JButton("");
		btnEditar = new JButton("Editar");
		btnRigth = new JButton("");
		lblNvehiculos = new JLabel("");
		btnFacturacion = new JButton("<html>Datos <br>Facturaci\u00F3n</html>");
		spinnerNP = new JSpinner();
		spinnerAM = new JSpinner();
		//

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Propiedades();
		eventos();
		Mostrar();
		
	}

	
	private void Propiedades() {

		frame8.setBounds(100, 100, 482, 355);
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame8.getContentPane().setLayout(null);

		lblmatricula.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblmatricula.setBounds(18, 105, 101, 16);
		frame8.getContentPane().add(lblmatricula);

		lblmarca.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
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
		lblDniCliente.setBounds(173, 21, 95, 16);
		frame8.getContentPane().add(lblDniCliente);

		lblvehiculo.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 19));
		lblvehiculo.setBounds(18, 18, 145, 16);
		frame8.getContentPane().add(lblvehiculo);

		btnatras.setBounds(18, 262, 73, 43);
		frame8.getContentPane().add(btnatras);

		
		lblmatricula2.setBounds(102, 105, 101, 16);
		frame8.getContentPane().add(lblmatricula2);

		
		lblmarca2.setBounds(102, 153, 101, 16);
		frame8.getContentPane().add(lblmarca2);

		
		lblmodelo2.setBounds(103, 193, 100, 16);
		frame8.getContentPane().add(lblmodelo2);

		
		lblnpuertas2.setBounds(102, 235, 101, 16);
		frame8.getContentPane().add(lblnpuertas2);

		lblcolor2.setBounds(332, 105, 101, 16);
		frame8.getContentPane().add(lblcolor2);

		lblcombustible2.setBounds(335, 153, 98, 16);
		frame8.getContentPane().add(lblcombustible2);

		lblaniomatriculacion2.setBounds(372, 193, 68, 16);
		frame8.getContentPane().add(lblaniomatriculacion2);

		
		lblcv2.setBounds(273, 235, 61, 16);
		frame8.getContentPane().add(lblcv2);
		
		
		btnLeft.setBounds(18, 66, 34, 23);
		frame8.getContentPane().add(btnLeft);
		
		
		btnRigth.setBounds(111, 66, 34, 23);
		frame8.getContentPane().add(btnRigth);
		
		
		lblNvehiculos.setBounds(55, 66, 53, 23);
		frame8.getContentPane().add(lblNvehiculos);
		
		
		
		
		btnEditar.setBounds(125, 263, 80, 41);
		frame8.getContentPane().add(btnEditar);
		
		
		btnDatosClientes.setBounds(355, 11, 101, 43);
		frame8.getContentPane().add(btnDatosClientes);
		
		
		btnFacturacion.setBounds(355, 262, 99, 43);
		frame8.getContentPane().add(btnFacturacion);
		
		textMarca = new JTextField();
		textMarca.setBounds(102, 152, 86, 20);
		frame8.getContentPane().add(textMarca);
		textMarca.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setBounds(101, 192, 86, 20);
		frame8.getContentPane().add(textModelo);
		textModelo.setColumns(10);
		
		
		spinnerNP.setBounds(102, 234, 61, 20);
		frame8.getContentPane().add(spinnerNP);
		
		textColor = new JTextField();
		textColor.setBounds(332, 104, 86, 20);
		frame8.getContentPane().add(textColor);
		textColor.setColumns(10);
		
		textComb = new JTextField();
		textComb.setBounds(332, 152, 86, 20);
		frame8.getContentPane().add(textComb);
		textComb.setColumns(10);
		
		
		spinnerAM.setModel(new SpinnerNumberModel(2017, 1900, 2017, 1));
		spinnerAM.setBounds(372, 192, 61, 20);
		frame8.getContentPane().add(spinnerAM);
		
		textCv = new JTextField();
		textCv.setBounds(273, 234, 86, 20);
		frame8.getContentPane().add(textCv);
		textCv.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(102, 104, 86, 20);
		frame8.getContentPane().add(txtMatricula);
		txtMatricula.setColumns(10);
		
		textColor.setVisible(false);
		textComb.setVisible(false);
		textCv.setVisible(false);
		textMarca.setVisible(false);
		textModelo.setVisible(false);
		spinnerNP.setVisible(false);
		spinnerAM.setVisible(false);
		txtMatricula.setVisible(false);
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
		
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				txtMatricula.setVisible(true);
				textColor.setVisible(true);
				textComb.setVisible(true);
				textCv.setVisible(true);
				textMarca.setVisible(true);
				textModelo.setVisible(true);
				spinnerNP.setVisible(true);
				spinnerAM.setVisible(true);
				
				
				lblaniomatriculacion2.setVisible(false);
				lblcolor2.setVisible(false);
				lblcombustible2.setVisible(false);
				lblcv2.setVisible(false);
				lblmatricula2.setVisible(false);
				lblmarca2.setVisible(false);
				lblnpuertas2.setVisible(false);
				lblmodelo2.setVisible(false);
				
				
				
			}
		});
	}
	
	
	
       
       
       private void Mostrar() {
    	   String nPuertas;
    	   String Año;
    	   String cv;
   		lblmatricula2.setText(Container.getVehiculosAux().get(id).getMatricula());
   		lblmarca2.setText(Container.getVehiculosAux().get(id).getMarca());
   		lblmodelo2.setText(Container.getVehiculosAux().get(id).getModelo());
   		nPuertas = String.valueOf(Container.getVehiculosAux().get(id).getNumPuertas());
   		lblnpuertas2.setText(nPuertas);
   		lblcolor2.setText(Container.getVehiculosAux().get(id).getColor());
   		lblcombustible2.setText(Container.getVehiculosAux().get(id).getTipoGas());
   		Año = String.valueOf(Container.getVehiculosAux().get(id).getAnioMatriculacion());
   		lblaniomatriculacion2.setText(Año);
   		cv = String.valueOf(Container.getVehiculosAux().get(id).getCv());
   		lblcv2.setText(cv);
    	   
   		
   	}
}
