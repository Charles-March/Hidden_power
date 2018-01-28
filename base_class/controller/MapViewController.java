package controller;

import java.awt.Image;
import java.awt.Point;
import java.util.List;

public class MapViewController {
	List<Image> monstersOnMap;	
	Image player;
	Point positionOnMap;
	
	public MapViewController(int mapId,Point position){
		
	}
	
	public void changeMonsterAnimation(int id, Image newImage){
		if(id<monstersOnMap.size()){
			monstersOnMap.set(id, newImage);
		}
	}
	
	public void changePlayerAnimation(Image newImage){
		player=newImage;
	}
	

}
