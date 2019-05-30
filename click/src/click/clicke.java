package click;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RandomThread extends Thread{

	private Container contentPane;
	private boolean flag=false;//스레드 명령을 표시플래그 턴 표시
	public RandomThread(Container contenPane){
		this.contentPane = contenPane;
	}
	
	void finish(){//스레드 종료 명령을 flag에표시
		flag = true;		
	}
	public void run(){
		while(true){
		  int x = ((int)(Math.random()*contentPane.getWidth()));
		  int y = ((int)(Math.random()*contentPane.getHeight()));
		  JLabel label = new JLabel("java");//새 레이블 생성
		  label.setSize(80,30);
		  label.setLocation(x,y);
		  contentPane.add(label);
		  contentPane.repaint();
		  try{
			  Thread.sleep(300);//0.3초 기다렸다
			  if(flag==true){
				  contentPane.removeAll();
				  label = new JLabel("finish");
				  label.setSize(80, 30);
				  label.setLocation(100,100);
				  label.setForeground(Color.RED);
				  contentPane.add(label);
				  contentPane.repaint();
				  return;//스레드 종료
			  }
		  }
		  catch(InterruptedException e){return; }
		 
		}
	}
}


public class clicke extends JFrame {
	private RandomThread th;//스레드 레퍼런스
	
	public clicke(){
		setTitle("클릭 이벤트 예제 스레드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e){
				th.finish();//랜덤스레드 종료 명령
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);//스레드 생성
		th.start();//스레드 동작시킴
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new clicke();
	}

}
