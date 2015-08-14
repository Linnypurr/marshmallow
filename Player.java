package marshmellow;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject { //tester

	
	public Player(int x, int y, ID id) {
		super(x, y, id);
		
	}

	public void tick() {
		x += velX;
		y += velY;
	}

	public void render(Graphics g) {
		if(id == ID.Player)g.setColor(Color.white);
		else g.setColor(Color.green);
		g.fillRect(x, y, 32, 32);
		
	}

}
