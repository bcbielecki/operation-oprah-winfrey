/**
 * 
 * @author Benjamen Bielecki, Dennis Perepech
 * @version 1.0
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;

public class Asteroid extends Obstacle {
	public Asteroid(double x, double y, double w, double h, double vx, double vy) {
		super(setImage(), x, y, w, h, vx, vy);

	}

	private static Image setImage() {
		Image img = null;
		try {
			double temp = Math.random();
			int num = 1;
			if(temp >= 0 && temp < 0.33) {
				num = 2;
			}
			else if(temp >= 0.33 && temp < 0.66) {
				num = 3;
			}
			img = new Image(new FileInputStream("media/images/obstacles/asteroid" + num + ".png"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return img;
	}
	
	@Override
	public boolean checkPlayerCollision(Player sprite) {
       return checkCollision(sprite);
	}
	
	@Override
	public boolean fromTop() {
		return false;
	}		
}