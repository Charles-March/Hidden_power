package model;

import java.util.List;

import spells.Element;

public class MagicResistance{
	private Element element;
	private float resistRatio;
	private float resistFlat;
	private boolean resistEffect;
	
	
	public MagicResistance(Element element, float ratio,float flat,boolean resistEffect){
		this.element = element;
		this.resistRatio = ratio;
		this.resistFlat = flat;
		this.resistEffect=resistEffect;
	}
	
	/**
	 * 
	 * @param element
	 * @return true if element is the same element as this magicResistance
	 */
	public boolean sameElement(Element element){
		return Element.eq(this.element, element);
	}
	
	public String getElementName(){
		return element.getName();
	}
	
	/**
	 * 
	 * @param baseDamage
	 * @return return the real damage deals with this magicResistance
	 */
	public int realDamage(int baseDamage){
		return (int) ((baseDamage-resistFlat)/resistRatio);
	}
	
	/**
	 * 
	 * @return true if the effect should be applied
	 */
	public boolean effect(){
		return (!resistEffect);
	}
	
	/**
	 * find the element el in the list ml
	 * @param ml MagicResistance list
	 * @param el The element to find in the list
	 * @return the index of el or -1 if the element is not found
	 */
	public static int findIndex(List<MagicResistance> ml,Element el){
		for(int i=0;i<ml.size();i++){
			if(ml.get(i).sameElement(el)){
				return i;
			}
		}
		return -1;
	}
	
	
}
