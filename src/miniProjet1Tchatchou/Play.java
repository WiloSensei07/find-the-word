package miniProjet1Tchatchou;

import java.util.ArrayList;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {

	public String mouse;
	Image image, image1, image2, image3, image4, image5;
	int imageX, imageY;
	int xpos, ypos;
	ArrayList<Ennemi> En;
	float compt, comptt;
	int vie, scr;
	String mot;
	boolean valider = false;
	Read read;
	Ennemi ennemiTemp;
	Sound r, s;

	public Play(int state) {

	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

		image = new Image("ressource/tireur.png");
		image1 = new Image("ressource/fond.jpg");
		image2 = new Image("ressource/fond1.jpg");
		image3 = new Image("ressource/pausegame.png");
		image4 = new Image("ressource/backgame.png");
		image5 = new Image("ressource/gogame.png");
		imageX = 0;
		imageY = 350;
		En = new ArrayList<Ennemi>();
		read = new Read();
		vie = 1000;
		scr = 0;
		mot = "";
		s = new Sound("ressource/tuyau.wav");
//		r = new Sound("ressource/sysnthetic_explosion_1.flac");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

		// g.drawString("Ici c'est le commencement!", 0, 30);
		image1.draw(0, 0, 1500, 800);
		image.draw(imageX, imageY, 0.4f);

		g.fillRect(5, 5, vie, 30);
		g.drawRoundRect(5, 5, 1010, 30, 70);
		g.drawString("SCORE: " + scr, 5, 45);
		g.drawString("PAUSE", 1060, 5);
		image3.draw(1050, 35, 100, 50);
		g.drawString("PLAY", 1210, 5);
		image5.draw(1200, 35, 100, 50);
		g.drawString("RETOUR", 1360, 5);
		image4.draw(1350, 35, 100, 50);

		for (int i = 0; i < En.size(); i++) {
			if (En.get(i) != null)
				En.get(i).affiche(g);

		}
		g.drawLine(100, 0, 100, 800);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

		xpos = Mouse.getX();
		ypos = Mouse.getY();
		mouse = " Souris Position X: " + xpos + " Y: " + ypos;
		System.out.println(mouse);

		Input input = gc.getInput();
		// if (input.isKeyDown(Input.KEY_UP)) { imageY -= 1; }
		// if (input.isKeyDown(Input.KEY_DOWN)) { imageY += 1; }
		// if (input.isKeyDown(Input.KEY_LEFT)) { imageX -= 1; }
		// if (input.isKeyDown(Input.KEY_RIGHT)) { imageX += 1; }

		for (int i = 0; i < En.size(); i++) {

			En.get(i).deplacer(delta * 20); // modifier le *20 pour les niveaux supérieurs
			if (En.get(i).collision()) {
				s.play();
				En.remove(i);
				vie -= 5;
			}
		}

		// if(comptt>= 3500) {
		//
		// image2.draw(0, 0, 1500,800);
		// comptt = 0;
		// }else {
		// comptt += delta;
		// }

		if (compt >= 3500) {

			float up = (float) ((Math.random() * 382) + 320);
			float upt = (float) ((Math.random() * 382) + 320);
			int uptt = (int) (Math.random() * 1);

			En.add(new EnnemiPieds(read.pickWord(), 1450, up, Color.orange, true));

			if (uptt == 0) {
				En.add(new EnnemiCheval(read.pickWord(), 1450, upt, Color.darkGray, false));
			}
			compt = 0;
		} else {
			compt += delta;
		}

		for (int i = 0; i < En.size(); i++) {
			if (En != null && En.get(i) != null && !mot.isEmpty()
					&& En.get(i).getLettres().charAt(0) == mot.charAt(0)) {
				ennemiTemp = En.get(i);
				break;
			}

		}

		if (valider) {
			if (ennemiTemp.getLettres().equals(mot)) {
//				r.play();
				En.remove(ennemiTemp);
				mot = "";
				scr += 5;
			} else
				mot = "";

			valider = false;
		}

		if (vie <= 0) {
			sbg.enterState(5);
		}

		if ((xpos > 1050 && xpos < 1150) && (ypos > 717 && ypos < 764)) {
			if (input.isMouseButtonDown(0)) {
				gc.pause();
			}
		}

		if ((xpos > 1200 && xpos < 1300) && (ypos > 717 && ypos < 764)) {
			if (input.isMouseButtonDown(0)) {
				gc.resume();
			}
		}

		if ((xpos > 1350 && xpos < 1450) && (ypos > 717 && ypos < 764)) {
			if (input.isMouseButtonDown(0)) {
				gc.reinit();
				sbg.enterState(1);
			}
		}
	}

	public void keyPressed(int key, char c) {

		Input input = new Input(key);
		if (key == input.KEY_A)
			mot = mot + c;
		else if (key == input.KEY_B)
			mot += c;
		else if (key == input.KEY_C)
			mot += c;
		else if (key == input.KEY_D)
			mot += c;
		else if (key == input.KEY_E)
			mot += c;
		else if (key == input.KEY_F)
			mot += c;
		else if (key == input.KEY_G)
			mot += c;
		else if (key == input.KEY_H)
			mot += c;
		else if (key == input.KEY_I)
			mot += c;
		else if (key == input.KEY_J)
			mot += c;
		else if (key == input.KEY_K)
			mot += c;
		else if (key == input.KEY_L)
			mot += c;
		else if (key == input.KEY_M)
			mot += c;
		else if (key == input.KEY_N)
			mot += c;
		else if (key == input.KEY_O)
			mot += c;
		else if (key == input.KEY_P)
			mot += c;
		else if (key == input.KEY_Q)
			mot += c;
		else if (key == input.KEY_R)
			mot += c;
		else if (key == input.KEY_S)
			mot += c;
		else if (key == input.KEY_T)
			mot += c;
		else if (key == input.KEY_U)
			mot += c;
		else if (key == input.KEY_V)
			mot += c;
		else if (key == input.KEY_W)
			mot += c;
		else if (key == input.KEY_X)
			mot += c;
		else if (key == input.KEY_Y)
			mot += c;
		else if (key == input.KEY_Z)
			mot += c;

		if (key == Input.KEY_ENTER) {

			valider = true;
		}

	}

	public int getID() {
		return 2;
	}

}
