package controller;

import java.awt.Point;
import java.util.LinkedList;
import java.util.List;

import playerDefinition.Quest;

public class Engine {
	public static List<Quest> activatedQuest;
	public static MapViewController screenController;
	
	public static void init(){
		activatedQuest= new LinkedList<Quest>();
	}
	
	public static void startMap(int id,Point position){
		screenController= new MapViewController(id, position);
	}
}
