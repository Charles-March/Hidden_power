package alives;

import model.Item;
import playerDefinition.Equipment;

public class Player extends £Alive{
	private Equipment equipment;
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
