package alives;

import java.util.List;

import model.Item;
import playerDefinition.Backpack;
import playerDefinition.Equipment;

public class Player extends £Alive{
	private Equipment equipment;
	private Backpack backpack;
	private int gold;
	
	
	public Item equip(Item i,int slot){
		return equipment.ChangeItem(slot, i);
	}

	public void useSpell(int spellId, String Effect){
		
	}
	
	@Override
	protected void dead() {
		// TODO Auto-generated method stub
		
	}

	public Item removeItem(int i){
		return backpack.removeItem(i);
	}
	
	public boolean addItemList(List<Item> li){
		if(li.size() > backpack.freeSlots()){
			return false;
		}
		else{
			for(int i=0;i<li.size();i++){
				backpack.addItem(li.get(i));
			}
			return true;
		}
	}
	
	public boolean addItem(Item i){
		return backpack.addItem(i);
	}
	
	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public void addGold(int toAdd){
		gold+=toAdd;
	}
	
	public void removeGold(int toRemove){
		gold-=toRemove;
	}
}
