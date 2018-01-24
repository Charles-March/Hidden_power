package spells;

import java.util.List;

import controller.Config;

public class SpellBinding {
	static private List<SpellKey> keyList;
	
	public static void stringTyped(String toTry){
		for(int i=0;i<keyList.size();i++){
			SpellKey sk = keyList.get(i);
			if(sk!=null && sk.isCombinaison(toTry)){
				String effect = sk.getEffect();
				int spellId = sk.getSpellId();
				Config.player.useSpell(spellId, effect);
			}
			
		}
	}
	
	public static SpellKey generateKey(int spellId, String effect, int difficulty){
		String combinaison="";
		if(difficulty>SpellKey.maxInput){
			System.out.println("Difficulty for spell : " + spellId + " is too high, spell ignored");
			return null;
		}
		for(int i=0;i<difficulty;i++){
			double rand = Math.random();
			int value = (int) Math.floor((rand/(1.0/26.0)));
			char newChar  = (char)(((int)'a')+value);
			combinaison+=newChar;
		}
		return new SpellKey(combinaison, spellId, effect);
	}
	
}
