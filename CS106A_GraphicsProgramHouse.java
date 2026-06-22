/**
 * Generates a simple picture of a house with a peaked roof,
 * two windows, and a door with a circular doorknob.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class CS106A_GraphicsProgramHouse extends GraphicsProgram
{
	GRect baseRect = new GRect(250, 250, 150, 75);
	double baseRectXOrigin = baseRect.getX();
	double baseRectYOrigin = baseRect.getY();
	double baseRectWidth = baseRect.getWidth();
	double baseRectHeight = baseRect.getHeight();
	
	public void run()
	{
		createBase();
		createRoof();
	}
	
	
	private void createBase()
	{
		baseRect.setFilled(false);
		baseRect.setColor(Color.PINK);
		add(baseRect);
		println("start x = " + baseRectXOrigin);
		println("start y = " + baseRectYOrigin);
	}
	
	
	private void createRoof()
	{
		GLine roofLine1 = new GLine(
				baseRectXOrigin, 
				baseRectYOrigin, 
				baseRectXOrigin + (baseRectWidth / 2), 
				baseRectYOrigin - 50
		);
		roofLine1.setColor(Color.PINK);
		add(roofLine1);
		
		GLine roofLine2 = new GLine(
				baseRectXOrigin + (baseRectWidth / 2), 
				baseRectYOrigin - 50, 
				baseRectXOrigin + baseRectWidth, 
				baseRectYOrigin
		);
		roofLine2.setColor(Color.PINK);
		add(roofLine2);
	}
	
	
	private void createDoor()
	{
		// windows & doorknob will depend on door's 
		// position so making that first
	}
	
	
	private void createWindows()
	{
		
	}
}