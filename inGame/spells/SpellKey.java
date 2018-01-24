package spells;

public class SpellKey {
	public static final int maxInput=5;
	private int combinaisonLenght;
	private String effectName;
	private int spellId;
	private String combinaison;
	
	public SpellKey(String combinaison, int spellId, String effectName){
		this.combinaison=combinaison;
		combinaisonLenght=combinaison.length();
		this.spellId=spellId;
		this.effectName=effectName;
	}
	
	public boolean isCombinaison(String comb){
		return comb.substring(maxInput-combinaisonLenght).equalsIgnoreCase(combinaison);
	}
	
	public String getEffect(){
		return effectName;
	}
	
	public int getSpellId(){
		return spellId;
	}
	
}
