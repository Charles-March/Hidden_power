package spells;

import alives.£Alive;

public abstract class £Spell {
	protected int id;
	protected int timeBeforeStop;
	public abstract void effect(£Alive target);
	public abstract void stopEffect(£Alive target);
	
	public int getId(){
		return id;
	}
}
