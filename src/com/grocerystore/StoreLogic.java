package com.grocerystore;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StoreLogic {

	static Scanner sc = new Scanner(System.in);
	
	static DecimalFormat df = new DecimalFormat("0.00");
	
	
	public void load() {
		
		//list of store items -- more can be added
		Item.addToList(new Item("pizza",3,2.0f));
		Item.addToList(new Item("marker",5,1.0f));
		Item.addToList(new Item("drink",6,2.25f));
		
		// additional
		Item.addToList(new Item("beer",10,12.25f));
		
		
	}
	
	public void start() {
		firstMenu();
	}
	
	private int inputChoice(int min, int max){
		
		String c;
		int choice;
		
		try {
			if(sc.hasNextInt()) {
				c = sc.nextLine();
				choice = Integer.parseInt(c);
				
				if(choice>=min && choice<=max)
					return choice;
				else
					throw new InvalidInputException("Choice out of range!");
			}
			else {
				c = sc.nextLine();
				throw new InvalidInputException("Choice not an integer!");
			}
		} catch (InvalidInputException e) {
			System.out.println("\n"+e);
			System.out.println("Please reenter choice: ");
			choice = inputChoice(min, max);
			
		}
		return choice;
	}
	
	private void firstMenu(){

		System.out.println("\n---------------------------------------------------");
		System.out.println("\t\tWelcome to SriniMart!");
		System.out.println("---------------------------------------------------");

		System.out.println("1. Select Item");
		System.out.println("2. Show Items");
		System.out.println("3. Exit");

		

		switch (inputChoice(1,3)) {

		case 1:
			Basket b = new Basket();
			printItems();
			chooseItem(b);
			break;
		case 2:
			printItems();
			firstMenu();
			break;
		case 3:
			System.out.println("See you again! Goodbye!");
			System.exit(1);
		default:
			System.out.println("not an option");
		}
		firstMenu();

	}

	private void mainMenu(Basket b){
		System.out.println("\n---------------------------------------------------");
		System.out.println("\t\tSriniMart");
		System.out.println("---------------------------------------------------");

		System.out.println("1. Select Item");
		System.out.println("2. Show Store");
		System.out.println("3. Show Basket");
		System.out.println("4. Checkout");
		System.out.println("5. Cancel");
		System.out.println("6. Exit");


		switch (inputChoice(1,6)) {

		case 1:
			printItems();
			chooseItem(b);
			break;
		case 2:
			printItems();
			break;
		case 3:
			printBasketItem(b);
			break;
		case 4:
			checkOut(b);
			break;
		case 5:
			cancelOrder(b);
			break;
		case 6:
			System.exit(1);
			break;
		default:
			System.out.println("not an option");

		}
		mainMenu(b);

	}

	private void checkOut(Basket b){
		if (b.isEmpty())
			System.out.println("Your basket is empty! Pls select an item");
		else {
			System.out.println("Your order is succesfull!");
			System.out.println("Thank you for shopping with us!\n");
			firstMenu();
		}
	}

	private void cancelOrder(Basket b){
		List<Item> bList = b.getList();
		int size = bList.size();

		//putting items from basket to store
		for (int i = 0; i < size; i++) {
			Item tempItem = bList.remove(0);
			Item storeItem = getItemByName(tempItem.getName());
			storeItem.setQty(tempItem.getQty() + storeItem.getQty());
		}
		if (b.isEmpty())
			System.out.println("Basket is now empty!");
		
		firstMenu();
	}

	private Item getItemByName(String s) {

		for (Item item : Item.getList()) {
			if (item.getName().equals(s))
				return item;
		}

		return null;

	}

	private void printItems() {
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("\tList of store items");
		System.out.println("---------------------------------------------------");
		System.out.println("No.\tItem\t\tQty\tPrice");
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < Item.getList().size(); i++) {
			System.out.println((i + 1) + ")\t" + Item.getList().get(i).getName() + "\t\t "
					+ Item.getList().get(i).getQty()+"\t"+df.format(Item.getList().get(i).getPrice()));
		}

	}

	private void chooseItem(Basket b){

		System.out.println("\nPlease choose from item 1 to " + Item.getList().size() + ": ");
		
		int choice;
		
		choice = inputChoice(1,Item.getList().size());
		
		Item item = Item.getList().get(choice - 1);
		System.out.println("You have chosen " + item.getName() + "!");

		System.out.println("\nPlease choose quantity of " + item.getName() + " (stock : " + item.getQty() + ")");
		
		choice = inputChoice(0,99);

		//error checking - qty within range
		if (choice > 0 && choice <= item.getQty()) {

			System.out.println(choice + " " + item.getName() + " selected");
			b.addToBasket(new Item(item.getName(), choice, item.getPrice()));
			item.setQty(item.getQty() - choice);

		} else if (choice > item.getQty())
			System.out.println("out of stock!");
		else
			System.out.println("no qty selected. Please reenter");

		mainMenu(b);
	}

	private void printBasketItem(Basket b) {

		System.out.println("\n---------------------------------------------------");
		System.out.println("\t\tItems in basket!");
		System.out.println("---------------------------------------------------");
		System.out.println("No.\tItem\t\tQty\tPrice");
		System.out.println("---------------------------------------------------");
		
		int i = 1;
		for (Item item : b.getList()) {
			System.out.println((i++) + ")\t" + item.getName() + "\t\t" + item.getQty() + "\t"
					+ df.format((item.getPrice() * item.getQty())));
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("Total\t\t\t"+totalBasketQty(b)+"\t"+df.format(totalBasketPrice(b)));
		


	}

	private float totalBasketPrice(Basket b) {

		float total = 0;
		for (Item item : b.getList()) {
			total += (item.getPrice() * item.getQty());
		}
		return total;
	}
	private int totalBasketQty(Basket b) {

		int total = 0;
		for (Item item : b.getList()) {
			total += item.getQty();
		}
		return total;
	}

}
