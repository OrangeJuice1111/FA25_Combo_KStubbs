import javax.swing.JFrame;

public class GoL_driver {

	public static void main(String[] args) {
		String title = "Kyle's Conway's Game of Life";
		Conway game = new Conway();
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game.getGrid());
		frame.pack();
		frame.setVisible(true);
		game.mainloop();

	}

}
