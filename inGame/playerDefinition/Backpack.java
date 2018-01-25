package playerDefinition;

import controller.Config;
import model.Item;

public class Backpack {
	private Item[] itemList;
	private int slots;
	/**
	 * @return the maximum amount of object the backpack can carry on
	 */
	public int getMaxSlots(){
		return slots;
	}
	
	/**
	 * Return an Item defined by his position in the backpack
	 * @param position the position of the item
	 * @return The item or null if position is bad
	 */
	public Item getItem(int position){
		if(position<slots && position>=0)
			return itemList[position];
		else
			return null;
	}
	
	/**
	 * Remove the item defined by position and return it
	 * @param position the position of the desired item in the backpack
	 * @return the removed item
	 */
	public Item removeItem(int position){
		Item i = itemList[position];
		itemList[position]=null;
		return i;
	}
	
	/**
	 * @return the amount of slot unused in the backpack
	 */
	public int freeSlots(){
		int sums=0;
		for(int i=0;i<slots;i++){
			if(itemList[i]==null){
				sums++;
			}
		}
		return sums;
	}
	
	/**
	 * Equip to the player an item defined by it position in the backpack
	 * @param position the position of the item
	 */
	public void Equip(int position){
		Item i = Config.player.equip(itemList[position],itemList[position].getSlot());
		itemList[position]=i;
	}
}
