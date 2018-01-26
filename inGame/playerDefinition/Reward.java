package playerDefinition;

import java.util.List;

import controller.Config;
import model.Item;

public class Reward {
	private List<Item> itemList;
	private int gold;
	private String indication;
	
	public Reward(List<Item> itemList, int gold, String indictation){
		this.itemList=itemList;
		this.gold=gold;
		this.indication=indictation;
	}
	
	public void give(){
		Config.player.addGold(gold);
	}
}
