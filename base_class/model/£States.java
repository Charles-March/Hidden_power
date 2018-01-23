package model;

public abstract class £States {
	float applyRatio;
	String stateName;
	float effectTotalTime;
	float effectInterval;
	
	public String getName(){
		return stateName;
	}
	
	public boolean tryApply(){
		return(Math.random()<applyRatio);
	}
	
	abstract void apply(£Alive al);
	
}
