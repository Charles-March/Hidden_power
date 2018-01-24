package playerDefinition;

public class Quest {
	private String name;
	private String story;
	private QuestObjectives objectives;
	private boolean activated;
	private Quest next;
	private boolean done;
	private Reward reward;
	
	public Quest(String name, String story, QuestObjectives objectives, Reward reward,Quest next){
		this.name=name;
		this.story=story;
		this.objectives=objectives;
		this.reward=reward;
		activated=false;
		done=false;
	}
	
	public String getName(){
		return name;
	}
	
	public String getStory(){
		return story;
	}
	
	public QuestObjectives getObjectives(){
		return objectives;
	}
	
	public boolean isActivated(){
		return (activated || done);
	}
	
	public boolean isDone(){
		return done;
	}
	
	public void activate(){
		activated=true;
	}
	
	public Quest done(){
		reward.give();
		done=true;
		return next;
	}
	
	
	
}
