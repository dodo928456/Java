import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox [] fruits = new JCheckBox [3];
	private String [] names = {"���","��","ü��"};
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx(){
		setTitle("üũ�ڽ��� itEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("��� 100�� , �� 500�� ,ü�� 2000��"));
		
		MyItemListener listener = new MyItemListener();
		
		for(int i=0; i<fruits.length; i++){
			fruits[i] = new JCheckBox(names[i]);//names[]�� ���ڿ��� üũ�ڽ� ����
			fruits[i].setBorderPainted(true);//üũ�ڽ� �ܰ��� ���̵��� ����
			c.add(fruits[i]);//����Ʈ �ҿ� üũ�ڽ� ����
			fruits[i].addItemListener(listener); 
		}
		
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		c.add(sumLabel);
		
		setSize(250,200);
		setVisible(true);
	}
		
		class MyItemListener implements ItemListener{
			private int sum = 0;//��������
			
			//üũ�ڽ��� ���� ���°� ���ϸ� itemStateChanged()
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange() == ItemEvent.SELECTED){// ���� ���
					if(e.getItem() == fruits[0])// ��� üũ�ڽ�
						sum += 100;
					else if(e.getItem() == fruits[1] )// �� üũ�ڽ�
						sum += 500;
					else
						sum += 2000;
				}
				else{
					if(e.getItem() == fruits[0] )// ��� üũ�ڽ�
						sum -= 100;
					else if(e.getItem() == fruits[1])//�� üũ�ڽ�
						sum -= 500;
					else
						sum -= 2000;
				}
				sumLabel.setText("����" + sum + "�� �Դϴ� ."); //�� ���
			}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
