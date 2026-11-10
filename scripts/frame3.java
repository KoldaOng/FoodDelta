import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 

public class frame3 implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton settings;
	JButton scan;
	JButton shop;
	JButton trace;
	JButton donate;
	JLabel help;
	JLabel member;
	JLabel logo;
	
	frame3(){
		
		ImageIcon settings1 = new ImageIcon("Settings.png");
		ImageIcon donate1 = new ImageIcon("Donate.png");
		ImageIcon scan1 = new ImageIcon("Scan.png");
		ImageIcon shop1 = new ImageIcon("Shop.png");
		ImageIcon trace1 = new ImageIcon("Trace.png");
		ImageIcon logo1 = new ImageIcon("FoodDelta.png");
		ImageIcon qr = new ImageIcon("QR.png");
		
		logo = new JLabel();
		logo.setIcon(logo1);
		logo.setBounds(20, 20, 100, 100);
		
		settings = new JButton();
		settings.setIcon(settings1);
		settings.setText("Settings");
		settings.setFont(new Font("Times New Roman",Font.PLAIN,12));
		settings.setBounds(280, 30, 80, 70);
		settings.setContentAreaFilled(false);
		settings.setHorizontalTextPosition(JButton.CENTER);
		settings.setVerticalTextPosition(JButton.BOTTOM);
		settings.addActionListener(this);
		
		member = new JLabel();
		member.setIcon(qr);
		member.setBounds(87, 150, 250, 250);
		member.setText("Member ID: 2202100304");
		member.setFont(new Font("Times New Roman",Font.PLAIN,15));
		member.setHorizontalTextPosition(JButton.CENTER);
		member.setVerticalTextPosition(JButton.BOTTOM);
		member.setIconTextGap(20);
		
		help = new JLabel();
		help.setText("How We Can Help You?");
		help.setFont(new Font("Now",Font.BOLD,17));
		help.setBounds(100, 460, 350, 50);
		
		scan = new JButton();
		scan.setIcon(scan1);
		scan.setBounds(10, 510, 80, 90);
		scan.setText("Scan");
		scan.setFont(new Font("Now",Font.BOLD,17));
		scan.setHorizontalTextPosition(JButton.CENTER);
		scan.setVerticalTextPosition(JButton.BOTTOM);
		scan.setContentAreaFilled(false);
		scan.addActionListener(this);
		
		shop = new JButton();
		shop.setIcon(shop1);
		shop.setBounds(105, 510, 80, 90);
		shop.setText("Shop");
		shop.setFont(new Font("Now",Font.BOLD,17));
		shop.setHorizontalTextPosition(JButton.CENTER);
		shop.setVerticalTextPosition(JButton.BOTTOM);
		shop.setContentAreaFilled(false);
		shop.addActionListener(this);
		
		trace = new JButton();
		trace.setIcon(trace1);
		trace.setBounds(195, 510, 80, 90);
		trace.setText("Trace");
		trace.setFont(new Font("Now",Font.BOLD,17));
		trace.setHorizontalTextPosition(JButton.CENTER);
		trace.setVerticalTextPosition(JButton.BOTTOM);
		trace.setContentAreaFilled(false);
		trace.addActionListener(this);
		
		donate = new JButton();
		donate.setIcon(donate1);
		donate.setBounds(290, 510, 80, 90);
		donate.setText("Donate");
		donate.setFont(new Font("Now",Font.BOLD,13));
		donate.setHorizontalTextPosition(JButton.CENTER);
		donate.setVerticalTextPosition(JButton.BOTTOM);
		donate.setContentAreaFilled(false);
		donate.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(394,700);
		frame.setTitle("Main Menu");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.add(logo);
		frame.add(settings);
		frame.add(member);
		frame.add(help);
		frame.add(scan);
		frame.add(shop);
		frame.add(trace);
		frame.add(donate);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == settings) {
			new frame4();
			frame.dispose();
		}
		if (e.getSource() == scan) {
			new frame5();
			frame.dispose();
		}
		if (e.getSource() == donate) {
			new frame20();
			frame.dispose();
		}
		if (e.getSource() == trace) {
			new frame13();
			frame.dispose();
		}
		if (e.getSource() == shop) {
			new frame10();
			frame.dispose();
		}
	}
	
	public static void main(String[] args) {
		new frame3();
	}
}
