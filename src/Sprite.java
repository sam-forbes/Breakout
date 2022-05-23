import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;
	
	// Note: This should only set a single value, they can be done in a single statement
	public void setX(int x) {
		// TODO | #Completed
		this.x = x; 
	}
	public void setY(int y) { 
		// TODO | #Completed
		this.y = y; 
	}
	public void setWidth(int width) { 
		// TODO | #Completed
		this.width = width;
	}
	public void setHeight(int height) { 
		// TODO | #Completed
		this.height = height; 
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return this.x;	// TODO: Return correct value |#Completed 
	}
	public int getY() { 
		return this.y;	// TODO: Return correct value | #Completed 
	}
	public int getWidth() { 
		return this.width;	// TODO: Return correct value | #Completed 
	}
	public int getHeight() { 
		return this.height;	// TODO: Return correct value | #Completed
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
