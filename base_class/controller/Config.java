package controller;

import alives.Player;
import language.English;
import language.French;
import language._Language;

public class Config {
	public static _Language language;
	public static Player player;
	
	public static void init(String lang){
		if(lang.equalsIgnoreCase("EN")){
			language=new English();
		}
		else if(lang.equalsIgnoreCase("FR")){
			language=new French();
		}
	}
}
