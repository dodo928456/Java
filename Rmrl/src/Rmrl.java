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
				Thread.sleep(1000);//1�� ��ٷȴ�
			}
			catch(InterruptedException e){
				return;//���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
	
}

public class Rmrl extends JFrame {
	public Thread th;
	public Rmrl(){
		setTitle("Ÿ�̸� ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable);//������ ����
		c.add(timerLabel);
		
		//��ư�� �����ϰ� Action ������ ���
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();//Ÿ�̸� ��������
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);//��ư ��Ȱ��ȭ
				
			}
		});
		
		
		c.add(btn);
		setSize(300,170);
		setVisible(true);
		
		th.start();//������ ���۽�Ŵ
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Rmrl();
	}

}
