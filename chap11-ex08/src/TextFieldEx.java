import javax.swing.*;
import java.awt.*;
public class TextFieldEx extends JFrame {
	public TextFieldEx (){
		setTitle("텍스트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new Label("이름"));
		c.add(new JTextField(20));//창의 열개수
		c.add(new Label("학과"));
		c.add(new JTextField("컴퓨터 공학과",20));//창의 열 개수20
		c.add(new Label("주소"));
		c.add(new JTextField("서울시 ___",20));
		
		setSize(300,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
