package bddController;

import java.util.List;

import alives.Monster;
import alives.NPC;
import model.Item;
import spells.£Spell;

public class BDD {
	private static List<Item> itemLoaded;
	private static List<Integer> itemIndexList;
	private static List<NPC> NPCloaded;
	private static List<Integer> NPCIndexList;
	private static List<£Spell> spellLoaded;
	private static List<Integer> spellIndexList;
	private static List<Monster> monsterLoaded;
	private static List<Integer> monsterIndexList;
	
	
	
	public static Item getItem(int id){
		int index = itemIndexList.indexOf(id);
		if(index!=-1){
			return itemLoaded.get(index);
		}
		else{
			Item i = ItemReader.getItem(id);
			itemIndexList.add(id);
			itemLoaded.add(i);
			return i;
		}
	}
	
	public static NPC getNPC(int id){
		int index = NPCIndexList.indexOf(id);
		if(index!=-1){
			return NPCloaded.get(index);
		}
		else{
			NPC i = NPCReader.getNPC(id);
			NPCIndexList.add(id);
			NPCloaded.add(i);
			return i;
		}
	}
	
	public static £Spell getspell(int id){
		int index = spellIndexList.indexOf(id);
		if(index!=-1){
			return spellLoaded.get(index);
		}
		else{
			£Spell i = SpellReader.getSpell(id);
			spellIndexList.add(id);
			spellLoaded.add(i);
			return i;
		}
	}
	
	public static Monster getMonster(int id){
		int index = monsterIndexList.indexOf(id);
		if(index!=-1){
			return monsterLoaded.get(index);
		}
		else{
			Monster i = MonsterReader.getMonster(id);
			monsterIndexList.add(id);
			monsterLoaded.add(i);
			return i;
		}
	}
}
