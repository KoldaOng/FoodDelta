import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 

public class frame4 implements ActionListener{
	
	JFrame frame = new JFrame();
	JLabel logo;
	JLabel settings;
	JLabel profile;
	JLabel email;
	JLabel text;
	JLabel emailText;
	JLabel password;
	JLabel passwordText;
	JLabel cpassword;
	JLabel mobile;
	JLabel mobileno;
	JLabel help;
	JButton logout;
	JButton back;
	
	frame4(){
		
		ImageIcon logo1 = new ImageIcon ("FoodDelta.png");
		ImageIcon help1 = new ImageIcon ("help.png");
		logo = new JLabel();
		logo.setIcon(logo1);
		logo.setBounds(20, 20, 100, 100);
		
		settings = new JLabel();
		settings.setText("Settings");
		settings.setBounds(25, 140, 130, 45);
		settings.setFont(new Font("Now",Font.PLAIN,35));
		
		profile = new JLabel();
		profile.setText("Profile");
		profile.setBounds(25, 210, 100, 30);
		profile.setFont(new Font("Now",Font.BOLD,28));
		profile.setForeground(new Color(255, 222, 89));
		
		email = new JLabel();
		email.setText("EMAIL");
		email.setBounds(25, 260, 100, 30);
		email.setFont(new Font("Now",Font.BOLD,20));
		
		emailText = new JLabel();
		emailText.setText("fooddelta1@yahoo.com");
		emailText.setBounds(25, 285, 180, 30);
		emailText.setFont(new Font("Now",Font.PLAIN,15));
		
		password = new JLabel();
		password.setText("PASSWORD");
		password.setBounds(25, 335, 180, 30);
		password.setFont(new Font("Now",Font.BOLD,20));
		
		passwordText = new JLabel();
		passwordText.setText("*******");
		passwordText.setBounds(25, 360, 180, 30);
		passwordText.setFont(new Font("Now",Font.PLAIN,15));
		
		cpassword = new JLabel();
		cpassword.setText("Change password");
		cpassword.setBounds(230, 360, 180, 30);
		cpassword.setFont(new Font("Now",Font.PLAIN,15));
		cpassword.setForeground(Color.BLUE);
		
		mobile = new JLabel();
		mobile.setText("MOBILE NO.");
		mobile.setBounds(25, 410, 180, 30);
		mobile.setFont(new Font("Now",Font.BOLD,20));
		
		mobileno = new JLabel();
		mobileno.setText("010-7334567");
		mobileno.setBounds(25, 435, 100, 30);
		mobileno.setFont(new Font("Now",Font.PLAIN,15));
		
		help = new JLabel();
		help.setIcon(help1);
		help.setText("HELP");
		help.setBounds(25, 485, 180, 60);
		help.setHorizontalTextPosition(JButton.RIGHT);
		help.setVerticalTextPosition(JButton.CENTER);
		help.setIconTextGap(15);
		help.setFont(new Font("Now",Font.BOLD,20));
		
		back = new JButton();
		back.setText("BACK");
		back.setBounds(87, 580, 100, 55);
		back.setBackground(new Color (255,225,89));
		back.setFont(new Font("Now",Font.BOLD,12));
		back.addActionListener(this);
		
		logout = new JButton();
		logout.setText("LOGOUT");
		logout.setBounds(207, 580, 100, 55);
		logout.setBackground(new Color (255,225,89));
		logout.setFont(new Font("Now",Font.BOLD,12));
		logout.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(394,700);
		frame.setTitle("Settings");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.add(logo);
		frame.add(settings);
		frame.add(profile);
		frame.add(email);
		frame.add(emailText);
		frame.add(password);
		frame.add(passwordText);
		frame.add(cpassword);
		frame.add(mobile);
		frame.add(mobileno);
		frame.add(help);
		frame.add(back);
		frame.add(logout);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == logout) {
			new frame1();
			frame.dispose();
		}
		if(ae.getSource() == back) {
			new frame3();
			frame.dispose();
		}
	}
	
	public static void main(String[] args) {
		new frame4();
	}
}
