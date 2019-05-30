package colordelay;
import java.awt.*;
import javax.swing.*;


class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	public FlickeringLabel(String text,long delay){
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	
	public void run(){
		int n = 0;
		while(true){
			if(n == 0)
				setBackground(Color.yellow);
			else
				setBackground(Color.GREEN);
			if(n == 0) n = 1;
			else n = 0;
			try{
				Thread.sleep(delay);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
	
}



public class delay extends JFrame {
	public delay(){
		setTitle("»ö°¥±ôºý±ôºý ½º·¹µå¿¬½À");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("±ôºý",1000);
		
		JLabel label = new JLabel("¾È±ôºý");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("¿©±âµµ ±ôºý",1000);
		
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new delay();
	}

}
