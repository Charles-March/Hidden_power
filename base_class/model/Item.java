package model;

import bddController.BDD;

public class Item {
	private int id;
	private String name;
	private Characteristics charac;
	private int slot;
	
	public Item(int id,String name,Characteristics c,int slot){
		this.id=id;
		this.name=name;
		this.charac=c;
		this.slot=slot;
	}
	
	public void reload(){
		Item i = BDD.getItem(id);
		this.name = i.getName();
		this.charac=i.getCharacteristics();
		this.slot = i.getSlot();
	}
	
	public int getSlot(){
		return slot;
	}
	
	public Characteristics getCharacteristics(){
		return charac;
	}
	
	public String getName(){
		return name;
	}

	public boolean isWeapon(){
		return (slot>=10);
	}
	
	public boolean isTwoHanded(){
		return charac.twoHanded;
	}

}
