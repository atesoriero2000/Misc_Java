import javax.swing.*;
import java.awt.event.*;

public class EventsTutorial extends JFrame{
	
	JButton button;
	JTextField text;
	JTextArea area;
	int click;
	
	public static void main(String[] args){
		
		new EventsTutorial();
		
	}
	
	public EventsTutorial(){
		
		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		
		
		button = new JButton("TEST");
		
		ButtonListener lButton = new ButtonListener();
		
		button.addActionListener(lButton);
		
		thePanel.add(button);
		
		
		text = new JTextField("", 15);
		
		TextListener lText = new TextListener();
		
		text.addKeyListener(lText);
		
		thePanel.add(text);
		
		
		area = new JTextArea(15,20);
		
		area.setText("This Is a test click button to test");
		
		area.setLineWrap(true);
		
		//area.setWrapStyleWord(true);
		
		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		thePanel.add(scroll);
		
		
		FrameListener lFrame = new FrameListener();
		
		this.addWindowListener(lFrame);
		
		
		this.add(thePanel);
		
		this.setVisible(true);
		
		
		PadListener lForMouse = new PadListener();
		
		thePanel.addMouseListener(lForMouse);
		
	}
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == button){
			
				click++;
				
				area.setText("");
				area.append("Times button clicked: " + click + "\n");
				
			}
		}
		
	}
	
	private class TextListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			if(e.getKeyChar() == ' '){
				area.setText("");
			}else{
				area.append("Key Hit: " + e.getKeyChar() + "\n");
			}
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class PadListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			area.append("Mouse Panel Pos: " + e.getX() + " " + e.getY() + "\n");
			area.append("Mouse Screen Pos: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n"); 
			area.append("Mouse Button: " + e.getButton()  + "\n"); 
			area.append("Mouse Clicks: " + e.getClickCount()  + "\n");
			
		}


		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class FrameListener implements WindowListener{

		public void windowActivated(WindowEvent e) {
			area.append("Window Activated\n");
			
		}

		// Called when window is closed using dispose
		// this.dispose(); can be used to close a window
		
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Called when the window is closed from the menu
		
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Called when a window is no longer the active window
		
		public void windowDeactivated(WindowEvent e) {
			area.append("Window Activated\n");
			
		}

		// Called when the window goes from minimized to a normal state
		
		public void windowDeiconified(WindowEvent arg0) {
			area.append("Window in Normal State\n");
			
		}

		// Called when the window goes from normal to a minimized state
		
		public void windowIconified(WindowEvent arg0) {
			area.append("Window Minimized\n");
			
		}

		// Called when the window is first created
		
		public void windowOpened(WindowEvent arg0) {
			area.append("Window Created\n");
			
		}
		
	}
}