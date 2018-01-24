package controller;

import java.util.LinkedList;
import java.util.List;

import playerDefinition.Quest;

public class Engine {
	public static List<Quest> activatedQuest;
	
	public static void init(){
		activatedQuest= new LinkedList<Quest>();
	}
}
