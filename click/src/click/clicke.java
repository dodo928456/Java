package click;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RandomThread extends Thread{

	private Container contentPane;
	private boolean flag=false;//������ ����� ǥ���÷��� �� ǥ��
	public RandomThread(Container contenPane){
		this.contentPane = contenPane;
	}
	
	void finish(){//������ ���� ����� flag��ǥ��
		flag = true;		
	}
	public void run(){
		while(true){
		  int x = ((int)(Math.random()*contentPane.getWidth()));
		  int y = ((int)(Math.random()*contentPane.getHeight()));
		  JLabel label = new JLabel("java");//�� ���̺� ����
		  label.setSize(80,30);
		  label.setLocation(x,y);
		  contentPane.add(label);
		  contentPane.repaint();
		  try{
			  Thread.sleep(300);//0.3�� ��ٷȴ�
			  if(flag==true){
				  contentPane.removeAll();
				  label = new JLabel("finish");
				  label.setSize(80, 30);
				  label.setLocation(100,100);
				  label.setForeground(Color.RED);
				  contentPane.add(label);
				  contentPane.repaint();
				  return;//������ ����
			  }
		  }
		  catch(InterruptedException e){return; }
		 
		}
	}
}


public class clicke extends JFrame {
	private RandomThread th;//������ ���۷���
	
	public clicke(){
		setTitle("Ŭ�� �̺�Ʈ ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e){
				th.finish();//���������� ���� ���
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);//������ ����
		th.start();//������ ���۽�Ŵ
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new clicke();
	}

}
