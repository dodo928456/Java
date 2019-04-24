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
			setTitle("연습");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout(FlowLayout.LEFT));
			JButton a = new JButton("안냥");
			c.add(a);
			a.addActionListener(new ActionListener() { // 리스너 만들기
				public void actionPerformed(ActionEvent e) { // 리스너 이벤트 만들기
					JButton q = (JButton)e.getSource(); // 이벤트 하는놈 불러오기
					Container c = getContentPane(); 
					c.setLayout(new FlowLayout(FlowLayout.LEFT)); 
					Panel g = new Panel();
					JButton x = new JButton("닫기");
					if(q.getText().equals("안냥")){ // TEXT 맞는지 비교하기 // 안냥 버튼 누루면 
						g.setBackground(Color.BLACK);
						g.setPreferredSize(new Dimension(150,150));
						g.add(x);
						x.addActionListener(new ActionListener() { // 리스너 만들기 // 다끼 버튼 누루면 
							public void actionPerformed(ActionEvent e) {// 리스너 이벤트 만들기
								JButton p = (JButton)e.getSource();
								if(p.getText().equals("닫기")){
									c.add(p);
									p.setText("네모의 꿈");
									g.setVisible(false);
								}else{
									p.setText("닫기");
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
