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

public class frame17 extends JFrame implements ActionListener{

	JButton back, recipe, add;
	
	frame17(){
		//Images
		ImageIcon image = new ImageIcon("FoodDelta.png");
		JLabel logo = new JLabel();
		logo.setIcon(image);
		logo.setBounds(20,20,100,100);
		
		//Labels
		JLabel header = new JLabel();
		header.setText("INGREDIENTS");
		header.setFont(new Font("Now Bold", Font.BOLD, 35));
		header.setBounds(20,120,300,45);
		
		//Panel components
		JLabel foodName1 = new JLabel();
		foodName1.setText("Chips");
		foodName1.setFont(new Font("Now", Font.BOLD, 15));
		
		JLabel size1 = new JLabel();
		size1.setText("200g");
		size1.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel bestBefore1 = new JLabel();
		bestBefore1.setText("BEST BEFORE");
		bestBefore1.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel expiryDate1 = new JLabel();
		expiryDate1.setText("14/02/2022" + "  (14 days)");
		expiryDate1.setFont(new Font("Now", Font.PLAIN, 15));
		
		JLabel temp = new JLabel();
		temp.setText("           ");
		
		JLabel status = new JLabel();
		status.setText("CONSUMED");
		status.setFont(new Font("Now", Font.PLAIN, 15));
		status.setForeground(Color.BLUE);
		
		JLabel foodName2 = new JLabel();
		foodName2.setText("EGG");
		foodName2.setFont(new Font("Now", Font.BOLD, 15));
		foodName2.setForeground(Color.RED);
		
		JLabel size2= new JLabel();
		size2.setText("5");
		size2.setFont(new Font("Now", Font.PLAIN, 15));
		size2.setForeground(Color.RED);
		
		JLabel bestBefore2 = new JLabel();
		bestBefore2.setText("BEST BEFORE");
		bestBefore2.setFont(new Font("Now", Font.PLAIN, 15));
		bestBefore2.setForeground(Color.RED);
		
		JLabel expiryDate2 = new JLabel();
		expiryDate2.setText("27/01/2022" + "  (-2 days)");
		expiryDate2.setFont(new Font("Now", Font.PLAIN, 15));
		expiryDate2.setForeground(Color.RED);
		
		JLabel temp2 = new JLabel();
		temp2.setText("           ");
		
		JLabel status2 = new JLabel();
		status2.setText("CONSUMED");
		status2.setFont(new Font("Now", Font.PLAIN, 15));
		status2.setForeground(Color.BLUE);
		
		//Panels
		JPanel panelUp = new JPanel();
		panelUp.setBackground(new Color(255, 222, 89));
		panelUp.setBounds(20,180,334,135);
		panelUp.setLayout(new GridLayout(3,2,5,5));
		panelUp.add(foodName1);
		panelUp.add(bestBefore1);
		panelUp.add(size1);
		panelUp.add(expiryDate1);
		panelUp.add(temp);
		panelUp.add(status);
		
		JPanel panelDown = new JPanel();
		panelDown.setBackground(new Color(255, 222, 89));
		panelDown.setBounds(20,340,334,135);
		panelDown.setLayout(new GridLayout(3,2,5,5));
		panelDown.add(foodName2);
		panelDown.add(bestBefore2);
		panelDown.add(size2);
		panelDown.add(expiryDate2);
		panelDown.add(temp2);
		panelDown.add(status2);

		//Buttons
		back = new JButton();
		back.setText("BACK");
		back.setFont(new Font("Now", Font.PLAIN, 20));
		back.setBounds(140,620,100,20);
		back.setFocusable(false);
		back.addActionListener(this);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		
		recipe = new JButton();
		recipe.setText("RECIPE");
		recipe.setFont(new Font("Now Bold", Font.BOLD, 30));
		recipe.setFocusable(false);
		recipe.setBounds(116,500,150,30);
		recipe.addActionListener(this);
		recipe.setBackground(new Color(255, 222, 89));
		
		add = new JButton();
		add.setText("ADD NEW INGREDIENTS");
		add.setFont(new Font("Now Bold", Font.BOLD, 25));
		add.setFocusable(false);
		add.setBounds(20,560,350,30);
		add.addActionListener(this);
		add.setBackground(new Color(255, 222, 89));
		
		//Frame components
		add(logo);
		add(header);
		add(panelUp);
		add(panelDown);
		add(back);
		add(recipe);
		add(add);
		
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
		new frame17();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.dispose();
			new frame13();
		}
		
		if(e.getSource()==recipe) {
			this.dispose();
			new frame18();
		}
		
		if(e.getSource()==add) {
			this.dispose();
			new frame16();
		}
	}
	
}
