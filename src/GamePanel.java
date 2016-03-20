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
	GameObject Block2;
	Timer timer;
	int x = 0;
	int y = 0;

	public void paintComponent(Graphics g) {
		Block.draw(g);
		Block2.draw(g);
	}

	GamePanel() {
		timer = new Timer(1000 / 24, this);
		BufferedImage image = null;
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("Block.png"));
		} catch (Exception e) {
			System.out.println("There was an error loading the image");
		}
		Block = new ImageObject(10, 10, 10, 10, image);
		Block2 = new GameObject(10, 20, 20, 20);
		timer.start();
	}

	public void actionPerformed(ActionEvent e) {

		repaint();
	}
}
