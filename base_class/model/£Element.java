package model;

public abstract class £Element {
	private String name;
	£States state;
	
	public String getName(){
		return name;
	}
	
	public abstract void applyEffect();
	
	/**
	 * @param element1
	 * @param element2
	 * @return true if element1 and element2 are the same element
	 */
	public static boolean eq(£Element element1,£Element element2){
		return (element1.name==element2.name);
	}
	
	/**
	 * 
	 * @return return a list of all the elements
	 */
	public static void getAllElements(){
		
	}
	
}
