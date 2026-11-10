import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame16 extends JFrame implements ActionListener{

	JButton back, done;
	
	frame16(){
		//Images
		ImageIcon image = new ImageIcon("FoodDelta.png");
		JLabel logo = new JLabel();
		logo.setIcon(image);
		logo.setBounds(20,20,100,100);
		
		ImageIcon image1 = new ImageIcon(new ImageIcon("calendar.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		JLabel calendar = new JLabel();
		calendar.setIcon(image1);
		calendar.setBounds(320,350,40,40);
		
		//Labels
		JLabel header = new JLabel();
		header.setText("INPUT");
		header.setFont(new Font("Now Bold", Font.BOLD, 35));
		header.setBounds(20,120,300,45);
		
		JLabel label1 = new JLabel();
		label1.setText("FOOD:");
		label1.setFont(new Font("Now", Font.BOLD, 20));
		label1.setBounds(20,180,300,20);
		
		JLabel label2 = new JLabel();
		label2.setText("QUANTITY:");
		label2.setFont(new Font("Now", Font.BOLD, 20));
		label2.setBounds(20,260,300,20);
		
		JLabel label3 = new JLabel();
		label3.setText("BEST BEFORE:");
		label3.setFont(new Font("Now", Font.BOLD, 20));
		label3.setBounds(20,340,300,20);
		
		//Text fields
		JTextField food = new JTextField();
		food.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
		food.setBounds(20,200,300,40);
		
		JTextField quantity = new JTextField();
		quantity.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
		quantity.setBounds(20,280,300,40);
		
		JTextField expiry = new JTextField();
		expiry.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
		expiry.setBounds(20,360,300,40);

		//Buttons
		back = new JButton();
		back.setText("BACK");
		back.setFont(new Font("Now", Font.PLAIN, 20));
		back.setBounds(140,620,100,20);
		back.setFocusable(false);
		back.addActionListener(this);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		
		done = new JButton();
		done.setText("DONE");
		done.setFont(new Font("Now", Font.BOLD, 25));
		done.setBounds(128,520,120,30);
		done.setFocusable(false);
		done.addActionListener(this);
		done.setBackground(new Color(255, 222, 89));
		
		//Frame components
		add(logo);
		add(header);
		add(label1);
		add(food);
		add(label2);
		add(quantity);
		add(label3);
		add(expiry);
		add(calendar);
		add(done);
		add(back);
		
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
		new frame16();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.dispose();
			new frame13(); //temporary
		}
		if(e.getSource()==done) {
			this.dispose();
			new frame17();
		}
		
	}
}
