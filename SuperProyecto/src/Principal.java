import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal {

	private JFrame frame2;
	private JButton btnbuscar;
	private JButton btncrear;

	public Principal() {

		JFrame frame2 = new JFrame();
		btnbuscar = new JButton("<html>  BUSCAR<br/><br/>VEHICULO</html>");
		btncrear = new JButton("<html>  CREAR<br/><br/>VEHICULO</html>");

		initialize();
	}

	public JFrame getFrame2() {
		return frame2;
	}

	private void initialize() {

		propiedades();
		eventos();
	}

	private void propiedades() {
		
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admincenec\\Desktop\\MIDAS.png"));
		frame2.getContentPane().setLayout(null);

		btnbuscar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnbuscar.setBounds(64, 76, 97, 108);
		frame2.getContentPane().add(btnbuscar);

		btncrear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btncrear.setBounds(271, 76, 97, 108);
		frame2.getContentPane().add(btncrear);
	}

	private void eventos() {

		
		btncrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
	}
}
