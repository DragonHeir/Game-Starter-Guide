import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageObject extends GameObject {

	BufferedImage image;

	ImageObject(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		this.image = image;

	}

	public void update(){
		if (InputManager.LEFT_ARROW_KEY){
			x--;
		}
	}
	public void draw(Graphics g) {
		g.drawImage(image, x, y, width, height, null);
	}
}
