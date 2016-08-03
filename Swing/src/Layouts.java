import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;


public class Layouts extends JFrame{
	
	JButton button1, button2, button3, button4, button5;
	
	public static void main(String[] args){
		
		new Layouts();
	}
	
	public Layouts(){
		
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Swing Layouts");
		
		JPanel thePanel = new JPanel();
		
		
		
		
		/* FLOW LAYOUT
		thePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		
		thePanel.add(button1);
		thePanel.add(button2);
		thePanel.add(button3);
		*/
		
		
		
		
		
		//BORDER LAYOUT
		thePanel.setLayout(new BorderLayout());
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		
		//thePanel.add(button1, BorderLayout.NORTH);
		//thePanel.add(button2, BorderLayout.SOUTH);
		thePanel.add(button3, BorderLayout.EAST);
		thePanel.add(button4, BorderLayout.WEST);
		thePanel.add(button5, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		
		thePanel.add(buttonPanel, BorderLayout.NORTH);
		
		
		
		
		
		
		/* BOX LAYOUT
		Box theBox = Box.createHorizontalBox();
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		
		
		theBox.add(button1);
		theBox.add(Box.createHorizontalStrut(10));
		theBox.add(button2);
		theBox.add(Box.createHorizontalGlue());
		theBox.add(button3);
		*/
	
		//this.add(theBox);
		this.add(thePanel);
		this.setVisible(true);
		
	}
	
}