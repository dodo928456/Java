import javax.swing.*;
import java.awt.*;

public class text extends JFrame {
	public text() {
		setTitle("¸Þ¸ðÀå");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setVisible(true);
		
	}
	private void div(){
		JToolBar a = new JToolBar("kitae Menu");
		a.setLayout(new FlowLayout());
		a.setBackground(Color.LIGHT_GRAY);
		a.addSeparator();
		a.add(new JTextField("text field"));
		a.setSize(100,100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new text();
	}

}
