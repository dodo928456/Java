import javax.swing.*;
import java.awt.*;


public class ListEx extends JFrame {
	private String [] fruils= {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	private ImageIcon [] images = { new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png") };
	
	public ListEx(){
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =  getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruils); // ���ڿ� ����Ʈ ����
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruils);
		c.add(new JScrollPane(scrollList) );
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}
