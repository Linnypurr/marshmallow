package marshmellow;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;
	
	public KeyInput(Handler handler){
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.objectList.size(); i++){
			GameObject tempObject = handler.objectList.get(i);
			
			if(tempObject.getId() == ID.Player){
				// key event for player one
				if(key == KeyEvent.VK_COMMA) tempObject.setVelY(-5);
				if(key == KeyEvent.VK_O) tempObject.setVelY(5);
				if(key == KeyEvent.VK_A) tempObject.setVelX(-5);
				if(key == KeyEvent.VK_E) tempObject.setVelX(5);
			}
		}	
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();

		for(int i = 0; i < handler.objectList.size(); i++){
			GameObject tempObject = handler.objectList.get(i);
		
			if(tempObject.getId() == ID.Player){
				if(key == KeyEvent.VK_COMMA) tempObject.setVelY(0);
				if(key == KeyEvent.VK_O) tempObject.setVelY(0);
				if(key == KeyEvent.VK_A) tempObject.setVelX(0);
				if(key == KeyEvent.VK_E) tempObject.setVelX(0);
				
			}
		}
	}
}

