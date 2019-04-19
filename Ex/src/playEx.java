import java.awt.*;

import javax.swing.*;

public class playEx extends JFrame {
	public playEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container div = this.getContentPane();
		
		this.setLayout(new FlowLayout());
		JButton btn = new JButton("인호");
		div.add(btn);
		this.setSize(50,50);
		this.setBackground(Color.BLACK);
		div.setBackground(Color.RED);
		setTitle ("연습");
		setSize(500,500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new playEx();
	}

}
