package alives;

import java.util.List;

import model.MagicResistance;
import spells.Element;
import states.£States;

/**
 * Every alive object such as players, npcs, monsters, etc..
 * 
 * @author Stractus
 */
public abstract class £Alive {
	protected int currentLifePoint;
	protected int maxLifePoint;
	protected float movementSpeed;
	protected String name;
	
	protected £States state=null;
	protected List<MagicResistance> magicResistanceList;
	
	
	/**
	 * Deal with damage
	 * @param damage  : base damage deal to this £Alive
	 * @param element : element of the damage
	 * @return true if the effect of the element can be applied
	 */
	public boolean damage(int damage,Element element){
		int index = MagicResistance.findIndex(magicResistanceList, element);
		if(index != -1){
			currentLifePoint -= magicResistanceList.get(index).realDamage(damage);
			if(isDead()){
				dead();
			}
			return magicResistanceList.get(index).effect();
		}
		else{
			currentLifePoint -= damage;
			if(isDead()){
				dead();
			}
			return true;
		}
	}
	
	/**
	 * @return true if current life point < 0
	 */
	public boolean isDead(){
		return (currentLifePoint<=0);
	}
	
	/**
	 * Notify that this object is now dead
	 */
	protected abstract void dead();
	
	/**
	 * 
	 * @return the current of life of the £Alive
	 */
	public int getLifePoint(){
		return currentLifePoint;
	}
	
	/**
	 * 
	 * @return the life point ratio of the £Alive 
	 */
	public float getRatioLifePoint(){
		return (currentLifePoint/maxLifePoint);
	}
	
	/**
	 * Apply an effect on this £Alive
	 * @param state
	 */
	public void setEffect(£States state){
		if(state.tryApply()){
			this.state=state;		
		}
	}
	
	/**
	 * @return the speed ratio of the £Alive
	 */
	public float getSpeed(){
		return movementSpeed;
	}
	
	/**
	 * @return the current state of the £Alive (null if empty)
	 */
	public £States hasEffect(){
		return state;
	}
}
