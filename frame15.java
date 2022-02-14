import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame15 implements ActionListener {
	JFrame frame;
	JButton back, done;
	frame15(){
		
		//Importing Food Delta logo and setting it's bound
		ImageIcon logo = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(logo);
		icon.setBounds(20, 20, 100, 100);
		
		//Adding frame heading "RESULT"
		JLabel heading = new JLabel();
		heading.setText("RESULT");
		heading.setFont(new Font("Now Bold", Font.BOLD, 30));
		heading.setBounds(20, 110, 120, 80);
		
		//Adding food item result
		JLabel foodItem = new JLabel();
		foodItem.setText("FOOD:");
		foodItem.setFont(new Font("Now BOLD", Font.BOLD, 25));
		foodItem.setBounds(20, 170, 100, 100);
		JLabel foodItem2 = new JLabel();
		foodItem2.setText("<html><u> Chips </u><html/>");
		foodItem2.setFont(new Font("Now", Font.PLAIN, 20));
		foodItem2.setBounds(20, 205, 100, 100);
		
		//Adding food item weight
		JLabel foodWeight = new JLabel();
		foodWeight.setText("WEIGHT:");
		foodWeight.setFont(new Font("Now BOLD", Font.BOLD, 25));
		foodWeight.setBounds(20, 260, 120, 100);
		JLabel foodWeight2 = new JLabel();
		foodWeight2.setText("<html><u> 500g </u><html/>");
		foodWeight2.setFont(new Font("Now", Font.PLAIN, 20));
		foodWeight2.setBounds(20, 295, 100, 100);
		
		//Adding food item's expiry date
		JLabel bestBefore = new JLabel();
		bestBefore.setText("BEST BEFORE:");
		bestBefore.setFont(new Font("Now BOLD", Font.BOLD, 25));
		bestBefore.setBounds(20, 350, 200, 100);
		JLabel bestBefore2 = new JLabel();
		bestBefore2.setText("<html><u> 10/2/2022 (14 days left) </u><html/>");
		bestBefore2.setFont(new Font("Now", Font.PLAIN, 20));
		bestBefore2.setBounds(20, 385, 250, 100);
		
		//Creating a done button
		done = new JButton("DONE");
		done.setBounds(140, 500, 100, 40);
		done.setFont(new Font("Now Bold", Font.BOLD, 20));
		done.setBackground(new Color(255, 222, 89));
		done.addActionListener(this);
		
		//Creating a back button
		back = new JButton("Back");
		back.setBounds(142, 580, 100, 55);
		back.setFont(new Font("Now", Font.PLAIN, 20));
		back.setBorderPainted(false); //This hides the border of the button
        back.setContentAreaFilled(false); //This makes the button transparent
        back.addActionListener(this);
		
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
		frame.add(icon);frame.add(heading);frame.add(foodItem);frame.add(foodItem2);frame.add(foodWeight);frame.add(foodWeight2);frame.add(bestBefore);
		frame.add(bestBefore2);frame.add(done);frame.add(back);
		
		}
		public static void main(String[] args) {
			new frame15();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			if(e.getSource() == back) {
				new frame14();
		}	
			if(e.getSource() == done) {
				new frame13();
			}
	}
}
