package Vistas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

	private JFrame frame;
	private JTextField txtusuario;
	private JPasswordField txtpassword;
	private JLabel lblnombre;
	private JLabel lblusuario;
	private JLabel lblpassword;
	private JButton btnentrar;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		
		frame = new JFrame();
		lblnombre = new JLabel("REGISTRO DEL TALLER");
		lblusuario = new JLabel("Usuario");
		txtusuario = new JTextField();
		lblpassword = new JLabel("Password");
		btnentrar = new JButton("ENTRAR");
		txtpassword = new JPasswordField();
		
		initialize();
	}


	private void initialize() {
		
		propiedades();
		eventos();
	
	}
	private void propiedades()
	{
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblnombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblnombre.setBounds(114, 29, 196, 14);
		frame.getContentPane().add(lblnombre);
		
		lblusuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblusuario.setBounds(60, 82, 60, 26);
		frame.getContentPane().add(lblusuario);
		
		txtusuario.setBounds(128, 81, 182, 30);
		frame.getContentPane().add(txtusuario);
		txtusuario.setColumns(10);
		
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblpassword.setBounds(60, 145, 70, 14);
		frame.getContentPane().add(lblpassword);
		
		
		btnentrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnentrar.setBounds(175, 194, 89, 46);
		frame.getContentPane().add(btnentrar);
		
		txtpassword.setBounds(128, 139, 182, 30);
		frame.getContentPane().add(txtpassword);
		
		
		
		
	}
	private void eventos()
	{
		btnentrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				boolean escorrecto=true;
				int pin;
				int contador = 0;
				
				
				if(txtusuario.getText().isEmpty())
				{
					
					JOptionPane.showMessageDialog(frame, "ERROR: El usuario esta vacio");
					escorrecto=false;
					
					
				}
			
				if(new String(txtpassword.getPassword()).isEmpty()){
					JOptionPane.showMessageDialog(frame, "ERROR: La contraseña esta vacia");
					escorrecto=false;
					
				}
				try{
					pin=Integer.parseInt(new String(txtpassword.getPassword()));
					
				}catch(Exception e){
					
					JOptionPane.showMessageDialog(frame, "ERROR: El pin debe ser numerico");
					escorrecto=false;
					
				
				}
				
				if(new String(txtpassword.getPassword()).length()!=4)
				{
					JOptionPane.showMessageDialog(frame, "ERROR: La longitud del PIN no coincide");
					escorrecto=false;
					
				}
				
				
				if(escorrecto){
				try{
					pin=Integer.parseInt(new String(txtpassword.getPassword()));
					
				}catch(Exception e){
					
					JOptionPane.showMessageDialog(frame, "ERROR: El pin debe ser numerico");
					escorrecto=false;
					
				
				}
				
				if(escorrecto)
				{
					Principal window=new Principal();
					window.getFrame2().setVisible(true);
					frame.dispose();
					
				}
				
				
				}
				
				
				
				
				
			}
		});

	
		
			
		
		
	}
}
