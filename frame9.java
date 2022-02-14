import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame9 extends JFrame {
	
	frame9() {
		//Add icon to the top left corner of frame
		ImageIcon iconImage = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(iconImage);
		icon.setBounds(20, 20, 100, 100);
		
		//Add location icon
		ImageIcon locationImage = new ImageIcon("location.icon.png");
		JLabel locationIcon = new JLabel(locationImage);
		locationIcon.setBounds(314, 144, 40, 40);
		
		//Add frame header
		JLabel label1 = new JLabel("DONATE");
		label1.setFont(new Font("Now", Font.BOLD, 30));
		label1.setBounds(20, 120, 150, 100);
		
		//List places for donation and distance
		JLabel label2 = new JLabel("<html>Sunway Food Bank<br>Daily Break Food Bank<br>PJ City Food Bank<br>The One Frozen Distributor<br>Food Bank Siswa UITM"
				+ "<br>Food Aid Foundation, KL<br>Food Paradise At 26<br>Kechara Food Bank");
		label2.setFont(new Font("Now", Font.PLAIN, 18));
		label2.setBounds(10, 200, 300, 190);
		JLabel label3 = new JLabel("<html>10km<br>10km<br>11km<br>12km<br>16km<br>19km<br>20km<br>21km");
		label3.setFont(new Font("Now", Font.PLAIN, 18));
		label3.setBounds(310, 200, 90, 190);
		
		//'Back' button(brings user to second result frame)
		JButton back = new JButton("Back");
		back.setBounds(147, 540, 100, 45);
		back.setFocusable(false);
		back.setFont(new Font ("Now", Font.PLAIN, 20));
		back.setBackground(new Color(255,222,89));
		
		//'Return To Homepage' button (brings user back to homepage)
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
  		f.add(icon);
  		//f.add(back);
  		f.add(home);
  		f.add(label1);
  		f.add(locationIcon);
  		f.add(label2);
  		f.add(label3);
		
  		//Add ActionListener to buttons
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			if(e.getSource()==home) {
				new frame3();
			}
			
	}});

		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent b) {
				f.dispose();
			if(b.getSource()==back) {
				new frame8();
			}
			
	}});
}
		
		//Main method
		public static void main(String[] args) {
			new frame9();
		
	}

}
