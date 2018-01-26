package bddController;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import alives.Monster;

public class MonsterReader {
	
	private static class MonsterParser extends DefaultHandler{
		
		private boolean bhp;
		private boolean bmovespeed;
		private boolean battackspeed;
		private boolean bdifficulty;
		private boolean bpattern;
		
		
		
		private float moveSpeed;
		private int HP;
		private float attackSpeed;
		private float difficulty;
		private String pattern;
		
		public Monster monster;
		
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

			if (qName.equalsIgnoreCase("baseHP")){ 
				bhp=true;
			} else if (qName.equalsIgnoreCase("baseMoveSpeed")) {
				bmovespeed=true;
			} else if (qName.equalsIgnoreCase("baseAttackSpeed")) {
				battackspeed = true;
			} else if (qName.equalsIgnoreCase("difficultyRate")){
				bdifficulty = true;
			} else if (qName.equalsIgnoreCase("movementPattern")){
				bpattern = true;
			}
		}
		
			public void endElement(String uri, String localName, String qName) throws SAXException {
				if (qName.equalsIgnoreCase("monster")) {
					monster= new Monster(HP,moveSpeed,attackSpeed,difficulty,pattern);
				}
			}
			
			public void characters(char ch[], int start, int length) throws SAXException {
				String lecture = new String(ch, start, length);
				if (bhp) {
					HP=Integer.parseInt(lecture);
					bhp=false;
				} else if (bmovespeed) {
					moveSpeed=Float.parseFloat(lecture);
					bmovespeed=false;
				} else if (battackspeed){
					attackSpeed = Float.parseFloat(lecture);
					battackspeed=false;
				} else if(bdifficulty){
					difficulty=Float.parseFloat(lecture);
					bdifficulty=false;
				} else if (bpattern){
					pattern=lecture;
					bpattern=false;
				}
				
			}
		}

	public static Monster getMonster(int id){
		SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser;
        String filePath=" ";
		try {
			parser = factory.newSAXParser();
	        File f=new File(filePath);
	        MonsterParser imp = new MonsterParser();
			parser.parse(f, imp);
			return imp.monster;
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
