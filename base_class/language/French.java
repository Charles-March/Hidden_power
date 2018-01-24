package language;

public class French implements _Language{
	@Override
	public String getItemSlot(int slot) {
		switch(slot){
			case 0:
				return "Tête";
			case 1: 
				return "Cou";
			case 2:
				return "Epaules";
			case 3:
				return "Torse";
			case 4:
				return "Gant";
			case 5:
				return "Ceinture";
			case 6:
				return "Jambes";
			case 7:
				return "Chaussures";
			case 8:
				return "Anneau gauche";
			case 9:
				return "Anneau droit";
			case 10:
				return "Main gauche";
			case 11:
				return "Main droite";
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
		 		return "physique";
		 	case 1:
		 		return "feu";
		 	case 2:
		 		return "eau";
		 	case 3:
		 		return "terre";
		 	case 4:
		 		return "air";
		 	case 5:
		 		return "électricité";
		 	case 6:
		 		return "lumière";
		 	case 7:
		 		return "ténèbres";
		 	case 8:
		 		return "poison";
		 	case 9:
		 		return "sonore";
		 		}
		return null;
	}
}
