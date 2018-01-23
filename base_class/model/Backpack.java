package model;

import controller.Config;

public class Backpack {
	private Item[] itemList;
	private int slots;
	
	public int getMaxSlots(){
		return slots;
	}
	
	public Item getItem(int id){
		if(id<slots && id>=0)
			return itemList[id];
		else
			return null;
	}
	
	public Item removeItem(int id){
		Item i = itemList[id];
		itemList[id]=null;
		return i;
	}
	
	public int freeSlots(){
		int sums=0;
		for(int i=0;i<slots;i++){
			if(itemList[i]==null){
				sums++;
			}
		}
		return sums;
	}
	
	public void Equip(int id){
		Item i = Config.player.equip(itemList[id],itemList[id].getSlot());
		itemList[id]=i;
	}
}
