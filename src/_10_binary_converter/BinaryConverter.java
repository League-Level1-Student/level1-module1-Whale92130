package _10_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel Panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JTextField answer = new JTextField(20);
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	void run() {
		BinaryConverter binary = new BinaryConverter();
		
		button.addActionListener(this);
		Panel.add(answer);
		frame.add(Panel);
		Panel.add(button);
		button.setText("convert");
		Panel.add(label);
		answer.setVisible(true);
		frame.pack();
		frame.resize(400, 100);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		label.setText(convert(answer.getText()));
	}

}
