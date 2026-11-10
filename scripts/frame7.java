import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame7 extends JFrame {
	
	frame7() {
		//Add icon to the top left corner of frame
		ImageIcon iconImage = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(iconImage);
		icon.setBounds(20, 20, 100, 100);
		
		//Add frame header
		JLabel scan = new JLabel("Scan");
		scan.setBounds(160, 120, 75, 30);
		scan.setFont(new Font("Now", Font.BOLD, 30));
		
		//Add image of scanned food
		ImageIcon bread = new ImageIcon("CutBread.png");
		JLabel breadPic = new JLabel(bread);
		breadPic.setBounds(22, 160, 334, 320);
		breadPic.setBorder(BorderFactory.createLineBorder(new Color(255,222,89), 7));
		
		//Add instruction for user to scan food
	    JLabel instruction = new JLabel("Please place your food in the frame");
	    instruction.setFont(new Font("Now", Font.PLAIN, 18));
	    instruction.setBounds(42, 500, 310, 40);
	    
	    //'Back' button(brings user back to result page)
	    JButton back = new JButton("Back");
		back.setBounds(87, 580, 100, 55);
		back.setFocusable(false);
		back.setFont(new Font ("Now", Font.PLAIN, 20));
		back.setBackground(new Color(255,222,89));
		
		//'Next'button (brings user to next result page)
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
  		f.add(scan);
  		f.add(breadPic);
  		f.add(instruction);
  		f.add(back);
  		f.add(next);
  		
  		//Add ActionListener to buttons
  		next.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			f.dispose();
		if(e.getSource()==next) {
			new frame8();
		}
		
		}});

  		back.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent b) {
			f.dispose();
		if(b.getSource()==back) {
			new frame6();
		}
		
		}});
 }
	
		//Main method
		public static void main(String[] args) {
			new frame7();
		
	} 

}
