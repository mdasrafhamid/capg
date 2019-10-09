package com.grocerystore;

import java.util.*;


public class Item {
	
	private String name;
	private int qty;
	private float price;
	private static List<Item> itemList = new ArrayList<Item>();
	
	Item(String n, int quantity, float p){
		name = n;
		qty= quantity;
		price = p;
	}
	public static void addToList(Item item) {
		itemList.add(item);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String toString() {
		return "this is a "+name;
	}
	
	static public List<Item> getList() {
		return itemList;
	}
}
