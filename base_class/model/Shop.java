package model;

import java.util.List;

public class Shop {
	private List<Item> toSell;
	private List<Integer> prices;
	
	public Shop(List<Item> toSell, List<Integer> prices){
		this.toSell=toSell;
		this.prices = prices;
	}
	
	public List<Item> getItems(){
		return toSell;
	}
	
	public List<Integer> getPrices(){
		return prices;
	}
	
}
