import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel){
		this.timerLabel = timerLabel;
		
	}
	public void run(){
		int n=0;
		while(true){
			timerLabel.setText(Integer.toString(n));
			n++;
			try{
				Thread.sleep(1000);//1초 기다렸다
			}
			catch(InterruptedException e){
				return;//예외가 발생하면 스레드 종료
			}
		}
	}
	
}

public class Rmrl extends JFrame {
	public Thread th;
	public Rmrl(){
		setTitle("타이머 끄는 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable);//스레드 생성
		c.add(timerLabel);
		
		//버튼을 생성하고 Action 리스너 등록
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();//타이머 강제종료
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);//버튼 비활성화
				
			}
		});
		
		
		c.add(btn);
		setSize(300,170);
		setVisible(true);
		
		th.start();//스레드 동작시킴
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Rmrl();
	}

}
