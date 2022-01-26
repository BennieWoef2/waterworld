package com.github.hanyaeger.tutorial.entities.swordfish;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class SwordFish extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {

	public SwordFish(Coordinate2D initialLocation) {
		super(initialLocation);
	    setMotion(2, 270d);
	}

	@Override
	protected void setupEntities() {
		SwordFishSprite sprite = new SwordFishSprite(new Coordinate2D(0,0));
		addEntity(sprite);
		HitBox hitBox = new HitBox(new Coordinate2D(0, 40));
		hitBox.setAnchorPoint(AnchorPoint.CENTER_LEFT);
		addEntity(hitBox);
	}
	
	@Override
	public void notifyBoundaryCrossing(SceneBorder border) {
		setAnchorLocationX(getSceneWidth());
		
	}
}
