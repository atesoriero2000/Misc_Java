import javax.swing.*;

import java.awt.event.*;
import java.awt.Color;

public class Swing extends JFrame{
	
	JButton button1;
	JComboBox combo;
	static Swing frame;
	static JPanel textFieldPanel, buttonPanel, mainPanel;
	
	public static void main(String[] args){
		
		frame = new Swing();
		//frame.remove(textFieldPanel);
		
	}
	
	public Swing(){
		
		this.setSize(400, 400);
		this.setTitle("Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ButtonListener lButton = new ButtonListener();
		
		mainPanel = new JPanel();
		
		String[] stuff = new String[] { "Buttons" , "Text Field" };
		combo = new JComboBox(stuff);
		combo.setSelectedIndex(-1);
		combo.addActionListener(lButton);
		mainPanel.add(combo);
		
		
		
		
		buttonPanel = new JPanel();
		button1 = new JButton("Test");
		buttonPanel.add(button1);
		
		
		textFieldPanel = new JPanel();
		JTextField t = new JTextField("Test",5);
		textFieldPanel.add(t);
		
		this.add(mainPanel);
		this.add(buttonPanel);
		this.add(textFieldPanel);
		this.setVisible(true);
		
	}
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == combo){
				
				System.out.println(combo.getSelectedIndex());
				
				if(combo.getSelectedIndex() == 0){
					
					//frame.add(buttonPanel);
					frame.remove(textFieldPanel);
				}
				if(combo.getSelectedIndex() == 1){
					
					//frame.add(textFieldPanel);
					frame.remove(mainPanel);
				}
				
			}
			
		}
		
	}
}