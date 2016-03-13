import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer Timer;
	int x = 0;
	int y = 0;
	boolean MoveRight;
	boolean MoveDown;
	boolean MoveLeft;
	boolean MoveUp;

	public void paintComponent(Graphics g) {
		g.fillRect(x, y, 16, 16);
	}

	GamePanel() {
		Timer = new Timer(1000 / 24, this);
		Timer.start();
	}

	public void actionPerformed(ActionEvent e) {

		if (x <= 0 && y <= 0) {
			MoveUp = false;
			MoveRight = true;
		}
		if (x >= 480 && y <= 0) {
			MoveRight = false;
			MoveDown = true;
		}
		if (x >= 480 && y >= 460) {
			MoveDown = false;
			MoveLeft = true;
		}
		if (x <= 0 && y >= 460) {
			MoveLeft = false;
			MoveUp = true;
		}

		if (MoveRight) {
			x = x + 20;
		}
		if (MoveDown) {
			y = y + 20;
		}
		if (MoveLeft) {
			x = x - 20;
		}
		if (MoveUp) {
			y = y - 20;
		}
		repaint();
	}
}
