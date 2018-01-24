package language;

public interface _Language {
	/**
	 * 0.Head			----
	 * 1.Necklace		----
	 * 2.Shoulders	----
	 * 3.Chest		----
	 * 4.Gloves		----
	 * 5.Belt			----
	 * 6.Legs ----
	 * 7.Shoes ----
	 * 8.Left ring ----
	 * 9.Right ring ----
	 * 10.Left Hand ----
	 * 11.Right Hand
	 */
	public String getItemSlot(int slot);
	public String getItemName(int id);
	public String getElement(int id);
	
}
