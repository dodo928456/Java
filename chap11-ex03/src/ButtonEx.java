import javax.swing.*;
import java.awt.*;


public class ButtonEx extends JFrame {
	public ButtonEx(){
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//3���� �̹����� ���Ϸ� ���� �ҷ��´�
		
		ImageIcon normalIcon = new ImageIcon("images/img1.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/img1.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/img1.jpg");
		
		
		//3���� �̹��� ��ư ����
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEx();
	}

}
