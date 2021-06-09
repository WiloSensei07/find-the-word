package miniProjet1Tchatchou;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class EnnemiCheval extends Ennemi {

	SpriteSheet spriteSheet;
	Animation animation;

	public EnnemiCheval(String lettres, float x, float y, Color color, boolean sens) {
		super(lettres, x, y, color, sens);
		this.sens = true;

		try {
			spriteSheet = new SpriteSheet("ressource/ennemicourt2.png", 100, 155);
			animation = new Animation();
			animation.addFrame(spriteSheet.getSprite(0, 0), 100);
			animation.addFrame(spriteSheet.getSprite(1, 0), 100);
			animation.addFrame(spriteSheet.getSprite(2, 0), 100);
			animation.addFrame(spriteSheet.getSprite(0, 1), 100);
			animation.addFrame(spriteSheet.getSprite(1, 1), 100);
			animation.addFrame(spriteSheet.getSprite(2, 1), 100);
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public void affiche(Graphics g) {
//		g.setColor(new Color(0, 0, 0, .5f));
//	    g.fillOval(x - 16, y - 8, 32, 16);
		g.setColor(Color.red);
		g.drawString(getLettres(), getX(), getY() - 20);
		g.drawAnimation(animation, x, y);
//	    g.drawOval(getX(), getY()+2, 10, 10); // ombre en bas des ennemis
//	    g.fillOval(getX(), getY()+2, 10, 10);
	}

}
