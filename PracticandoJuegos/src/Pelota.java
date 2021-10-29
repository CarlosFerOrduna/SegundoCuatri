
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Pelota {
	private static final int DIAMETER = 30;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private Game game;

	public Pelota(Game game) {
		this.game= game;
	}

	void move() {
		if (x + xa < 0)
			xa = game.speed;
		if (x + xa > game.getWidth() - DIAMETER)
			xa = -game.speed;
		if (y + ya < 0)
			ya = game.speed;
		if (y + ya > game.getHeight() - DIAMETER)
			game.gameOver();
		if (collision()){
			ya = -game.speed;
			y = game.raqueta.getTopY() - DIAMETER;
			game.speed++;
		}
		x = x + xa;
		y = y + ya;
	}

	private boolean collision() {
		return game.raqueta.getBounds().intersects(getBounds());
	}

	public void paint(Graphics2D g) {
		g.fillOval(x, y, DIAMETER, DIAMETER);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, DIAMETER, DIAMETER);
	}
}