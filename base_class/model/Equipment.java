package model;

public class Equipment{
	/**
	 * 0.Head			----
	 * 1.Necklace		----
	 * 2.Shoulders	----
	 * 3.Chest		----
	 * 4.Gloves		----
	 * 5.Belt			----
	 * 6.Legs ----
	 * 7.Shoes ----
	 * 8.Left ring ----
	 * 9.Right ring ----
	 * 10.Left Hand ----
	 * 11.Right Hand
	 */
	public final static int slots = 12;
	private Item[] itemList;
	
	public Equipment(){
		itemList = new Item[slots];
		for(int i=0;i<slots;i++){
			itemList[i]=null;
		}
	}
	
	public Item getItem(int index){
		return itemList[index];
	}
	
	public Item ChangeItem(int slot,Item item){
		Item i = itemList[slot];
		itemList[slot]=item;
		return i;
	}
	
}
