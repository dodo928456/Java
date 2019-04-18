import javax.swing.*;
import java.awt.*;


public class FlowLayout	extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final String LEFT = null;

	public FlowLayout(){
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout (FlowLayout.LEFT,30,40) );
		c.add(new JButton("add"));c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayout();
	}

}
