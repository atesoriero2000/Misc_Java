import javax.swing.*;

import java.awt.event.*;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.text.NumberFormat;

import javax.swing.border.*;


public class ChangeEventListener extends JFrame{
	
	JButton button1;
	JLabel label1, label2, label3;
	JTextField textField1, textField2;
	JCheckBox dollarSign, commaSeperator;
	JRadioButton addNums, subtractNums, MultNums, divideNums;
	JSlider howManyTimes;
	
	double number1, number2, totalCalc;
	
	
	public static void main(String[] args){
		
			new ChangeEventListener();
	
		
	}
	
	
	public ChangeEventListener(){
		
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("My Thrid Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton ("Calculate");
		ButtonListener lButton = new ButtonListener();
		button1.addActionListener(lButton);
		thePanel.add(button1);
		
		label1 = new JLabel("Number 1");
		thePanel.add(label1);
		textField1 = new JTextField("",5);
		thePanel.add(textField1);
		
		label2 = new JLabel("Number 2");
		thePanel.add(label2);
		textField2 = new JTextField("",5);
		thePanel.add(textField2);
		
		dollarSign = new JCheckBox("Dollars");
		commaSeperator = new JCheckBox("Commas");
		JPanel formatPanel = new JPanel();
		
		formatPanel.add(dollarSign);
		formatPanel.add(commaSeperator, true);
		Border formatBorder = BorderFactory.createEtchedBorder();
		formatPanel.setBorder(formatBorder);
		
		thePanel.add(formatPanel);
		
		
		addNums = new JRadioButton ("Add");
		subtractNums = new JRadioButton ("Subtract");
		MultNums = new JRadioButton ("Multiply");
		divideNums = new JRadioButton ("Divide");
		
		ButtonGroup operation = new ButtonGroup();
		
		operation.add(addNums);
		operation.add(subtractNums);
		operation.add(MultNums);
		operation.add(divideNums);
		
		JPanel operPanel = new JPanel();
		
		Border operBorder = BorderFactory.createTitledBorder("Operation");
		operPanel.setBorder(operBorder);
	
		operPanel.add(addNums);
		operPanel.add(subtractNums);
		operPanel.add(MultNums);
		operPanel.add(divideNums);
		addNums.setSelected(true);
		
		thePanel.add(operPanel);
		
		
		
		label3 = new JLabel("Perform How Many Times?: 1");
		thePanel.add(label3);
		
		howManyTimes = new JSlider(0, 99, 1);
		howManyTimes.setMinorTickSpacing(1);
		howManyTimes.setMajorTickSpacing(10);
		howManyTimes.setPaintTicks(true);
		howManyTimes.setPaintLabels(true);
		
		SliderListener lSlider = new SliderListener();
		howManyTimes.addChangeListener(lSlider);
		
		thePanel.add(howManyTimes);
		this.add(thePanel);
		this.setVisible(true);
	}
	
	
	
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == button1){
			
				try{
					number1 = Double.parseDouble(textField1.getText());
					number2 = Double.parseDouble(textField2.getText());	
				}
				
				catch(NumberFormatException excep){
					JOptionPane.showMessageDialog(ChangeEventListener.this, "Please Enther the Right info", "Error", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				
				
				
				if(addNums.isSelected()){
					totalCalc = (number1 + number2) * howManyTimes.getValue();
				}else if(subtractNums.isSelected()){
					totalCalc = (number1 - number2) * howManyTimes.getValue();
				}else if(MultNums.isSelected()){
					totalCalc = (number1 * number2) * howManyTimes.getValue();
				}else{
					totalCalc = (number1 / number2) * howManyTimes.getValue();
				}
				
				
				if(dollarSign.isSelected()){
					NumberFormat numFormat = NumberFormat.getCurrencyInstance();
					JOptionPane.showMessageDialog(ChangeEventListener.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
					
				}else if(commaSeperator.isSelected()){
					NumberFormat numFormat = NumberFormat.getNumberInstance();
					JOptionPane.showMessageDialog(ChangeEventListener.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
					
				}else{
					JOptionPane.showMessageDialog(ChangeEventListener.this, totalCalc, "Solution", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
			
		}
		
	}
	
	private class SliderListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			
			if(e.getSource() == howManyTimes){
				label3.setText("Perform How Many Times?: " + howManyTimes.getValue());
			}
			
		}
		
	}
}