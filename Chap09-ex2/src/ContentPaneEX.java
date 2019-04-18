import java.awt.Container;
import Javax.swing.JFrame;

public class ContentPaneEX extends JFrame {
	public ContentPaneEX(){
		setTitle("Content pane and JFrame");
		setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.RED);
		contentPane.setLayout(new FlowLayout);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
