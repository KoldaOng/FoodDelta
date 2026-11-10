import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class frame8 extends JFrame {
	
	frame8() {
		//Add icon to the top left corner of frame
		ImageIcon iconImage = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(iconImage);
		icon.setBounds(20, 20, 100, 100);
		
		//Add frame header
		JLabel result = new JLabel("RESULTS");
		result.setFont(new Font("Now", Font.BOLD, 30));
		result.setBounds(20, 100, 150, 100);
		
		//Add result on environmental effects
		JLabel label1 = new JLabel("<html>Carbon Emission<br>Percentage Wasted");
		label1.setFont(new Font("Now", Font.PLAIN, 18));
		label1.setBounds(3, 130, 300, 180);
		JLabel label2 = new JLabel("<html>20gCo2<br>48%");
		label2.setFont(new Font("Now", Font.PLAIN, 18));
		label2.setBounds(310, 130, 100, 180);
		
		//Display Greenhouse Emmision result
		JTextArea GHG = new JTextArea("Your wastage once a week could contributing up to 4kg to your annual greenhouse gas emissions.");
		GHG.setLineWrap(true);
		GHG.setWrapStyleWord(true);
		GHG.setOpaque(false);
		GHG.setEditable(false);
		GHG.setFont(new Font("Now", Font.PLAIN, 18));
		GHG.setBounds(5, 255, 380, 49);
		
		//Add reminder message on food wastage
		JLabel reminder1 = new JLabel("Think Before You Waste!");
		reminder1.setFont(new Font("Now", Font.BOLD, 25));
		reminder1.setBounds(52, 290, 290, 80);
		
		JTextArea reminder2 = new JTextArea("You can choose to pack your leftover food nicely so that you can still consume on the next day.\r\n"
												+ "\r\n"
												+ "You can also choose to donate if there is any untouched food.");
		reminder2.setLineWrap(true);
	    reminder2.setWrapStyleWord(true);
	    reminder2.setOpaque(false);
	    reminder2.setEditable(false);
	    reminder2.setFont(new Font("Now", Font.PLAIN, 18));
	    reminder2.setBounds(7, 350, 370, 200);
	    
	    //'Donate' button with icon(brings user to the donate frame)
	    ImageIcon donateIcon = new ImageIcon("food.donation.png");
	    JButton donate = new JButton("Donate", donateIcon);
		donate.setBounds(127, 540, 140, 45);
		donate.setFocusable(false);
		donate.setFont(new Font ("Now", Font.PLAIN, 20));
		donate.setBackground(new Color(255,222,89));
		
		//'Return To Homepage' button(brings user to the homepage frame)
		JButton home = new JButton("Return To Homepage");
		home.setBounds(77, 595, 240, 45);
		home.setFocusable(false);
		home.setFont(new Font ("Now", Font.PLAIN, 20));
		home.setBackground(new Color(255,222,89));
	
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
  		f.add(donate);
  		f.add(home);
  		f.add(icon);
  		f.add(GHG);
  		f.add(result);
  		f.add(label1);
  		f.add(label2);
  		f.add(reminder1);
  		f.add(reminder2);
  		
  		//Add ActionListener to buttons
  		donate.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e) {
  				f.dispose();
  			if(e.getSource()==donate) {
  				new frame9();
		}
		
}});

  		home.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent b) {
  				f.dispose();
  			if(b.getSource()==home) {
  				new frame3();
		}
		
}});
}
	
		//Main method
		public static void main(String[] args) {
			new frame8();
		
	}

}
