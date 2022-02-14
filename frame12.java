import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame12 extends JFrame implements ActionListener {
	JFrame frame;
	JButton back;
	frame12(){
		
		//Importing Food Delta logo and setting it's bound
		ImageIcon logo = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(logo);
		icon.setBounds(20, 20, 100, 100);
		
		//Adding frame heading "SUNWAY PYRAMID"
		JLabel heading = new JLabel();
		heading.setText("<html> SUNWAY <br/> PYRAMID</html>");
		heading.setFont(new Font("Now Bold", Font.BOLD, 25));
		heading.setBounds(20, 110, 120, 80);
		
		//Adding subheading "10km"
		JLabel subheading = new JLabel();
		subheading.setText("10km away");
		subheading.setFont(new Font("Now", Font.PLAIN, 15));
		subheading.setBounds(280, 110, 140, 120);
		
		//Adding egg product image and its Quantity, Original Price and Discounted Price
		ImageIcon egg = new ImageIcon("egg.jpg");
		JLabel item1 = new JLabel(egg);
		item1.setBounds(30, 210, 100, 100);
		JLabel eggQty = new JLabel();
		eggQty.setText("1 dozen egg"); //Egg quantity
		eggQty.setFont(new Font("Now Bold", Font.BOLD, 17));
		eggQty.setBounds(195, 195, 100, 100);
		JLabel eggOriginal = new JLabel(); //Egg original price
		eggOriginal.setText("<html><s> RM6.50 </s></html>");
		eggOriginal.setFont(new Font("Now", Font.PLAIN, 15));
		eggOriginal.setBounds(210, 220, 100, 100);
		JLabel eggDis = new JLabel(); //Egg discounted price
		eggDis.setText("RM5.20");
		eggDis.setFont(new Font("Now Bold", Font.BOLD, 17));
		eggDis.setBounds(270, 220, 100, 100);
		
		//Adding potato product image and its Quantity, Original Price and Discounted Price
		ImageIcon potato = new ImageIcon("potato.jpg");
		JLabel item2 = new JLabel(potato);
		item2.setBounds(30, 320, 100, 100);
		JLabel potatoQty = new JLabel();
		potatoQty.setText("1kg potato"); //Potato quantity
		potatoQty.setFont(new Font("Now Bold", Font.BOLD, 17));
		potatoQty.setBounds(195, 310, 100, 100);
		JLabel potatoOriginal = new JLabel(); //Potato original price
		potatoOriginal.setText("<html><s> RM6.00 </s></html>");
		potatoOriginal.setFont(new Font("Now", Font.PLAIN, 15));
		potatoOriginal.setBounds(210, 330, 100, 100);
		JLabel potatoDis = new JLabel(); //Potato discounted price
		potatoDis.setText("RM5.10");
		potatoDis.setFont(new Font("Now Bold", Font.BOLD, 17));
		potatoDis.setBounds(270, 330, 100, 100);
		
		//Adding cucumber product image and its Quantity, Original Price and Discounted Price
		ImageIcon cucumber = new ImageIcon("cucumber.jpg");
		JLabel item3 = new JLabel(cucumber);
		item3.setBounds(30, 430, 100, 100);
		JLabel cucumberQty = new JLabel(); //Cucumber quantity
		cucumberQty.setText("2pcs cucumber");
		cucumberQty.setFont(new Font("Now Bold", Font.BOLD, 17));
		cucumberQty.setBounds(195, 420, 150, 100);
		JLabel cucumberOriginal = new JLabel(); //Cucumber original price
		cucumberOriginal.setText("<html><s> RM5.00 </s></html>");
		cucumberOriginal.setFont(new Font("Now", Font.PLAIN, 15));
		cucumberOriginal.setBounds(210, 440, 100, 100);
		JLabel cucumberDis = new JLabel(); //Cucumber discounted price
		cucumberDis.setText("RM4.10");
		cucumberDis.setFont(new Font("Now Bold", Font.BOLD, 17));
		cucumberDis.setBounds(270, 440, 100, 100);

		//Creating a back button
		back = new JButton("Return to homepage");
		back.setBounds(82, 580, 220, 55);
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
		frame.add(icon);frame.add(heading);frame.add(subheading);frame.add(item1);frame.add(eggQty);frame.add(eggOriginal);frame.add(eggDis);
		frame.add(item2);frame.add(potatoQty);frame.add(potatoOriginal);frame.add(potatoDis);
		frame.add(item3);frame.add(cucumberQty);frame.add(cucumberOriginal);frame.add(cucumberDis);frame.add(back);
	}
	
		/**Main method**/
	public static void main(String[] args) {
		new frame12();
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			if(e.getSource() == back) {
				new frame3();
			}
		}
}