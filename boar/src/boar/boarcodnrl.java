package boar;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class boarcodnrl extends JFrame {
	MyLabel bar = new MyLabel(100);
	TabAndThreadEx(String title){
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter(){
			public void KeyPressed(KeyEvent e)
			{
				bar.fill();
			}
		});
		setSize(350,200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
