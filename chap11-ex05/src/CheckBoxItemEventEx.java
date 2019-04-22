import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox [] fruits = new JCheckBox [3];
	private String [] names = {"사과","배","체리"};
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx(){
		setTitle("체크박스와 itEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원 , 배 500원 ,체리 2000원"));
		
		MyItemListener listener = new MyItemListener();
		
		for(int i=0; i<fruits.length; i++){
			fruits[i] = new JCheckBox(names[i]);//names[]의 문자열로 체크박스 생성
			fruits[i].setBorderPainted(true);//체크박스 외곽선 보이도록 설정
			c.add(fruits[i]);//컨텐트 팬에 체크박스 삽임
			fruits[i].addItemListener(listener); 
		}
		
		sumLabel = new JLabel("현재 0원 입니다.");
		c.add(sumLabel);
		
		setSize(250,200);
		setVisible(true);
	}
		
		class MyItemListener implements ItemListener{
			private int sum = 0;//가격의함
			
			//체크박스의 선택 상태가 변하면 itemStateChanged()
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange() == ItemEvent.SELECTED){// 선택 경우
					if(e.getItem() == fruits[0])// 사과 체크박스
						sum += 100;
					else if(e.getItem() == fruits[1] )// 배 체크박스
						sum += 500;
					else
						sum += 2000;
				}
				else{
					if(e.getItem() == fruits[0] )// 사과 체크박스
						sum -= 100;
					else if(e.getItem() == fruits[1])//배 체크박스
						sum -= 500;
					else
						sum -= 2000;
				}
				sumLabel.setText("현재" + sum + "원 입니다 ."); //함 출력
			}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
