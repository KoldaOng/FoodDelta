import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame19 extends JFrame implements ActionListener{
	
	JButton back;
	
	frame19(){
		
		//Images
		ImageIcon image = new ImageIcon("FoodDelta.png");
		JLabel logo = new JLabel();
		logo.setIcon(image);
		logo.setBounds(20,20,100,100);
		
		//Labels
		JLabel header = new JLabel();
		header.setText("CONSUMED");
		header.setFont(new Font("Now Bold", Font.BOLD, 35));
		header.setBounds(20,120,300,45);

		JLabel header2 = new JLabel();
		header2.setText("FOOD");
		header2.setFont(new Font("Now Bold", Font.BOLD, 35));
		header2.setBounds(20,155,300,45);
		
		JLabel header3 = new JLabel();
		header3.setText("(Past 7 Days)");
		header3.setFont(new Font("Now", Font.PLAIN, 15));
		header3.setBounds(244,175,200,30);
		
		//Panel components
		JLabel foodName1 = new JLabel();
		foodName1.setText("CUCUMBER");
		foodName1.setFont(new Font("Now", Font.BOLD, 15));
		
		JLabel size1 = new JLabel();
		size1.setText("2");
		size1.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel dateConsumed1 = new JLabel();
		dateConsumed1.setText("DATE CONSUMED:");
		dateConsumed1.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel dateEaten1 = new JLabel();
		dateEaten1.setText("22/01/2022");
		dateEaten1.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel foodName2 = new JLabel();
		foodName2.setText("CHICKEN");
		foodName2.setFont(new Font("Now", Font.BOLD, 15));
		
		JLabel size2 = new JLabel();
		size2.setText("500g");
		size2.setFont(new Font("Now", Font.PLAIN, 15));	
		
		JLabel dateConsumed2 = new JLabel();
		dateConsumed2.setText("DATE CONSUMED:");
		dateConsumed2.setFont(new Font("Now", Font.PLAIN, 15));		
		
		JLabel dateEaten2 = new JLabel();
		dateEaten2.setText("24/01/2022");
		dateEaten2.setFont(new Font("Now", Font.PLAIN, 15));
		
		//Panels
		JPanel panelUp = new JPanel();
		panelUp.setBackground(new Color(255, 222, 89));
		panelUp.setBounds(20,230,334,135);
		panelUp.setLayout(new GridLayout(2,2,5,5));
		panelUp.add(foodName1);
		panelUp.add(dateConsumed1);
		panelUp.add(size1);
		panelUp.add(dateEaten1);
		
		JPanel panelDown = new JPanel();
		panelDown.setBackground(new Color(255, 222, 89));
		panelDown.setBounds(20,390,334,135);
		panelDown.setLayout(new GridLayout(2,2,5,5));
		panelDown.add(foodName2);
		panelDown.add(dateConsumed2);
		panelDown.add(size2);
		panelDown.add(dateEaten2);
		
		//Buttons
		back = new JButton();
		back.setText("BACK");
		back.setFont(new Font("Now", Font.PLAIN, 20));
		back.setBounds(140,620,100,20);
		back.setFocusable(false);
		back.addActionListener(this);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		
		//Frame components
		add(logo);
		add(header);
		add(header2);
		add(header3);
		add(panelUp);
		add(panelDown);
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
		new frame19();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.dispose();
			new frame13();
		}
		
	}
}
