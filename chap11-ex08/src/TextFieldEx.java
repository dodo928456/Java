import javax.swing.*;
import java.awt.*;
public class TextFieldEx extends JFrame {
	public TextFieldEx (){
		setTitle("�ؽ�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new Label("�̸�"));
		c.add(new JTextField(20));//â�� ������
		c.add(new Label("�а�"));
		c.add(new JTextField("��ǻ�� ���а�",20));//â�� �� ����20
		c.add(new Label("�ּ�"));
		c.add(new JTextField("����� ___",20));
		
		setSize(300,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
