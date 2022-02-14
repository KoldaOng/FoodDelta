import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class frame13 extends JFrame implements ActionListener {
	JFrame frame;
	JButton bt1, bt2, bt3, bt4, back;
	frame13(){
		
		//Importing Food Delta logo and setting it's bound
		ImageIcon logo = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(logo);
		icon.setBounds(20, 20, 100, 100);
		
		//Adding frame heading "TRACE"
		JLabel heading = new JLabel();
		heading.setText("TRACE");
		heading.setFont(new Font("Now Bold", Font.BOLD, 30));
		heading.setBounds(20, 110, 120, 80);
		
		//Creating a button for scanning option
		ImageIcon scan = new ImageIcon("scan.png");
		bt1 = new JButton("SCAN");
		bt1.setFont(new Font("Now Bold", Font.BOLD, 20));
		bt1.setIcon(scan);
		bt1.setIconTextGap(100);
		bt1.setHorizontalAlignment(SwingConstants.CENTER);
		bt1.setBorderPainted(false); //This hides the border of the button
        bt1.setContentAreaFilled(false); //This makes the button transparent
		bt1.setBounds(35, 180, 300, 90);
		bt1.addActionListener(this);

		//Creating a button for inputting option
		ImageIcon input = new ImageIcon("input.png");
		bt2 = new JButton("INPUT");
		bt2.setFont(new Font("Now Bold", Font.BOLD, 20));
		bt2.setIcon(input);
		bt2.setIconTextGap(100);
		bt2.setHorizontalAlignment(SwingConstants.CENTER);
		bt2.setBorderPainted(false); //This hides the border of the button
		bt2.setContentAreaFilled(false); //This makes the button transparent
		bt2.setBounds(35, 280, 300, 90);
		bt2.addActionListener(this);
		
		//Creating a button for ingredients option
		ImageIcon ingredients = new ImageIcon("ingredients.png");
		bt3 = new JButton("<html> CHECK <br/> INGREDIENTS </html>");
		bt3.setFont(new Font("Now Bold", Font.BOLD, 18));
		bt3.setIcon(ingredients);
		bt3.setIconTextGap(65);
		bt3.setHorizontalAlignment(SwingConstants.RIGHT);
		bt3.setBorderPainted(false); //This hides the border of the button
		bt3.setContentAreaFilled(false); //This makes the button transparent
		bt3.setBounds(35, 380, 300, 90);
		bt3.addActionListener(this);
		
		//Creating button for food consumed option
		ImageIcon food = new ImageIcon("tomato.jpg");
		bt4 = new JButton("<html> FOOD <br/> CONSUMED </html>");
		bt4.setFont(new Font("Now Bold", Font.BOLD, 20));
		bt4.setIcon(food);
		bt4.setIconTextGap(70);
		bt4.setHorizontalAlignment(SwingConstants.RIGHT);
		bt4.setBorderPainted(false); //This hides the border of the button
		bt4.setContentAreaFilled(false); //This makes the button transparent
		bt4.setBounds(35, 480, 300, 90);
		bt4.addActionListener(this);
		
		//Creating back button
		back = new JButton("Back");
		back.setBounds(142, 580, 100, 55);
		back.setFont(new Font("Now", Font.PLAIN, 20));
		back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(this);
		
        //Creating frame
		frame = new JFrame();
		frame.setSize(394,700);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		//Adding components to frame
		frame.add(icon);frame.add(heading);frame.add(bt1);frame.add(bt2);frame.add(bt3);frame.add(bt4);
		frame.add(back);
	}
	
	public static void main(String[] args) {
		new frame13();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		if(e.getSource() == bt1) {
			new frame14();
		}
		if(e.getSource() == bt2) {
			new frame16();
		}
		if(e.getSource() == bt3) {
			new frame17();
		}
		if(e.getSource() == bt4) {
			new frame19();
		}
		if(e.getSource() == back) {
			new frame3();
		}
		
	}
}
