package miniProjet1Tchatchou;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class ChoixNiveau extends BasicGameState {

	public String mouse;
	Image image, image1, image2;
	int imageX = 0;
	int imageY = 0;
	int xpos, ypos;

	public ChoixNiveau(int state) {

	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

		image1 = new Image("ressource/backgame.png");
		image2 = new Image("ressource/debut1.jpg");

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

		image2.draw(0, 0, 1500, 800);
		g.drawString("NIVEAU 1", 75, 40);
		g.fillRect(75, 70, 100, 50);
		g.drawString("NIVEAU 2", 75, 130);
		g.fillRect(75, 160, 100, 50);
		g.drawString("NIVEAU 3", 75, 220);
		g.fillRect(75, 247, 100, 50);
		g.drawString("Back to Main Menu!", 75, 370);
		image1.draw(75, 400, 100, 50);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

		xpos = Mouse.getX();
		ypos = Mouse.getY();
		mouse = " Souris Position X: " + xpos + " Y: " + ypos;
		System.out.println(mouse);

		Input input = gc.getInput();

		if ((xpos > 75 && xpos < 175) && (ypos < 731 && ypos > 685)) {
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(2);
			}
		}

		if ((xpos > 75 && xpos < 175) && (ypos > 588 && ypos < 639)) {
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(3);
			}
		}

		if ((xpos > 75 && xpos < 175) && (ypos > 504 && ypos < 552)) {
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(4);
			}
		}

		if ((xpos > 75 && xpos < 175) && (ypos > 350 && ypos < 397)) {
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(0);
			}
		}
	}

	public int getID() {
		return 1;
	}

}