package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.WaterWorld;
import com.github.hanyaeger.tutorial.entities.Hanny;
import com.github.hanyaeger.tutorial.entities.HealthText;
import com.github.hanyaeger.tutorial.entities.swordfish.SwordFish;

public class GameLevel extends DynamicScene {
	WaterWorld waterWorld;
	
	public GameLevel(WaterWorld waterWorld) {
		this.waterWorld=waterWorld;
	}

	@Override
	public void setupScene() {
	    setBackgroundAudio("audio/ocean.mp3");
	    setBackgroundImage("backgrounds/background1.jpg");

	}

	@Override
	public void setupEntities() {
		var swordFish = new SwordFish(new Coordinate2D(getWidth()/2, getHeight()/4));
		addEntity(swordFish);
		var healthText = new HealthText(new Coordinate2D(getWidth()*0.9,20));
		healthText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		addEntity(healthText);
		var hanny = new Hanny(new Coordinate2D(0,0), healthText, waterWorld);
		addEntity(hanny);
	}

}
