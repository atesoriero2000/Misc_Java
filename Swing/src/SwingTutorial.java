import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class SwingTutorial extends JFrame{
	
	public static void main(String[] args){
		
		new SwingTutorial(); //creates a frame
		
	}
	
	
	public SwingTutorial(){
		
		this.setSize(400,400);//sets the dimensions for a window
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();//hold the length and with of screen
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		this.setLocation(xPos, yPos);
		
		this.setResizable(false);//unresizable
		
		//this.setLocationRelativeTo(null);//positions window at middle of screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//make the frame close on exit
		
		this.setTitle("My First Frame");//sets title
		
		
		JPanel thePanel = new JPanel();//creates a panel
		
		
		
		JLabel label1 = new JLabel("Tell me something");//creates a label
		
		thePanel.add(label1);//adds the label to the panel
		
		label1.setText("New Text");//changes the text
		
		label1.setToolTipText("Doesnt do anything");//dispays message when cursor is over it
		
		
		JButton button1 = new JButton("Send");
		
		//button1.setBorderPainted(false);//gets ride of border
		
		//button1.setContentAreaFilled(false);//gets rid of bakround
		
		button1.setText("New Button");
		
		button1.setToolTipText("Its a button");
		
		thePanel.add(button1);
		
		
		JTextField textField1 = new JTextField("Type here", 15);//creats a text field
		
		textField1.setColumns(10);//changes the length
		
		textField1.setText("New Text Field");
		
		textField1.setToolTipText("Its a text field");
		
		thePanel.add(textField1);
		
		
		JTextArea textArea1 = new JTextArea(15, 20);//creates a text area with size
		
		textArea1.setText("This is a text area dbsndbfgfe d d az which is like a text field but is 2d and has a scroll bar");
		
		textArea1.setLineWrap(true);//skips to next line when text reaches end
		
		textArea1.setWrapStyleWord(true);
		
		int numOfLines = textArea1.getLineCount();//the number of new lines
		
		textArea1.append("\nNumber Of New Lines: " + numOfLines);
		
		//create a scrool bar to textArea1
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		//thePanel.add(textArea1);
		thePanel.add(scrollbar1);
		
		
		
		this.add(thePanel);//adds the panel to the frame
		
		this.setVisible(true);//opens a window
		
		textField1.requestFocus();//sets cursor to 
		
	}
}