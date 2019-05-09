import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.*;

public class Calculator extends JFrame {
	public Calculator() {
		super("다이얼로그 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
	        Dialog d= new Dialog(this, "모덜리스 다이얼로그");
	        setBounds(0, 0, 400, 400);
	        d.setVisible(true);
	        d.setSize(200,200);
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("더하기");
		c.add(btn);
		JPanel aaa = new JPanel();
		aaa.setLayout(new GridLayout(4,4,5,5)); // GridLayout 배치관리자
		for(int i=0; i<10; i++) {
			JButton b = new JButton(Integer.toString(i));
		add(b);
		}
		setSize(250,200);
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

}
