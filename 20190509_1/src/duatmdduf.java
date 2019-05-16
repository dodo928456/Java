import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class duatmdduf extends JFrame {

	public	duatmdduf(){
		setTitle("수행평가");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cc = getContentPane();
		cc.setLayout(new FlowLayout(FlowLayout.LEFT));
		cc.setBackground(Color.black);
		setSize(400,400);
		setVisible(true);
	}
	public class rptksrl{
		private int cc;
		private int bb;
		public rptksrl(Component cc,Component bb){
			JTextArea ee = new JTextArea();
			add(cc);
			add(bb);
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new duatmdduf();
	}

}
