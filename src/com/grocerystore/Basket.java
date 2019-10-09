package com.grocerystore;

import java.util.*;

public class Basket {

	private List<Item> bItems = new ArrayList<Item>();
	private static List<Basket> bList = new ArrayList<Basket>();
	Basket(){
		bList.add(this);
	}
	
	public void addToBasket(Item item) {
		bItems.add(item);
	}
	public List<Item> getList() {
		return bItems;
	}
	public boolean isEmpty() {
		return bItems.isEmpty();
	}
	
	
	
}
