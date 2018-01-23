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

}
