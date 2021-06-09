package miniProjet1Tchatchou;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {

	public static final String gamename = " Tchatchou's Game! ";
	public static final int menu = 0;
	public static final int choixniveau = 1;
	public static final int play = 2;
	public static final int playm = 3;
	public static final int playh = 4;
	public static final int gameover = 5;

	public Game(String gamename) {

		super(gamename);
		this.addState(new Menu(play));
		this.addState(new ChoixNiveau(play));
		this.addState(new Play(play));
		this.addState(new Playm(play));
		this.addState(new Playh(play));
		this.addState(new GameOver(play));
	}

	public void initStatesList(GameContainer gc) throws SlickException {

		this.getState(menu).init(gc, this);
		this.getState(choixniveau).init(gc, this);
		this.getState(play).init(gc, this);
		this.getState(playm).init(gc, this);
		this.getState(playh).init(gc, this);
		this.getState(gameover).init(gc, this);
		this.enterState(menu);

	}

	public static void main(String[] args) {

		AppGameContainer appgc;

		try {
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(1500, 800, false);
			appgc.setShowFPS(false);
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}

	}

}
