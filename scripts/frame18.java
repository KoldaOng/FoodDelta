import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


public class frame18 extends JFrame implements ActionListener{

	JButton back;
	
	frame18(){
		
		//Images
		ImageIcon image = new ImageIcon("FoodDelta.png");
		JLabel logo = new JLabel();
		logo.setIcon(image);
		logo.setBounds(20,20,100,100);
		
		ImageIcon timer = new ImageIcon(new ImageIcon("timer.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		
		//Labels
		JLabel header = new JLabel();
		header.setText("RECIPE");
		header.setFont(new Font("Now Bold", Font.BOLD, 35));
		header.setBounds(20,120,300,45);
				
		//Panel Components
		JLabel recipeName1 = new JLabel();
		recipeName1.setText("CAKE");
		recipeName1.setFont(new Font("Now", Font.BOLD, 15));
		recipeName1.setForeground(Color.BLUE.darker());
		recipeName1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		recipeName1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try 
                {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/840D3AcTmcM"));
                } 
                catch (IOException | URISyntaxException e1) 
                {
                    e1.printStackTrace();
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                recipeName1.setText("CAKE");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                recipeName1.setText("CAKE");
            }
        });
		
		JLabel list1 = new JLabel();
		list1.setText("INGREDIENTS:");
		list1.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel time1 = new JLabel();
		time1.setText("1 hr");
		time1.setFont(new Font("Now", Font.PLAIN, 15));
		time1.setIcon(timer);
		time1.setHorizontalTextPosition(JLabel.RIGHT);
		time1.setIconTextGap(10);
		
		JLabel ing1 = new JLabel();
		ing1.setText("Egg");
		ing1.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel recipeName2 = new JLabel();
		recipeName2.setText("FRIED RICE");
		recipeName2.setFont(new Font("Now", Font.BOLD, 15));
		recipeName2.setForeground(Color.BLUE.darker());
		recipeName2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		recipeName2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try 
                {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/SGBP3sG3a9Y"));
                } 
                catch (IOException | URISyntaxException e1) 
                {
                    e1.printStackTrace();
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                recipeName2.setText("FRIED RICE");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                recipeName2.setText("FRIED RICE");
            }
        });
		
		JLabel list2 = new JLabel();
		list2.setText("INGREDIENTS:");
		list2.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel time2 = new JLabel();
		time2.setText("15 min");
		time2.setFont(new Font("Now", Font.PLAIN, 15));
		time2.setIcon(timer);
		time2.setHorizontalTextPosition(JLabel.RIGHT);
		time2.setIconTextGap(10);
		
		JLabel ing2 = new JLabel();
		ing2.setText("Egg");
		ing2.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel recipeName3 = new JLabel();
		recipeName3.setText("FRIED EGG");
		recipeName3.setFont(new Font("Now", Font.BOLD, 15));
		recipeName3.setForeground(Color.BLUE.darker());
		recipeName3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		recipeName3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try 
                {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/X5oD_thIk3c"));
                } 
                catch (IOException | URISyntaxException e1) 
                {
                    e1.printStackTrace();
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                recipeName3.setText("FRIED EGG");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                recipeName3.setText("FRIED EGG");
            }
        });
		
		JLabel list3 = new JLabel();
		list3.setText("INGREDIENTS:");
		list3.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel time3 = new JLabel();
		time3.setText("2 min");
		time3.setFont(new Font("Now", Font.PLAIN, 15));
		time3.setIcon(timer);
		time3.setHorizontalTextPosition(JLabel.RIGHT);
		time3.setIconTextGap(10);
		
		JLabel ing3 = new JLabel();
		ing3.setText("Egg");
		ing3.setFont(new Font("Now", Font.PLAIN, 15));
		
		//Panels
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 222, 89));
		panel1.setLayout(new GridLayout(2,2,5,5));
		panel1.setBounds(20,180,334,115);
		panel1.add(recipeName1);
		panel1.add(list1);
		panel1.add(time1);
		panel1.add(ing1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 222, 89));
		panel2.setLayout(new GridLayout(2,2,5,5));
		panel2.setBounds(20,320,334,115);
		panel2.add(recipeName2);
		panel2.add(list2);
		panel2.add(time2);
		panel2.add(ing2);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(255, 222, 89));
		panel3.setLayout(new GridLayout(2,2,5,5));
		panel3.setBounds(20,460,334,115);
		panel3.add(recipeName3);
		panel3.add(list3);
		panel3.add(time3);
		panel3.add(ing3);
		
		//Buttons
		back = new JButton();
		back.setText("BACK");
		back.setFont(new Font("Now", Font.PLAIN, 20));
		back.setBounds(142,620,100,20);
		back.setFocusable(false);
		back.addActionListener(this);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		
		//Frame components
		add(logo);
		add(header);
		add(panel1);
		add(panel2);
		add(panel3);
		add(back);
		
		//Frame Characteristics
		getContentPane().setBackground(new Color(255,255,255));
		setLayout(null);
		setSize(394,700);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Testing
	public static void main(String[] args) {
		new frame18();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.dispose();
			new frame17();
		}
		
	}
	
	
}
