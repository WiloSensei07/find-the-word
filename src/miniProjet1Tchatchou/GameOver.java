package miniProjet1Tchatchou;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameOver extends BasicGameState {

	public String mouse;
	Image image, image1, image2;
	int imageX = 0;
	int imageY = 0;
	int xpos, ypos;
	Sound t;

	public GameOver(int state) {

	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		image = new Image("ressource/replaygame.png");
		image1 = new Image("ressource/exitgame.png");
		image2 = new Image("ressource/gameover.jpg");
		t = new Sound("ressource/game-over.wav");

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

		image2.draw(0, 0, 1500, 800);
		g.drawString("REPLAY GAME", 75, 40);
		image.draw(70, 70, 100, 50);
		g.drawString("EXIT GAME", 75, 130);
		image1.draw(70, 160, 100, 50);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

		t.play();
		xpos = Mouse.getX();
		ypos = Mouse.getY();
		mouse = " Souris Position X: " + xpos + " Y: " + ypos;
		System.out.println(mouse);

		Input input = gc.getInput();

		if ((xpos > 75 && xpos < 125) && (ypos < 731 && ypos > 685)) {
			if (input.isMouseButtonDown(0)) {
				gc.reinit();
				sbg.enterState(1);
			}
		}

		if ((xpos > 75 && xpos < 175) && (ypos > 160 && ypos < 260)) {
			if (input.isMouseButtonDown(0)) {
				System.exit(0);
				;
			}
		}

	}

	public int getID() {
		// TODO Auto-generated method stub
		return 5;
	}

}
