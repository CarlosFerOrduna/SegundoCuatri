import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {

	Pelota pelota = new Pelota(this);
	Raqueta	 raqueta = new Raqueta(this);
	int speed = 1;

	private int getScore() {
		return speed - 1;
	}

	public Game() {
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent evento) {
			}

			@Override
			public void keyReleased(KeyEvent evento) {
				raqueta.keyReleased(evento);
			}

			@Override
			public void keyPressed(KeyEvent evento) {
				raqueta.keyPressed(evento);
			}
		});
		setFocusable(true);
		
	}

	private void move() {
		pelota.move();
		raqueta.move();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		pelota.paint(g2d);
		raqueta.paint(g2d);

		g2d.setColor(Color.green);
		g2d.setFont(new Font("Verdana", Font.BOLD, 30));
		g2d.drawString(String.valueOf(getScore()), 10, 30);
	}

	public void gameOver() {
		JOptionPane.showMessageDialog(this, "tu puntuacion es: " + getScore(),
				"perdiste", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
		Game game = new Game();
		frame.add(game);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) {
			game.move();
			game.repaint();
			Thread.sleep(10);
		}
	}
}