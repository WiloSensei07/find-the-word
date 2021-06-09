package miniProjet1Tchatchou;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState {

	public String mouse;
	Image image, image1, image2;
	int imageX = 0;
	int imageY = 0;
	int xpos, ypos;

	public Menu(int state) {

	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

		image = new Image("ressource/gogame.png");
		image1 = new Image("ressource/exitgame.png");
		image2 = new Image("ressource/debut.jpg");

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

		image2.draw(0, 0, 1500, 800);
		g.drawString("Play now!", 80, 70);
		image.draw(75, 100, 100, 50);
		g.drawString("Exit the game!", 70, 210);
		image1.draw(75, 245, 100, 50);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

		xpos = Mouse.getX();
		ypos = Mouse.getY();
		mouse = " Souris Position X: " + xpos + " Y: " + ypos;
		System.out.println(mouse);

		Input input = gc.getInput();

		if ((xpos > 75 && xpos < 175) && (ypos > 652 && ypos < 695)) {
			mouse = " zone du jeu Souris Position X: " + xpos + " Y: " + ypos;
			System.out.println(mouse);
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(1);
			}
		}

		if ((xpos > 75 && xpos < 175) && (ypos > 503 && ypos < 555)) {
			mouse = " zone de sortie Souris Position X: " + xpos + " Y: " + ypos;
			System.out.println(mouse);
			if (input.isMouseButtonDown(0)) {
				System.exit(0);
			}
		}
	}

	public int getID() {
		return 0;
	}

}