import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class frame10 extends JFrame{

	JButton SunwayP, IOImall, OneCity, AeonTmnE;
	frame10() {
		//Add icon to the top left corner of frame
		ImageIcon iconImage = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(iconImage);
		icon.setBounds(20, 20, 100, 100);
		
		//Add header to frame
		JLabel shop = new JLabel("SHOP");
		shop.setFont(new Font("Now", Font.BOLD, 30));
		shop.setBounds(20, 120, 120, 50);
		
		//Filter icon button(brings user to 'Filter' frame)
		ImageIcon filterIcon = new ImageIcon("filter.icon.png");
		JButton filter = new JButton(filterIcon);
		filter.setBounds(318, 129, 35, 30);
		filter.setFocusable(false);
		filter.setBackground(Color.WHITE);
		
		//Add image of location map
		ImageIcon map = new ImageIcon("map.image.png");
		JLabel mapPic = new JLabel(map);  
		mapPic.setBounds(22, 165, 334, 250);
		mapPic.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		//Creating location option for "Sunway Pyramid"
		SunwayP = new JButton("Sunway Pyramid                      10km");
		SunwayP.setFont(new Font("Now", Font.PLAIN, 15));
		SunwayP.setBounds(50, 442, 280, 25);
		SunwayP.setBorderPainted(false); //This hides the border of button
		SunwayP.setContentAreaFilled(false); //This makes the button transparent
		SunwayP.setForeground(Color.BLUE);
		
		//Creating location option for "IOI Mall Puchong"
		IOImall = new JButton("IOI Mall Puchong                      12km");
		IOImall.setFont(new Font("Now", Font.PLAIN, 15));
		IOImall.setBounds(50, 473, 280, 25);
		IOImall.setBorderPainted(false); //This hides the border of button
		IOImall.setContentAreaFilled(false); //This makes the button transparent
		IOImall.setForeground(Color.BLUE);
		
		//Creating location option for "One City USJ"
		OneCity = new JButton("One City USJ                            15km");
		OneCity.setFont(new Font("Now", Font.PLAIN, 15));
		OneCity.setBounds(50, 506, 280, 25);
		OneCity.setBorderPainted(false); //This hides the border of button
		OneCity.setContentAreaFilled(false); //This makes the button transparent
		OneCity.setForeground(Color.BLUE);
		
		//Creating location option for "Aeon Mall Taman Esquine"
		AeonTmnE = new JButton("Aeon Mall Taman Esquine        20km");
		AeonTmnE.setFont(new Font("Now", Font.PLAIN, 15));
		AeonTmnE.setBounds(50, 538, 280, 25);
		AeonTmnE.setBorderPainted(false); //This hides the border of button
		AeonTmnE.setContentAreaFilled(false); //This makes the button transparent
		AeonTmnE.setForeground(Color.BLUE);
		
		//Yellow panel that displays list of places to shop for food
		JPanel panel = new JPanel();
		panel.setBounds(22, 430, 330, 140);
		panel.setBackground(new Color(255,222,89));
		panel.add(SunwayP);
		panel.add(IOImall);
		panel.add(OneCity);
		panel.add(AeonTmnE);
		
		//'Back' button (brings user back to homepage)
		JButton back = new JButton("Back");
		back.setBounds(147, 590, 100, 45);
		back.setFocusable(false);
		back.setFont(new Font ("Now", Font.PLAIN, 20));
		back.setBackground(new Color(255,222,89));
		
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
  		f.add(mapPic);
  		f.add(shop);
  		f.add(back);
  		f.add(filter);
  		f.add(panel);
  		
  		//Add ActionListener to button
  		
  		filter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent m) {
				f.dispose();
			if(m.getSource()==filter) {
				new frame11();
			}
			
	}});
  		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			if(e.getSource()==back) {
				new frame3();
			}
			
	}});
  		SunwayP.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent m) {
				f.dispose();
			if(m.getSource()==SunwayP) {
				new frame12();
			}
			
	}});
}
	
		//Main method
		public static void main(String[] args) {
			new frame10();
		
	}

  		
}
