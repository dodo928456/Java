import javax.swing.*;
import java.awt.*;
public class LabelEx extends JFrame {
	public LabelEx (){
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		//문자열 생성
		JLabel textLabel = new JLabel("사랑합니다");
		
		//이미지 레이블 생성
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel imgeLabel = new JLabel(beauty);
		
		//문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("images.normalIcon.gif");
		JLabel label = new JLabel("보고싶으면 전화 하세요",
				normalIcon, SwingConstants.CENTER);
		
		//컨텐트팬에 3개의 레이블 부팍
		c.add(textLabel);
		c.add(imgeLabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
