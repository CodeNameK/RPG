package com.mgstudios.rpg.game.level.tile;

import com.mgstudios.rpg.game.graphics.Screen;
import com.mgstudios.rpg.game.graphics.Sprite;

public class Tile {
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new Tile (Sprite.grass);
	public static Tile voidTile = new Tile (Sprite.voidSprite);
	
	public Tile (Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render (int x, int y, Screen screen) {
		screen.renderTile (x << 4, y << 4, this);
	}
	
	public boolean isSolid() {
		return false;
	}
}
