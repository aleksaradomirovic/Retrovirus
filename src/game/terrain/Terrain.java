package game.terrain;

import java.awt.Graphics;

import game.Visible;

public class Terrain implements Visible {
	int iX, iY;
	public static final int WIDTH = 100, HEIGHT = 50;
	
	public Terrain(int x, int y) {
		iX = x;
		iY = y;
	}

	@Override
	public void draw(Graphics g) {
//		g.drawRect(x, y, WIDTH, HEIGHT);
	}
}
