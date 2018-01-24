package elements;

import controller.Config;
import states.£States;

public class Element {
	protected String name;
	protected £States state;
	
	public Element ElementGenerator(int id){
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
	 */
	public static void getAllElements(){
		
	}
	
}
