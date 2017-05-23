import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

public class Principal {

	private JFrame frame2;


	public Principal() {
		
		frame2 = new JFrame();
		frame2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admincenec\\Desktop\\MIDAS.png"));
		frame2.getContentPane().setLayout(null);
		
		JButton btnbuscar = new JButton("<html>  BUSCAR<br/><br/>VEHICULO</html>");
		btnbuscar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnbuscar.setBounds(64, 76, 97, 108);
		frame2.getContentPane().add(btnbuscar);
		
		JButton btnNewButton_1 = new JButton("<html>  CREAR<br/><br/>VEHICULO</html>");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(271, 76, 97, 108);
		frame2.getContentPane().add(btnNewButton_1);
		initialize();
	}

	public JFrame getFrame2() {
		return frame2;
	}

	private void initialize() {
	
		propiedades();
	}
	private void propiedades()
	{
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
