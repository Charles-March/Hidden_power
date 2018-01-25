package spells;

import java.util.LinkedList;

import controller.Config;

public class Element {
	private final static int nbElement = 10;
	protected String name;
	
	public static Element ElementGenerator(int id){
		Element e = new Element();
		e.name=Config.language.getElement(id);
		return e;
	}
	
	public String getName(){
		return name;
	}
	
	/**
	 * @param element1
	 * @param element2
	 * @return true if element1 and element2 are the same element
	 */
	public static boolean eq(Element element1,Element element2){
		return (element1.name==element2.name);
	}
	
	/**
	 * @return return a list of all the elements
	 * the element with id 7 is at the 7th position in the list
	 */
	public static LinkedList<Element> getAllElements(){
		LinkedList<Element> le = new LinkedList<Element>();
		for(int i=0;i<nbElement;i++){
			le.add(ElementGenerator(i));
		}
		return le;
	}
	
}
