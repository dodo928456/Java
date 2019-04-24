import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton [] radio = new JRadioButton [3];
	private String [] text = {"바다","산","강"};
	private ImageIcon [] image = { // 이미지 객체 배열
			new ImageIcon("images/img1.jpg"), 
			new ImageIcon("images/img2.jpg"),
			new ImageIcon("images/img3.jpg")};
	private JLabel imageLabel = new JLabel();
	
	public RadioButtonItemEventEx(){
		setTitle("라디오버튼 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0; i<radio.length; i++ ){
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);
		c.add(radioPanel,BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(500,500);
		setVisible(true);
		
	}
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return ;// 해제시 리턴
			if(radio[0].isSelected())//사과 선택
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())//배 가선택
				imageLabel.setIcon(image[1]);
			else//체리 선택
				imageLabel.setIcon(image[2]);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonItemEventEx();
	}

}
