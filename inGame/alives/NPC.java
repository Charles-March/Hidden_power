package alives;

import java.util.List;

import model.MagicResistance;
import model.Shop;
import model.£Alive;
import playerDefinition.Quest;

public class NPC extends £Alive{
	Shop shop=null;
	Quest quest=null;
	String chat;
	
	
	public NPC(int life,List<MagicResistance> mrl,String name){
		this.maxLifePoint=life;
		this.magicResistanceList = mrl;
		this.name=name;
	}
	
	public boolean addQuest(Quest q){
		if(quest==null){
			quest=q;
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	protected void dead() {
		// TODO Auto-generated method stub
		
	}

}
