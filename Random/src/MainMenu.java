import javax.swing.*;

import java.awt.event.*;

public class MainMenu extends JFrame{
	
	JRadioButton question1, question2, question3, question4, question5, 
	question6, question7, question8, question9, question10;
	
	JButton results,makeQuiz;
	static MainMenu hi;
	
	
	
	public static void main(String[] args) {
		
		hi = new MainMenu();
		
	}
	
	public MainMenu(){
		
		this.setSize(330,520);
		this.setTitle("Quiz maker");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		ButtonListener Listener = new ButtonListener();
		
		makeQuiz = new JButton("Make Quiz");
		makeQuiz.addActionListener(Listener);
		thePanel.add(makeQuiz);
		
		
		
		
		this.add(thePanel);
		this.setVisible(true);

		
	}

	
	
	public class Quiz extends JFrame{
		
		public Quiz(){
			
			this.setSize(330,520);
			this.setTitle("Quiz maker");
			this.setLocation(100, 100);
			this.setResizable(false);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
			
			
			
		}
		
	}
	
	public class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == makeQuiz){
				new Quiz();
			}
			
			
		}
		
	}

}
