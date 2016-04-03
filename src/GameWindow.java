import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class GameWindow implements KeyListener, MouseListener, MouseMotionListener
{
	JFrame Frame;
	GamePanel Panel;
	public static final int width = 500;
	public static final int height = 500;

	public static void main(String[] args) {
		GameWindow g = new GameWindow();
	}

	GameWindow() {
		Frame = new JFrame("Game Template");
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel = new GamePanel();
		Frame.addKeyListener(this);
		Frame.addMouseListener(this);
		Frame.addMouseMotionListener(this);

		Frame.add(Panel);
		Frame.setSize(500, 500);
	}
	public void mouseDragged(MouseEvent e) {
		InputManager.mouseDragged(e);

		
	}
	public void mouseMoved(MouseEvent e) {
		InputManager.mouseMoved(e);

		
	}
	public void mouseClicked(MouseEvent e) {
		InputManager.mouseClicked(e);

		
	}
	public void mousePressed(MouseEvent e) {
		InputManager.mousePressed(e);

		
	}
	public void mouseReleased(MouseEvent e) {
		InputManager.mouseReleased(e);

		
	}
	public void mouseEntered(MouseEvent e) {
		InputManager.mouseEntered(e);

		
	}
	public void mouseExited(MouseEvent e) {
		InputManager.mouseExited(e);

		
	}
	public void keyTyped(KeyEvent e) {
		InputManager.keyTyped(e);

		
	}
	public void keyPressed(KeyEvent e) {
		InputManager.keyPressed(e);

		
	}
	public void keyReleased(KeyEvent e) {
		InputManager.keyReleased(e);

		
	}
}
