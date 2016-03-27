import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	BufferedImage image;
	ImageObject Block;
	Timer gametimer;
	int x = 0;
	int y = 0;
	Color red;

	public void paintComponent(Graphics g) {
		Block.draw(g);
	}

	GamePanel() {
		gametimer = new Timer(1000 / 12, this);
		BufferedImage image = null;
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("Block.png"));
		} catch (Exception e) {
			System.out.println("There was an error loading the image");
		}
		Block = new ImageObject(10, 10, 20, 20, image);
		gametimer.start();
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		Block.update();
		
	}
}
