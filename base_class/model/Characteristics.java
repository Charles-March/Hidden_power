package model;

import java.util.List;

import elements.Element;

public class Characteristics {
	int damage;
	Element element;
	List<MagicResistance> magicResistances;
	boolean twoHanded;
	
	public Characteristics(int damage,Element element, List<MagicResistance> ml,boolean th){
		this.damage=damage;
		this.element=element;
		this.magicResistances = ml;
		this.twoHanded = th;
	}
	
}
