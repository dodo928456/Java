package myplay;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class play extends JFrame {
		public play(){
			setTitle("����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout(FlowLayout.LEFT));
			JButton a = new JButton("�ȳ�");
			c.add(a);
			a.addActionListener(new ActionListener() { // ������ �����
				public void actionPerformed(ActionEvent e) { // ������ �̺�Ʈ �����
					JButton q = (JButton)e.getSource(); // �̺�Ʈ �ϴ³� �ҷ�����
					Container c = getContentPane(); 
					c.setLayout(new FlowLayout(FlowLayout.LEFT)); 
					Panel g = new Panel();
					JButton x = new JButton("�ݱ�");
					if(q.getText().equals("�ȳ�")){ // TEXT �´��� ���ϱ� // �ȳ� ��ư ����� 
						g.setBackground(Color.BLACK);
						g.setPreferredSize(new Dimension(150,150));
						g.add(x);
						x.addActionListener(new ActionListener() { // ������ ����� // �ٳ� ��ư ����� 
							public void actionPerformed(ActionEvent e) {// ������ �̺�Ʈ �����
								JButton p = (JButton)e.getSource();
								if(p.getText().equals("�ݱ�")){
									c.add(p);
									p.setText("�׸��� ��");
									g.setVisible(false);
								}else{
									p.setText("�ݱ�");
									c.setBackground(Color.PINK);
									
								}
								
								
							}
						});
						c.add(g);
						setSize(300,300);
						setVisible(true);
					}
					 
				}
			});
			setSize(300,300);
			setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new play();
	}

}
