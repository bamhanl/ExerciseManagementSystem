package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Assign10xManagementTest extends JFrame  {

		public Assign10xManagementTest() {
			this.setSize(300, 300);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JLabel label = new JLabel("Menu Selection");
			
			JButton button1 = new JButton("Add Student");
			JButton button2 = new JButton("View Student");
			JButton button3 = new JButton("Edit  Student");
			JButton button4 = new JButton("Delet Student");
			JButton button5 = new JButton("Exit program");
			
			panel1.add(label);
			panel2.add(button1);
			panel2.add(button2);
			panel2.add(button3);
			panel2.add(button4);
			panel2.add(button5);
			
			this.add(panel1, BorderLayout.NORTH);
			this.add(panel2, BorderLayout.CENTER);
			this.setVisible(true);
			

	}

}
