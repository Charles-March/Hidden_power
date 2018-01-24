package elements;

import controller.Config;
/**
 * Physical Element no state associated
 * id=0
 */
public class Physical extends £Element{
	public Physical(){
		name=Config.language.getElement(0);
		state=null;
	}
	
}

