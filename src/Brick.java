import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int x, int y) {
		// TODO: Set x using the parameter
		this.x = x; 
		
		// TODO: Set y using the parameter
		this.y = y; 
		
		// TODO: Set the width and height of the brick using Settings.BRICK_WIDTH/HEIGHT
		this.height = Settings.BRICK_HEIGHT;
		this.width = Settings.BRICK_WIDTH;
	}

	public boolean isBroken() {
		
		// TODO: Return the correct variable
		if (this.broken == true) { 
			return true; 
		}
		else { 
			return false; 
		}
	}
	public void setBroken(boolean b) {
		// TODO: Set the broken variable using the parameter given
	if ( b = true ) { 
		this.broken = true; 
	} 
	
	if (b = false)  { 
		this.broken = false; 
	}
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
