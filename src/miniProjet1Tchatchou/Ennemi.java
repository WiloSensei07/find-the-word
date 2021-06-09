package miniProjet1Tchatchou;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public abstract class Ennemi {

	protected String lettres;
	protected float x, y;
	protected boolean sens;
	protected Color color;

	public Ennemi(String lettres, float x, float y, Color color, boolean sens) {

		this.lettres = lettres;
		this.x = x;
		this.y = y;
		this.sens = sens;
	}

//	public void render( Graphics g);
//	public void update( int delta );

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String getLettres() {
		return lettres;
	}

	public void setLettres(String lettres) {
		this.lettres = lettres;
	}

	public void affiche(Graphics g) {

//		g.setColor(Color.blue);
//		g.drawString(getLettres(), getX(), getY() - 20);
//		g.fillRect(getX(), getY(), 50, 50);
	}

	public void deplacer(float v) {

		if (sens == true) {
			this.setX(this.getX() - v / 500);
		}

		if (sens == false) {
			this.setX(this.getX() - v / 1000);
		}
	}

	public boolean collision() {
		return x <= 100;
	}

}
