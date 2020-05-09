
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;  
import java.awt.event.*; 

public class calc {

	private JFrame frame;
	private JTextField textField;
	private String s1="0",o="";
	private int t,sum;
	
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					
				}
//			}
//		});
	}


	public calc() 
	{

		frame = new JFrame();
		frame.setBounds(100, 100, 431, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_0 = new JButton("1");
		button_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s1+=1;
				textField.setText(s1);
				
			}
		});
		button_0.setBounds(30, 423, 60, 60);
		frame.getContentPane().add(button_0);
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1+=2;
				textField.setText(s1);
			}
		});
		button_1.setBounds(105, 423, 60, 60);
		frame.getContentPane().add(button_1);
		
		JButton button_4 = new JButton("3");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s1+=3;
				textField.setText(s1);
			}
		});
		button_4.setBounds(180, 423, 60, 60);
		frame.getContentPane().add(button_4);
		
		JButton button_2 = new JButton("=");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(o=="+")
				{
					 sum = t+ Integer.parseInt(s1);
					 System.out.println(sum);
					 s1=Integer.toString(sum);
					 textField.setText(""+sum);
				}
				else if(o=="-")
				{
					 sum = t- Integer.parseInt(s1);
					 System.out.println(sum);
					 s1=Integer.toString(sum);
					 textField.setText(""+sum);
				}
				else if(o=="*")
				{
					 sum = t * Integer.parseInt(s1);
					 System.out.println(sum);
					 s1=Integer.toString(sum);
					 textField.setText(""+sum);
				}
				else if(o=="/")
				{
					 sum = t / Integer.parseInt(s1);
					 System.out.println(sum);
					 s1=Integer.toString(sum);
					 textField.setText(""+sum);
				}
			}
		});
		
		JButton button_5 = new JButton("4");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1+=4;
				textField.setText(s1);
			}
		});
		button_5.setBounds(30, 347, 60, 60);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1+=5;
				textField.setText(s1);
			}
		});
		button_6.setBounds(105, 347, 60, 60);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1+=6;
				textField.setText(s1);
			}
		});
		button_7.setBounds(180, 347, 60, 60);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1+=7;
				textField.setText(s1);
			}
		});
		button_8.setBounds(30, 271, 60, 60);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1+=8;
				textField.setText(s1);
			}
		});
		button_9.setBounds(105, 271, 60, 60);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1+=9;
				textField.setText(s1);
			}
		});
		button_10.setBounds(180, 271, 60, 60);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1+=0;
				textField.setText(s1);
			}
		});
		button_11.setBounds(30, 499, 135, 60);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1+=".";
				textField.setText(s1);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_12.setBounds(180, 499, 60, 60);
		frame.getContentPane().add(button_12);
		button_2.setBounds(256, 499, 134, 60);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t = Integer.parseInt(s1);
				System.out.println(t);
				s1="0";
				o = "+";
				
			}
		});
		button_3.setBounds(257, 271, 60, 136);
		frame.getContentPane().add(button_3);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t = Integer.parseInt(s1);
				System.out.println(t+" "+s1+""+o);
				s1="0";
				o = "-";
				
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(255, 423, 60, 60);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t = Integer.parseInt(s1);
				System.out.println(t);
				s1="0";
				o = "/";
				
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_14.setBounds(330, 423, 60, 60);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("*");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t = Integer.parseInt(s1);
				System.out.println(t);
				s1="0";
				o = "*";
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_15.setBounds(332, 347, 60, 60);
		frame.getContentPane().add(button_15);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = "0";
				t = 0;
				textField.setText(s1);
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCe.setBounds(332, 271, 60, 60);
		frame.getContentPane().add(btnCe);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(15, 42, 377, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblDesignedBySouvik = new JLabel("Designed by Souvik");
		lblDesignedBySouvik.setFont(new Font("Sylfaen", Font.ITALIC, 18));
		lblDesignedBySouvik.setBounds(15, 134, 166, 20);
		frame.getContentPane().add(lblDesignedBySouvik);
	
}

}
		
