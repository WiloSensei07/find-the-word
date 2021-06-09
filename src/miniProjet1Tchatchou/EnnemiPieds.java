package miniProjet1Tchatchou;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class EnnemiPieds extends Ennemi {

	SpriteSheet spriteSheet;
	Animation animation;

	public EnnemiPieds(String lettres, float x, float y, Color color, boolean sens) {
		super(lettres, x, y, color, sens);
		this.sens = false;

		try {
			spriteSheet = new SpriteSheet("ressource/ennemimarche1.png", 90, 150);
			animation = new Animation();
			animation.addFrame(spriteSheet.getSprite(0, 0), 100);
			animation.addFrame(spriteSheet.getSprite(1, 0), 100);
			animation.addFrame(spriteSheet.getSprite(2, 0), 100);
			animation.addFrame(spriteSheet.getSprite(3, 0), 100);
			animation.addFrame(spriteSheet.getSprite(4, 0), 100);
			animation.addFrame(spriteSheet.getSprite(2, 0), 100);
			animation.addFrame(spriteSheet.getSprite(6, 0), 100);
			animation.addFrame(spriteSheet.getSprite(7, 0), 100);
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public void affiche(Graphics g) {
//		g.setColor(new Color(0, 0, 0, .5f));
//	    g.fillOval(x - 16, y - 8, 32, 16);
		g.setColor(Color.blue);
		g.drawString(getLettres(), getX(), getY() - 20);
		g.drawAnimation(animation, x, y);
	}

}
