import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 

public class frame5 implements ActionListener{
	
	JFrame frame = new JFrame();
	JLabel logo;
	JLabel scan;
	JLabel food;
	JLabel message;
	JLabel instruction;
	JButton back;
	JButton next;
	
	frame5(){
		
		ImageIcon logo1 = new ImageIcon("FoodDelta.png");
		ImageIcon food1 = new ImageIcon ("bread.jpg");
		
		logo = new JLabel();
		logo.setIcon(logo1);
		logo.setBounds(20, 20, 100, 100);
			
		back = new JButton();
		back.setText("Back");
		back.setBounds(87, 580, 100, 55);
		back.setBackground(new Color (255,225,89));
		back.setFont(new Font("Now",Font.BOLD,12));
		back.addActionListener(this);
		
		next = new JButton();
		next.setText("Next");
		next.setBounds(207, 580, 100, 55);
		next.setBackground(new Color (255,225,89));
		next.setFont(new Font("Now",Font.BOLD,12));
		next.addActionListener(this);
		
		scan = new JLabel();
		scan.setText("Scan");
		scan.setBounds(160, 120, 75, 30);
		scan.setFont(new Font("Now", Font.PLAIN, 30));
		
		food = new JLabel();
		food.setIcon(food1);
		food.setBounds(22, 160, 334, 320);
		food.setBorder(BorderFactory.createLineBorder(new Color(255,225,89),7));
		
		instruction = new JLabel();
		instruction.setText("Please place your food in the frame");
		instruction.setBounds(42, 500, 310, 40);
		instruction.setFont(new Font("Now",Font.PLAIN,18));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(394,700);
		frame.setTitle("Scan");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.add(food);
		frame.add(logo);
		frame.add(back);
		frame.add(next);
		frame.add(scan);
		frame.add(instruction);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == back) {
			new frame3();
			frame.dispose();
		}
		if(ae.getSource() == next) {
			new frame6();
			frame.dispose();
		}
		
	}
	public static void main(String[] args) {
		new frame5();
	}
}
