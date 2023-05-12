package com.mygdx.spacerocks;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class SpaceRocksGame extends BaseGame {
	public void create() {
		super.create();
		setActiveScreen(new LevelScreen());
	}
}
