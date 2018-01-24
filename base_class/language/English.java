package language;

public class English implements _Language{
	
	@Override
	public String getItemSlot(int slot) {
		switch(slot){
			case 0:
				return "Head";
			case 1: 
				return "NeckLace";
			case 2:
				return "Shoulders";
			case 3:
				return "Chest";
			case 4:
				return "Gloves";
			case 5:
				return "Belt";
			case 6:
				return "Legs";
			case 7:
				return "Shoes";
			case 8:
				return "Left ring";
			case 9:
				return "Right ring";
			case 10:
				return "Left hand";
			case 11:
				return "Right hand";
			default:
				return "";
		}
	}

	@Override
	public String getItemName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getElement(int id) {
		switch(id){
	 	case 0:
	 		return "physical";
	 	case 1:
	 		return "fire";
	 	case 2:
	 		return "water";
	 	case 3:
	 		return "earth";
	 	case 4:
	 		return "win";
	 	case 5:
	 		return "electricity";
	 	case 6:
	 		return "light";
	 	case 7:
	 		return "shadow";
	 	case 8:
	 		return "poison";
	 	case 9:
	 		return "sound";
		}
		return null;
	}

}
