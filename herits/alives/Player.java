package alives;

import model.Equipment;
import model.Item;
import model.£Alive;

public class Player extends £Alive{
	private Equipment equipment;
	
	
	public Item equip(Item i,int slot){
		return equipment.ChangeItem(slot, i);
	}


	@Override
	protected void dead() {
		// TODO Auto-generated method stub
		
	}
}
