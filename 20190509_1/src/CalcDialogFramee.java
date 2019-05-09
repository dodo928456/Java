import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcDialogFramee extends JFrame {
	private JLabel resultLabel = new JLabel("��� ��� ���");
	public CalcDialogFramee() {
		super("���̾�α� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("calculate");
		JButton btn2 = new JButton("����");
		btn1.addActionListener(new MyActionListener());
		btn2.addActionListener(new MyActionListener2());
		c.add(btn1);
		c.add(btn2);
		
		
		resultLabel.setOpaque(true);
		resultLabel.setBackground(Color.GREEN);		
		c.add(resultLabel);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyActionListener implements  ActionListener {
		private CalcDialog dialog;
		public MyActionListener() {
			dialog = new CalcDialog(CalcDialogFramee.this);			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dialog.setVisible(true);
			if(dialog.isValid())
				resultLabel.setText(Integer.toString(dialog.getResult()));
		}
	}
	
	class MyActionListener2 implements  ActionListener {
		private CalcDialog dialog;
		public MyActionListener2() {
			dialog = new CalcDialog(CalcDialogFramee.this);			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dialog.setVisible(true);
			if(dialog.isValid())
				resultLabel.setText(Integer.toString(dialog.getResult()));
		}
	}
	

	class CalcDialog extends JDialog {
		private int sum = 0;
		private boolean bValid = false;
		private JTextField a = new JTextField(10);
		private JTextField b = new JTextField(10);
		private JTextField c = new JTextField(10);
		private JTextField d = new JTextField(10);
		private JButton addBtn = new JButton("  ��   ");
		
		public CalcDialog(JFrame f) {
			super(f, "Calculation Dialog", true);
			setLayout(new FlowLayout());
			add(new JLabel("�� ���� ���մϴ�."));
			add(a);
			add(b);
			
			add(addBtn);
			
			addBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						int x = Integer.parseInt(a.getText());
						int y = Integer.parseInt(b.getText());
						sum = x + y;
						bValid = true;
					}catch(NumberFormatException e2) {
						JOptionPane.showMessageDialog(CalcDialog.this, "������ �ƴ� Ű�� �ֽ��ϴ�", "����", JOptionPane.ERROR_MESSAGE);
						return;
					}
					CalcDialog.this.setVisible(false);
				}
			});
			
			setSize(200,200);
		}
		public void CalcDialog2(JFrame f) {
			super(f, "Calculation Dialog", true);
			setLayout(new FlowLayout());
			add(new JLabel("�� ���� ���ϴ�"));
			add(c);
			add(d);
			
			add(addBtn);
			
			addBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						int x = Integer.parseInt(c.getText());
						int y = Integer.parseInt(d.getText());
						sum = x - y;
						bValid = true;
					}catch(NumberFormatException e2) {
						JOptionPane.showMessageDialog(CalcDialog.this, "������ �ƴ� Ű�� �ֽ��ϴ�", "����", JOptionPane.ERROR_MESSAGE);
						return;
					}
					CalcDialog.this.setVisible(false);
				}
			});
			
			setSize(200,200);
		}
		
		public boolean isValid() {
			return bValid;
		}
		public int getResult() {
			if(bValid)
				return sum;
			return 0;
		}
	}
	static public void main(String[] arg) {
		new CalcDialogFramee();
	}
}

