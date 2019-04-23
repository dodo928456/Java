import javax.swing.*;
import  java.awt.*;
public class RadioButtonEx extends JFrame {
	public RadioButtonEx(){
		setTitle("���� ��ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherrIcon = new ImageIcon("images/cherry.jpg");//���� �����̹�
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");//���� ���¸� ��Ÿ���� �̹���
		//��ư �׷� ��ü ����
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��",true);
		JRadioButton cherry = new JRadioButton("ü��", cherrIcon);
		
		
		cherry.setBorderPainted(true);//��ư ������ư �ܰ���
		cherry.setSelectedIcon(selectedCherryIcon);//���� ���� �̹��� ���
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();
	}

}
