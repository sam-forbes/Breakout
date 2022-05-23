import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		
		// TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setSize(Settings.WINDOW_WIDTH + 14 , Settings.WINDOW_HEIGHT); //Windows is running app at 14px less, then Settings.WINDOW_WIDTH, despite the setSize commmand, so have manually added the pixels to the frame.
		
		// TODO: Set the title
			setTitle(Settings.WINDOW_NAME);
		
		// TODO: Set the background colour to white
			setBackground(Color.WHITE); 
		
		// TODO: Set resizable to false
			setResizable(false); 
			
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
        
		// TODO: Set visible to true
       setVisible(true);
       
       
       
	}


	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 new Breakout();
	        	 
	         }
		});

	}
}
