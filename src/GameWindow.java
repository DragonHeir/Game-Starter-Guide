import javax.swing.JFrame;

public class GameWindow {
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

		Frame.add(Panel);
		Frame.setSize(500, 500);
	}

}
