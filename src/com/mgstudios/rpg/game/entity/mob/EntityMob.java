package com.mgstudios.rpg.game.entity.mob;

import com.mgstudios.rpg.game.entity.Entity;
import com.mgstudios.rpg.game.graphics.Sprite;

public abstract class EntityMob extends Entity {
	protected Sprite sprite;
	protected int dir;
	protected boolean moving;
	
	public void move (int xMove, int yMove) {
		if (xMove > 0) dir = 1;
		if (xMove < 0) dir = 3;
		if (yMove > 0) dir = 2;
		if (yMove < 0) dir = 0;
		
		
		if (!collision()) {
			x += xMove;
			y += yMove;
		}
	}
	
	public void update() {
		
	}
	
	public void render() {
		
	}
	
	private boolean collision() {
		return false;
	}
}
