import java.awt.event.*;

import javax.swing.*;


public class ComboBox extends JFrame{
	
	JComboBox favoriteShows;
	JButton button1;
	String infoOnComponent = "";
	
	public static void main(String[] args){
		
		new ComboBox();
		
	}
	
	public ComboBox(){
		
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("My Forth Frame");
		
		JPanel thePanel = new JPanel();
		
		String[] shows = {"Breaking Bad", "The Walking Dead", "Mythbusters"};
		favoriteShows = new JComboBox(shows);
		favoriteShows.addItem("How Its Made");
		thePanel.add(favoriteShows);
		
		button1 = new JButton ("Get Answer");
		ButtonListener lButton = new ButtonListener();
		button1.addActionListener(lButton);
		thePanel.add(button1);
		
		this.add(thePanel);
		this.setVisible(true);
		
		favoriteShows.insertItemAt("Dirty Jobs", 1);
		favoriteShows.setMaximumRowCount(3);
		favoriteShows.removeItem("How Its Made");
	}
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1){
				
				favoriteShows.setEditable(true);
				
				infoOnComponent += "Item At 0: " + favoriteShows.getItemAt(0);
				infoOnComponent += "\nNum of Shows: " + favoriteShows.getItemCount();
				infoOnComponent += "\nSelected ID: " + favoriteShows.getSelectedIndex();
				infoOnComponent += "\nSelected Value: " + favoriteShows.getSelectedItem();
				infoOnComponent += "\n Are Editable: " + favoriteShows.isEditable();
				
				JOptionPane.showMessageDialog(ComboBox.this, infoOnComponent, "Info", JOptionPane.INFORMATION_MESSAGE);
				infoOnComponent = "";
			}
			
		}
		
	}
}