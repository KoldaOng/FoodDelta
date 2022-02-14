import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame14 implements ActionListener {
	JFrame frame;
	JButton back, next;
	frame14(){
		
		//Importing Food Delta logo and setting it's bound
		ImageIcon logo = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(logo);
		icon.setBounds(20, 20, 100, 100);
		
		//Adding frame heading "SCAN"
		JLabel heading = new JLabel();
		heading.setText("SCAN");
		heading.setFont(new Font("Now Bold", Font.BOLD, 30));
		heading.setBounds(150, 90, 140, 120);
		
		//BorderFactory is used to create border color and set thickness
		Border border = BorderFactory.createLineBorder(new Color(255, 222, 89), 5);
		//Creating a panel to represent scan frame
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setBorder(border);
		panel.setBounds(85, 185, 215, 215);
		
		//Inserting ImageIcon to represent food item that will be scanned
		ImageIcon chips = new ImageIcon("chips.jpg");
		JLabel Item = new JLabel(chips);
		Item.setBounds(92, 192, 200, 200);
		
		//Scanning instruction is added below the scan frame
		JLabel instructions = new JLabel();
		instructions.setText("<html> Please place your food in the frame. <br/> Show the best before date and weight </html>");
		instructions.setFont(new Font("Now", Font.PLAIN, 17));
		instructions.setBounds(60, 270, 350, 350);
	
		//Creating a back button
		back = new JButton("Back");
		back.setBounds(87, 580, 100, 55);
		back.setFont(new Font("Now", Font.PLAIN, 20));
		back.setBackground(new Color(255, 222, 89));
        back.addActionListener(this);
		
        //Creating a next button
      	next = new JButton("Next");
      	next.setBounds(207, 580, 100, 55);
      	next.setFont(new Font("Now", Font.PLAIN, 20));
      	next.setBackground(new Color(255, 222, 89));back.setBackground(new Color(255, 222, 89));
      	next.addActionListener(this);
        
        //Creating a frame
		frame = new JFrame();
		frame.setSize(394,700);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		//Adding components to frame
		frame.add(icon);frame.add(heading);frame.add(Item);frame.add(panel);frame.add(instructions);frame.add(back);frame.add(next);
	}
	
	
	public static void main(String[] args) {
		new frame14();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		//Object back;
		if(e.getSource() == back) {
			new frame13();
		}
		if(e.getSource() == next) {
			new frame15();
		}
		};	
	}
