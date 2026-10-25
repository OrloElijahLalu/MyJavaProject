package JAVA_1;

import javax.swing.*;

public class PRACTICE {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("GUI");
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JLabel label1 = new JLabel("Insert your first number here: ");
		label1.setBounds(20, 20, 200, 50);
		frame.add(label1);
		
		JLabel label2 = new JLabel("Insert your second number here: ");
		label2.setBounds(20, 60, 200, 50);
		frame.add(label2);
		
		JButton button1 = new JButton("Compute");
		frame.add(button1);
		button1.setBounds(200, 500, 200, 50);
		
		JTextField field1 = new JTextField("");
		frame.add(field1);
		field1.setBounds(300, 30, 200, 25);
		
		JTextField field2 = new JTextField("");
		frame.add(field2);
		field2.setBounds(300, 80, 200, 25);
		
		JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(20, 140, 200, 25);
        frame.add(resultLabel);
        
        JRadioButton additionRadio = new JRadioButton("Addition");
        additionRadio.setBounds(30, 250, 100, 30);

        JRadioButton subtractionRadio = new JRadioButton("Subtraction");
        subtractionRadio.setBounds(140, 250, 120, 30);

        frame.add(additionRadio);
        frame.add(subtractionRadio);
        
        ButtonGroup Operation = new ButtonGroup();
        
        Operation.add(subtractionRadio);
        Operation.add(additionRadio);

		button1.addActionListener(e -> {
			
			 int num1 = Integer.parseInt(field1.getText());
             int num2 = Integer.parseInt(field2.getText());
             int result = 0;
	            
	            if (additionRadio.isSelected()) {
                    result = num1 + num2;
                } else if (subtractionRadio.isSelected()) {
                    result = num1 - num2;
                } 
	            
	            resultLabel.setText("Result: " + result);
	        });
		
		
		
		frame.setVisible(true);
	}

}
