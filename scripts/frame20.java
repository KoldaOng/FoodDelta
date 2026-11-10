import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame20 extends JFrame implements ActionListener{
	
	JButton homepage;
	
	frame20(){
		
		super("Donation");
		
		//Images
		ImageIcon image = new ImageIcon("FoodDelta.png");
		JLabel logo = new JLabel();
		logo.setIcon(image);
		logo.setBounds(20,20,100,100);
		
		//Pseudo table starts here
		ImageIcon location = new ImageIcon(new ImageIcon("location.jpg").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));//Resizes image to intended size
		JLabel headerIcon = new JLabel();
		headerIcon.setIcon(location);
		headerIcon.setBounds(304,0,30,30);
		
		JLabel header = new JLabel();
		header.setText("DONATION");
		header.setFont(new Font("Now Bold", Font.PLAIN, 25));
		header.setBounds(0,0,200,30);
		
		JLabel r1c1 = new JLabel(); //Row 1, Column 1; r = row, c = column
		r1c1.setText("Sunway Pyramid");
		r1c1.setFont(new Font("Now", Font.PLAIN, 15));
		r1c1.setBounds(0,40,200,20);
		
		JLabel r1c2 = new JLabel();
		r1c2.setText("10km");
		r1c2.setFont(new Font("Now", Font.PLAIN, 15));
		r1c2.setBounds(294,40,200,20);
		
		JLabel r2c1 = new JLabel();
		r2c1.setText("IOI Mall Puchong");
		r2c1.setFont(new Font("Now", Font.PLAIN, 15));
		r2c1.setBounds(0,65,200,20);
		
		JLabel r2c2 = new JLabel();
		r2c2.setText("12km");
		r2c2.setFont(new Font("Now", Font.PLAIN, 15));
		r2c2.setBounds(294,65,200,20);
		
		JLabel r3c1 = new JLabel();
		r3c1.setText("One City USJ");
		r3c1.setFont(new Font("Now", Font.PLAIN, 15));
		r3c1.setBounds(0,90,200,20);
		
		JLabel r3c2 = new JLabel();
		r3c2.setText("15km");
		r3c2.setFont(new Font("Now", Font.PLAIN, 15));
		r3c2.setBounds(294,90,200,20);
		
		JLabel r4c1 = new JLabel();
		r4c1.setText("Aeon Mall Taman Equine");
		r4c1.setFont(new Font("Now", Font.PLAIN, 15));
		r4c1.setBounds(0,115,200,20);
		
		JLabel r4c2 = new JLabel();
		r4c2.setText("20km");
		r4c2.setFont(new Font("Now", Font.PLAIN, 15));
		r4c2.setBounds(294,115,200,20);
		
		JLabel r5c1 = new JLabel();
		r5c1.setText("Paradigm Mall");
		r5c1.setFont(new Font("Now", Font.PLAIN, 15));
		r5c1.setBounds(0,140,200,20);
		
		JLabel r5c2 = new JLabel();
		r5c2.setText("14km");
		r5c2.setFont(new Font("Now", Font.PLAIN, 15));
		r5c2.setBounds(294,140,200,20);
		
		JLabel r6c1 = new JLabel();
		r6c1.setText("IOI City Mall");
		r6c1.setFont(new Font("Now", Font.PLAIN, 15));
		r6c1.setBounds(0,165,200,20);
		
		JLabel r6c2 = new JLabel();
		r6c2.setText("23km");
		r6c2.setFont(new Font("Now", Font.PLAIN, 15));
		r6c2.setBounds(294,165,200,20);
		
		JLabel r7c1 = new JLabel();
		r7c1.setText("Mid Valley");
		r7c1.setFont(new Font("Now", Font.PLAIN, 15));
		r7c1.setBounds(0,190,200,20);
		
		JLabel r7c2 = new JLabel();
		r7c2.setText("27km");
		r7c2.setFont(new Font("Now", Font.PLAIN, 15));
		r7c2.setBounds(294,190,200,20);
		
		JLabel r8c1 = new JLabel();
		r8c1.setText("Sunway Velocity");
		r8c1.setFont(new Font("Now", Font.PLAIN, 15));
		r8c1.setBounds(0,215,200,20);
		
		JLabel r8c2 = new JLabel();
		r8c2.setText("30km");
		r8c2.setFont(new Font("Now", Font.PLAIN, 15));
		r8c2.setBounds(294,215,200,20);
		//Pseudo table ends here
		
		//Panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,255,255));
		panel.setBounds(20,120,334,350);
		panel.add(header);
		panel.add(headerIcon);
		panel.setLayout(null);
		panel.add(r1c1);
		panel.add(r1c2);
		panel.add(r2c1);
		panel.add(r2c2);
		panel.add(r3c1);
		panel.add(r3c2);
		panel.add(r4c1);
		panel.add(r4c2);
		panel.add(r5c1);
		panel.add(r5c2);
		panel.add(r6c1);
		panel.add(r6c2);
		panel.add(r7c1);
		panel.add(r7c2);
		panel.add(r8c1);
		panel.add(r8c2);
		
		//Buttons		
		homepage = new JButton();
		homepage.setText("RETURN TO HOMEPAGE");
		homepage.setFont(new Font("Now", Font.PLAIN, 20));
		homepage.setBounds(58,550,270,20);
		homepage.setFocusable(false);
		homepage.addActionListener(this);
		homepage.setBorderPainted(false);
		homepage.setBackground(new Color(255,222,89));
		
		//Main components of the frame
		add(logo);
		add(panel);
		add(homepage);
		
		//Frame Characteristics
		getContentPane().setBackground(new Color(255,255,255));
		setLayout(null);
		setSize(394,700);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Testing
	public static void main(String[] args) {
		new frame20();
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource()==homepage) {
			this.dispose();
			new frame3(); //Goes back to homePage of the app
		}
	}
}
