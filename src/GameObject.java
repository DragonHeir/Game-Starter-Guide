import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	Color color;

	GameObject(int x, int y, int width, int height) {
		this.x = x; 
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public GameObject(int x2, int y2, int width2, int height2, BufferedImage image) {
		// TODO Auto-generated constructor stub
	}
	public void update(){
		x++;
	}
	public void draw(Graphics g) {

	}
}
