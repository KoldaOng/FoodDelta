import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPasswordField; 
import javax.swing.JTextField; 
 
public class frame1 extends JFrame implements ActionListener { 
	
	JFrame frame = new JFrame();
	JLabel userID;
	JTextField userIDtext;
	JLabel password;
	JPasswordField passwordText;
	JButton login;
	JLabel message;
	JLabel fpw;
	JLabel label;
	JLabel signUp;
	
	frame1(){
	
		//picture
		ImageIcon image1 = new ImageIcon ("FoodDelta(b).png");
		label = new JLabel();
		label.setIcon(image1);
		label.setBounds(80, 50, 215, 214);
		
		//userID
		userID = new JLabel("Email: ");
		userID.setBounds(55, 310, 90, 100);
		userID.setFont(new Font("Now",Font.BOLD,15));
		
		userIDtext = new JTextField();
		userIDtext.setBounds(150, 349, 150, 20);
		
		//password
		password = new JLabel();
		password.setText("Password: ");
		password.setBounds(55, 300, 200, 200);
		password.setFont(new Font("Now",Font.BOLD,15));
		
		passwordText = new JPasswordField();
		passwordText.setBounds(150, 391, 150, 20);
		
		//login
		login = new JButton("Login");
		login.setBackground(new Color(255,222,89));
		login.setFont(new Font("Now",Font.BOLD,20));
		login.setBounds(135, 450, 100, 40);
		login.addActionListener(this);
		
		//forgot
		fpw = new JLabel("Forgot Password?");
		fpw.setBounds(250, 540, 150, 150);
		fpw.setForeground(Color.BLUE);
		fpw.setFont(new Font("Now", Font.BOLD,13));
		
		//sign up
		signUp = new JLabel("New to the app? Sign up.");
		signUp.setBounds(115, 430, 170, 150);
		signUp.setForeground(Color.BLUE);
		signUp.setFont(new Font("Now", Font.ITALIC,14));
		
		//message
		message = new JLabel("");
		message.setBounds(140,495,150,100);
		message.setFont(new Font("Now", Font.PLAIN,15));
		message.setForeground(Color.RED);
		
		frame.add(label);
		frame.add(userID);
		frame.add(userIDtext);
		frame.add(password);
		frame.add(passwordText);
		frame.add(login);
		frame.add(fpw);
		frame.add(signUp);
		frame.add(message);
		frame.setLayout(null);
		
		frame.setTitle("Login");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(394,700);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		
	}
	
	public static void main(String[] args) {
		new frame1();
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == login) {
			 String userID = userIDtext.getText();
			 String password = passwordText.getText();
			 
		if(userID.trim().equals("FoodDelta") && password.trim().equals("FDadmin")) {
			frame.dispose();
			new frame2();
			
		}else {
			message.setText("Please try again");
		}
			
		}

	}
	
}
