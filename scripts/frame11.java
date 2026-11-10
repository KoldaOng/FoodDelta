import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame11 extends JFrame implements ActionListener {
	JFrame frame;
	JButton back, SunwayP, IOImall, OneCity, AeonTmnE;
	frame11(){
		
		//Importing Food Delta logo and setting it's bound
		ImageIcon logo = new ImageIcon("FoodDelta.png");
		JLabel icon = new JLabel(logo);
		icon.setBounds(20, 20, 100, 100);
		
		//Adding frame heading "FILTER"
		JLabel heading = new JLabel();
		heading.setText("FILTER");
		heading.setFont(new Font("Now Bold", Font.BOLD, 30));
		heading.setBounds(20, 110, 120, 80);
		
		//Adding subheading "Distance"
		JLabel distance = new JLabel();
		distance.setText("Distance");
		distance.setFont(new Font("Now", Font.PLAIN, 20));
		distance.setBounds(20, 160, 120, 100);
		
		//Creating a label to show distance range selected
		JLabel km = new JLabel();
		km.setFont(new Font("Now", Font.PLAIN, 17));
		km.setText("0km");
		km.setBounds(317, 196, 100, 100);
		//Adding a slider to select distance range
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
		slider.setOpaque(false); //Set slider frame transparent
		slider.setBounds(25, 225, 280, 50);
		//Adding a ChangeListener to get changed value on slider and displaying to user
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if(!slider.getValueIsAdjusting()) {
					km.setText(slider.getValue() + "km");
				}
			}
		});
		
		//Creating a sort subheading along with icon
		ImageIcon sort = new ImageIcon("sort.png");
		JLabel sortBy = new JLabel();
		sortBy.setText("Sort");
		sortBy.setIcon(sort);
		sortBy.setFont(new Font("Now", Font.PLAIN, 20));
		sortBy.setHorizontalTextPosition(JLabel.LEFT);
		sortBy.setVerticalTextPosition(JLabel.CENTER);
		sortBy.setIconTextGap(5);
		sortBy.setBounds(20, 250, 100, 100);
		
		//BorderFactory is used to create border color and set thickness
		Border border = BorderFactory.createLineBorder(new Color(255, 222, 89), 2);
		//Creating a distance option button for sorting function
		JButton distanceBT = new JButton("Distance");
		distanceBT.setFont(new Font("Now", Font.PLAIN, 20));
		distanceBT.setContentAreaFilled(false); //This makes the button transparent
		distanceBT.setBorder(border);
		distanceBT.setBounds(45, 330, 110, 35);
		
		//Creating a discount option button for sorting function
		JButton discountBT = new JButton("Discount");
		discountBT.setFont(new Font("Now", Font.PLAIN, 20));
		discountBT.setContentAreaFilled(false); //This makes the button transparent
		discountBT.setBorder(border);
		discountBT.setBounds(220, 330, 110, 35);
		
		//Creating a subheading "RESULTS"
		JLabel heading2 = new JLabel();
		heading2.setText("<html><u> RESULTS </u><html/>");
		heading2.setFont(new Font("Now Bold", Font.BOLD, 30));
		heading2.setBounds(20, 340, 120, 120);
		
		//Creating a panel for prompted result
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 89));
		panel.setBounds(35, 430, 310, 145);
		
		//Creating location option for "Sunway Pyramid"
		SunwayP = new JButton("Sunway Pyramid                      10km");
		SunwayP.setFont(new Font("Now", Font.PLAIN, 15));
		SunwayP.setBounds(50, 442, 280, 25);
		SunwayP.setBorderPainted(false); //This hides the border of button
		SunwayP.setContentAreaFilled(false); //This makes the button transparent
		SunwayP.setForeground(Color.BLUE);
		SunwayP.addActionListener(this);
		
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

		//Creating back button
		back = new JButton("Back");
		back.setBounds(142, 580, 100, 55);
		back.setFont(new Font("Now", Font.PLAIN, 20));
		back.setBorderPainted(false); //This hides the border of button
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
		frame.add(icon);frame.add(heading);frame.add(distance);frame.add(slider);frame.add(km);frame.add(sortBy);frame.add(distanceBT);frame.add(discountBT);
		frame.add(heading2);frame.add(SunwayP);frame.add(IOImall);frame.add(OneCity);frame.add(AeonTmnE);frame.add(panel);frame.add(back);
	}
	
	public static void main(String[] args) {
		new frame11();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		if(e.getSource() == SunwayP) {
			new frame12();
		}
		if(e.getSource()== back) {
			new frame10();
		}
	}

}
