package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Assignment10 extends JFrame {
	public Assignment10() {
		
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JTextField filed=new JTextField(15);
		JTextField filed1=new JTextField(15);
		JTextField filed2=new JTextField(15);
		JTextField filed3=new JTextField(15);
		JLabel label2=new JLabel("count");
		JLabel label=new JLabel("Welcome to java pizza.");
		JLabel label1=new JLabel("Choose the type pizza.");
		
		
		panel1.add(label);
		panel1.add(label1);
		panel2.add(filed);
		panel2.add(filed1);
		panel2.add(filed2);
		panel2.add(label2);
		panel2.add(filed3);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		
		setSize(700,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}

}
