package test;
import java.awt.*;
import javax.swing.*;


class TimerThread extends Thread{
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel){
		this.timerLabel = timerLabel;
	}
	
	public void run(){
		int n = 0;
		while(true){
			timerLabel.setText(Integer.toString(n));
			n++;
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
}


public class dustmq extends JFrame {
	public dustmq(){
		setTitle("스레드를 상속받은 타이머");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timetLabel = new JLabel();
		timetLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timetLabel);
		
		TimerThread th = new TimerThread(timetLabel); 
		
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) {
		new dustmq();

	}

}
