import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class frame6 extends JFrame {
	
	frame6(){
		//Add icon to the top left corner of frame
		ImageIcon iconImage = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(iconImage);
		icon.setBounds(20,20, 100, 100);
		
		//Add frame header
		JLabel result = new JLabel("RESULTS");
		result.setFont(new Font("Now", Font.BOLD, 30));
		result.setBounds(20, 120, 150, 100);
		
		//Add nutritional content of scanned food 
		JLabel nutritionContent1 = new JLabel("<html>Carbohydrate<br>Protein<br>Fat<br>Sugar<br>Fiber<br>Energy");
		nutritionContent1.setFont(new Font("Now", Font.PLAIN, 18));
		nutritionContent1.setBounds(10, 175, 200, 180);
		JLabel nutritionContent2 = new JLabel("<html>187g<br>16g<br>10g<br>22g<br>16g<br>333kJ");
		nutritionContent2.setFont(new Font("Now", Font.PLAIN, 18));
		nutritionContent2.setBounds(310, 175, 60, 180);
		
		//Add icon and label for allergen warning for scanned food
		ImageIcon warningIcon = new ImageIcon("warning.icon.png");
		JLabel allergenIcon = new JLabel(warningIcon);
		allergenIcon.setBounds(10, 375, 30, 40);
		
		JTextArea allergenLabel = new JTextArea("*Contains possible allergens such as milk, eggs, almonds and wheat.");
		allergenLabel.setLineWrap(true);
		allergenLabel.setWrapStyleWord(true);
		allergenLabel.setOpaque(false);
		allergenLabel.setEditable(false);
		allergenLabel.setFont(new Font("Now", Font.PLAIN, 15));
		allergenLabel.setBounds(70, 380, 240, 40); 
	    
		//Yellow panel that displays allergen warning message 
		JPanel panel = new JPanel();
		panel.setBounds(12, 375, 350, 50);
		panel.setBackground(new Color(255,222,89));
		panel.add(allergenIcon);
		panel.add(allergenLabel); 
		
		//Add estimated price of scanned food
		JLabel price1 = new JLabel("Estimated Price");
		price1.setFont(new Font("Now", Font.BOLD, 25));
		price1.setBounds(102, 450, 190, 40);
		JLabel price2 = new JLabel("$12");
		price2.setFont(new Font("Now", Font.BOLD, 25));
		price2.setBounds(172, 490, 50, 40);
		
		//'Back' Button(brings user back to scan page)
		JButton back = new JButton("Back");
		back.setBounds(87, 580, 100, 55);
		back.setFocusable(false);
		back.setFont(new Font ("Now", Font.PLAIN, 20));
		back.setBackground(new Color(255,222,89));
		
		//'Next' Button(brings user to second scan page)
		JButton next = new JButton("Next");
		next.setBounds(207, 580, 100, 55);
		next.setFocusable(false);
		next.setFont(new Font ("Now", Font.PLAIN, 20));
		next.setBackground(new Color(255,222,89));
		
		//Construct frame that shows info about scanned food
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setSize(394,700);
		f.setLayout(null);
		f.setResizable(false);
		f.getContentPane().setBackground(Color.WHITE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		//Adding components to frame
		f.add(back);
		f.add(next);
		f.add(icon);
		f.add(result);
		f.add(panel);
		f.add(nutritionContent1);
		f.add(nutritionContent2);
		f.add(price1);
		f.add(price2);
		
		
		//Add ActionListener to buttons
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			if(e.getSource()==next) {
				new frame7(); 
			}
	}});
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent b) {
				f.dispose();
			if(b.getSource()==back) {
				new frame5();
			}
	} });
		
} 
	
		//Main method
		public static void main(String[] args) {
			new frame6();
			
	}
	
} 
