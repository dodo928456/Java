import javax.swing.*;
import  java.awt.*;
public class RadioButtonEx extends JFrame {
	public RadioButtonEx(){
		setTitle("라디오 버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherrIcon = new ImageIcon("images/cherry.jpg");//해제 상태이미
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");//선택 상태를 나타내는 이미지
		//버튼 그룹 객체 생성
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배",true);
		JRadioButton cherry = new JRadioButton("체리", cherrIcon);
		
		
		cherry.setBorderPainted(true);//버튼 라디오버튼 외곽선
		cherry.setSelectedIcon(selectedCherryIcon);//선택 상태 이미지 등록
		
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
