package COMPILE;
import javax.swing.*;

public class COMPILATION {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JAVA COMPILATION");
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);
		
		JMenu basicInputOutput = new JMenu("BASIC INPUT & OUTPUT");
		bar.add(basicInputOutput);
		
		JMenu nestedIfElse = new JMenu("NESTED IF-ELSE");
		bar.add(nestedIfElse);
		
		//BASIC INPUT AND OUTPUT (5)
		
		//PROGRAM 1
		JMenuItem b1item = new JMenuItem("Basic Print");
		basicInputOutput.add(b1item);
		
		JPanel b1panel = new JPanel();
		b1panel.setLayout(null);
		
		JLabel b1label = new JLabel("Enter your name here: ");
		b1panel.add(b1label);
		b1label.setBounds(100, 25, 150, 100);
		
		JTextField b1field = new JTextField("");
		b1panel.add(b1field);
		b1field.setBounds(300, 50, 200, 50);
		
		JButton b1button = new JButton("PRINT");
		b1panel.add(b1button);
		b1button.setBounds(250, 250, 200, 50);
		
		b1button.addActionListener( e -> {
			String b1string = b1field.getText();
			
			if (b1string.isEmpty()) {
				JOptionPane.showMessageDialog(b1panel, "Please input your name");
			} else {
				JOptionPane.showMessageDialog(b1panel, "Your name is: " + b1string);
			}
			
			
		});
		
		
		//PROGRAM 2
		JMenuItem b2item = new JMenuItem("Addition");
		basicInputOutput.add(b2item);
		
		JPanel b2panel = new JPanel();
		b2panel.setLayout(null);
		
		JLabel b2label1 = new JLabel("Enter your first number here: ");
		b2panel.add(b2label1);
		b2label1.setBounds(50, 25, 250, 150);
		
		JLabel b2label2 = new JLabel("Enter your second number here: ");
		b2panel.add(b2label2);
		b2label2.setBounds(50, 100, 250, 150);
		
		JTextField b2field1 = new JTextField("");
		b2panel.add(b2field1);
		b2field1.setBounds(300, 80, 250, 40);
		
		JTextField b2field2 = new JTextField("");
		b2panel.add(b2field2);
		b2field2.setBounds(300, 155, 250, 40);
		
		JButton b2button = new JButton("SUM");
		b2panel.add(b2button);
		b2button.setBounds(250, 250, 200, 50);
		
		b2button.addActionListener( e -> {
			
			String b2string1 = b2field1.getText();
			String b2string2 = b2field2.getText();
			
			
			if (b2string1.trim().isEmpty()) {
				
				JOptionPane.showMessageDialog(b2panel, "Please input an first number" );
				
			} if (b2string2.trim().isEmpty()) {
				
				JOptionPane.showMessageDialog(b2panel, "Please input your second number" );
				
			} else {
				int b2num1 = Integer.parseInt(b2string1);
				int b2num2 = Integer.parseInt(b2string2);
				int sum = b2num1 + b2num2;
			JOptionPane.showMessageDialog(b2panel, "Your sum is: " + sum);
			
			}
			
		});
		
		//PROGRAM 3
		JMenuItem b3item = new JMenuItem("Subtraction");
		basicInputOutput.add(b3item);
		
		JPanel b3panel = new JPanel();
		b3panel.setLayout(null);
		
		JLabel b3label1 = new JLabel("Enter your first number here: ");
		b3panel.add(b3label1);
		b3label1.setBounds(50, 25, 250, 150);
		
		JLabel b3label2 = new JLabel("Enter your second number here: ");
		b3panel.add(b3label2);
		b3label2.setBounds(50, 100, 250, 150);
		
		JTextField b3field1 = new JTextField("");
		b3panel.add(b3field1);
		b3field1.setBounds(300, 80, 250, 40);
		
		JTextField b3field2 = new JTextField("");
		b3panel.add(b3field2);
		b3field2.setBounds(300, 155, 250, 40);
		
		JButton b3button = new JButton("DIFFERENCE");
		b3panel.add(b3button);
		b3button.setBounds(250, 250, 200, 50);
		
		b3button.addActionListener( e -> {
			
			String b3string1 = b3field1.getText();
			String b3string2 = b3field2.getText();
			
			
			if (b3string1.trim().isEmpty()) {
				
				JOptionPane.showMessageDialog(b3panel, "Please input your first number" );
				
			} if (b3string2.trim().isEmpty()) {
				
				JOptionPane.showMessageDialog(b3panel, "Please input your second number" );
				
			} else {
				int b3num1 = Integer.parseInt(b3string1);
				int b3num2 = Integer.parseInt(b3string2);
				int difference = b3num1 - b3num2;
			JOptionPane.showMessageDialog(b3panel, "Your difference is: " + difference);
			
			}
			
		});
		
		//PROGRAM 4
		JMenuItem b4item = new JMenuItem("Multiplication");
		basicInputOutput.add(b4item);
		
		JPanel b4panel = new JPanel();
		b4panel.setLayout(null);
		
		JLabel b4label1 = new JLabel("Enter your first number here: ");
		b4panel.add(b4label1);
		b4label1.setBounds(50, 25, 250, 150);
		
		JLabel b4label2 = new JLabel("Enter your second number here: ");
		b4panel.add(b4label2);
		b4label2.setBounds(50, 100, 250, 150);
		
		JTextField b4field1 = new JTextField("");
		b4panel.add(b4field1);
		b4field1.setBounds(300, 80, 250, 40);
		
		JTextField b4field2 = new JTextField("");
		b4panel.add(b4field2);
		b4field2.setBounds(300, 155, 250, 40);
		
		JButton b4button = new JButton("PRODUCT");
		b4panel.add(b4button);
		b4button.setBounds(250, 250, 200, 50);
		
		b4button.addActionListener( e -> {
			
			String b4string1 = b4field1.getText();
			String b4string2 = b4field2.getText();
			
			
			if (b4string1.trim().isEmpty()) {
				
				JOptionPane.showMessageDialog(b4panel, "Please input your first number" );
				
			} if (b4string2.trim().isEmpty()) {
				
				JOptionPane.showMessageDialog(b4panel, "Please input your second number" );
				
			} else {
				int b4num1 = Integer.parseInt(b4string1);
				int b4num2 = Integer.parseInt(b4string2);
				int product = b4num1 * b4num2;
			JOptionPane.showMessageDialog(b4panel, "Your product is: " + product);
			
			}
			
		});
		
		//PROGRAM 5
		JMenuItem b5item = new JMenuItem("Division");
		basicInputOutput.add(b5item);
		
		JPanel b5panel = new JPanel();
		b5panel.setLayout(null);
		
		JLabel b5label1 = new JLabel("Enter your first number here: ");
		b5panel.add(b5label1);
		b5label1.setBounds(50, 25, 250, 150);
		
		JLabel b5label2 = new JLabel("Enter your second number here: ");
		b5panel.add(b5label2);
		b5label2.setBounds(50, 100, 250, 150);
		
		JTextField b5field1 = new JTextField("");
		b5panel.add(b5field1);
		b5field1.setBounds(300, 80, 250, 40);
		
		JTextField b5field2 = new JTextField("");
		b5panel.add(b5field2);
		b5field2.setBounds(300, 155, 250, 40);
		
		JButton b5button = new JButton("QUOTIENT");
		b5panel.add(b5button);
		b5button.setBounds(250, 250, 200, 50);
		
		b5button.addActionListener( e -> {
			
			String b5string1 = b5field1.getText();
			String b5string2 = b5field2.getText();
			
			
			if (b5string1.trim().isEmpty()) {
				
				JOptionPane.showMessageDialog(b5panel, "Please input your first number" );
				
			} if (b5string2.trim().isEmpty()) {
				
				JOptionPane.showMessageDialog(b5panel, "Please input your second number" );
				
			} else {
				int b5num1 = Integer.parseInt(b5string1);
				int b5num2 = Integer.parseInt(b5string2);
				int quotient = b5num1 / b5num2;
			JOptionPane.showMessageDialog(b5panel, "Your quotient is: " + quotient);
			
			}
			
		});
		
		//NESTED IF-ELSE (5)
		
		//PROGRAM 1
		JMenuItem n1item = new JMenuItem("GRADES CALCULATOR");
		nestedIfElse.add(n1item);
		
		JPanel n1panel = new JPanel();
		n1panel.setLayout(null);
		
		JLabel n1label1 = new JLabel("Enter your first grade here: ");
		n1panel.add(n1label1);
		n1label1.setBounds(50, 40, 200, 100);
		
		JLabel n1label2 = new JLabel("Enter your second grade here: ");
		n1panel.add(n1label2);
		n1label2.setBounds(50, 90, 200, 100);
		
		JLabel n1abel3 = new JLabel("Enter your third grade here: ");
		n1panel.add(n1abel3);
		n1abel3.setBounds(50, 140, 200, 100);
		
		JLabel n1label4 = new JLabel("Enter your fourth grade here: ");
		n1panel.add(n1label4);
		n1label4.setBounds(50, 190, 200, 100);
		
		JLabel n1label5 = new JLabel("Enter your fifth grade here: ");
		n1panel.add(n1label5);
		n1label5.setBounds(50, 240, 200, 100);
		
		JTextField n1field1 = new JTextField("");
		n1panel.add(n1field1);
		n1field1.setBounds(300, 70, 200, 40);
		
		JTextField n1field2 = new JTextField("");
		n1panel.add(n1field2);
		n1field2.setBounds(300, 120, 200, 40);
		
		JTextField n1field3 = new JTextField("");
		n1panel.add(n1field3);
		n1field3.setBounds(300, 170, 200, 40);
		
		JTextField n1field4 = new JTextField("");
		n1panel.add(n1field4);
		n1field4.setBounds(300, 220, 200, 40);
		
		JTextField n1field5 = new JTextField("");
		n1panel.add(n1field5);
		n1field5.setBounds(300, 270, 200, 40);
		
		JButton n1button = new JButton("Calculate");
		n1panel.add(n1button);
		n1button.setBounds(200, 340, 150, 50);
		
		n1button.addActionListener(e -> {
			
			String grade1 = n1field1.getText();
			String grade2 = n1field2.getText();
			String grade3 = n1field3.getText();
			String grade4 = n1field4.getText();
			String grade5 = n1field5.getText();
			
			if (grade1.trim().isEmpty() || grade2.trim().isEmpty() || grade3.trim().isEmpty() || grade4.trim().isEmpty() ||grade5.trim().isEmpty()) {
				JOptionPane.showMessageDialog(n1panel, "Please fill up all fields");
				return;
			}
			
			double num1 = Double.parseDouble(grade1);
			double num2 = Double.parseDouble(grade2);
			double num3 = Double.parseDouble(grade3);
			double num4 = Double.parseDouble(grade4);
			double num5 = Double.parseDouble(grade5);
			
			double gradeTotal = (num1 + num2 + num3 + num4 + num5) / 5;
			
			
			if (gradeTotal >= 94.8) {
				
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " PASSED! 1.00");
			} else
			
			if (gradeTotal >= 89.2 || gradeTotal == 94.7) {
				
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " PASSED! 1.25");
			} else
			
			if (gradeTotal >= 83.6 || gradeTotal == 89.1) {
				
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " PASSED! 1.50");
			} else

			if (gradeTotal >= 78.0 || gradeTotal == 83.5) {
	
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " PASSED! 1.75");
			} else 
			
			if (gradeTotal >= 72.4 || gradeTotal == 77.9) {
				
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " PASSED! 2.00");
			} else 
			
			if (gradeTotal >= 66.8 || gradeTotal == 72.3) {
				
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " PASSED! 2.25");
			} else
			
			if (gradeTotal >= 61.2 || gradeTotal == 66.7) {
				
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " PASSED! 2.50");
			} else 
			
			if (gradeTotal >= 55.6 || gradeTotal == 61.1) {
				
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " PASSED! 2.75");
			} else
			
			if (gradeTotal >= 50.0 || gradeTotal == 55.5) {
				
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " PASSED! 3.00");
			} else
			
			if (gradeTotal >= 0.0 || gradeTotal == 49.9) {
				
				JOptionPane.showMessageDialog(n1panel, "Average: " + gradeTotal + " FAILED! 5.00");
			}

			
		});
		
		
		//ADDACTIONLISTENER FOR BASIC INPUT & OUTPUT
		b1item.addActionListener(e -> {
		    frame.setContentPane(b1panel);
		    frame.revalidate();
		    frame.repaint();
		});
		
		b2item.addActionListener(e -> {
		    frame.setContentPane(b2panel);
		    frame.revalidate();
		    frame.repaint();
		});
		
		b3item.addActionListener(e -> {
		    frame.setContentPane(b3panel);
		    frame.revalidate();
		    frame.repaint();
		});
		
		b4item.addActionListener(e -> {
		    frame.setContentPane(b4panel);
		    frame.revalidate();
		    frame.repaint();
		});
		
		b5item.addActionListener(e -> {
		    frame.setContentPane(b5panel);
		    frame.revalidate();
		    frame.repaint();
		});
		
		//ADDACTIONLISTENER FOR NESTED IF-ELSE
		n1item.addActionListener(e -> {
		    frame.setContentPane(n1panel);
		    frame.revalidate();
		    frame.repaint();
		});
		    
		frame.setVisible(true);
		
	}

}
