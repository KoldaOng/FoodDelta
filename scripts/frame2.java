import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField; 
import javax.swing.JOptionPane;

public class frame2 implements ActionListener {

	JFrame frame = new JFrame();
	JButton getcode;
	JButton confirm;
	JLabel message;
	JLabel logo;
	JTextField enterpin;
	JLabel message2;
	
	frame2(){
		
		ImageIcon image1 = new ImageIcon("FoodDelta(b).png");
		logo = new JLabel();
		logo.setIcon(image1);
		logo.setBounds(80, 50, 215, 214);
		
		getcode = new JButton();
		getcode.setText("Get code");
		getcode.addActionListener(this);
		getcode.setBounds(220, 370, 150, 30);
		getcode.setBackground(new Color(255,222,89));
		getcode.setFont(new Font("Now",Font.BOLD,20));
		
		enterpin = new JTextField();
		enterpin.setBounds(50, 370, 150, 30);
		
		message2 = new JLabel("");
		message2.setBounds(95,425,200,30);
		message2.setFont(new Font("Now", Font.PLAIN,15));
		message2.setForeground(Color.RED);
		
		confirm = new JButton();
		confirm.setText("Confirm");
		confirm.addActionListener(this);
		confirm.setBounds(125, 480, 150, 30);
		confirm.setBackground(new Color(255,222,89));
		confirm.setFont(new Font("Now",Font.BOLD,20));
		
		message = new JLabel();
		message.setText("Please enter 6 digit pin");
		message.setFont(new Font("Now", Font.PLAIN,15));
		message.setBounds(115,320,200,25);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(394,700);
		frame.setTitle("Confirmation");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.add(getcode);
		frame.add(confirm);
		frame.add(message);
		frame.add(logo);
		frame.add(enterpin);
		frame.add(message2);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == getcode) {
			JOptionPane.showMessageDialog(null, "Your pin is 103756");
		}
		if (e.getSource() == confirm) {
			String message = enterpin.getText();
			if(message.trim().equals("103756")) {
				new frame3();
				frame.dispose();
			}
			else {
				message2.setText("Wrong pin. Please try again.");
			}
		}
	}
	
	public static void main(String[] args) {
		new frame2();
	}

	

}
