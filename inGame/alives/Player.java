package alives;

import model.Item;
import playerDefinition.Equipment;

public class Player extends £Alive{
	private Equipment equipment;
	
	public Item equip(Item i,int slot){
		return equipment.ChangeItem(slot, i);
	}

	public void useSpell(int spellId, String Effect){
		
	}
	
	@Override
	protected void dead() {
		// TODO Auto-generated method stub
		
	}
}
