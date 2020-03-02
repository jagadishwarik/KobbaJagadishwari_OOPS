package Maven.Newyear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewYear {
	
	static int numberOfSweets;
	static int numberOfChocolates;
	static int chocolateGiftCount;
	static boolean flag = true;
	
	static ArrayList<Sweets> sweets = new ArrayList<Sweets>();
	static ArrayList<Chocolates> choco = new ArrayList<Chocolates>();
	static ArrayList<Gifts> chocolates = new ArrayList<Gifts>();
	
	static Scanner sc = new Scanner(System.in);
	
	public void takeInput() {
		NewYear newYear = new NewYear();
		
		newYear.takeInputForSweets(sweets);
			
		newYear.takeInputForChocolates(choco);
		
		newYear.takeInputForGifts(chocolates);
		
		while(flag) {
			System.out.println("Enter the value 1.Display all sweets according to their price 2. Count the total number of chocolates including gifts "
					+ "3.Display all gifted chocolates according to their price 4.Exit");
			int val = sc.nextInt();
			newYear.option(val);
		}
	}
	
	public void takeInputForSweets(ArrayList<Sweets> sweets) {
		System.out.println("Enter the number of sweets");
		numberOfSweets = sc.nextInt();
		System.out.println("Enter the name, weight and price of sweet");
		for(int i = 0; i < numberOfSweets; i++) {
			Sweets s = new Sweets();
			s.setName(sc.next());
			s.setWeight(sc.nextInt());
			s.setPrice(sc.nextDouble());
			System.out.println(s.getName());
			sweets.add(s);
		}
	}
	
	public void takeInputForChocolates(ArrayList<Chocolates> choco) {
		System.out.println("Enter the number of chocolates present");
		numberOfChocolates = sc.nextInt();
		System.out.println("Enter name and price of chocolates");
		for(int i = 0; i < numberOfChocolates; i++) {
			Chocolates c = new Chocolates(sc.next(), sc.nextDouble());
			choco.add(c);
		}
	}
	
	public void takeInputForGifts(ArrayList<Gifts> chocolates) {
		System.out.println("Enter number of different types of chocolates presented as gift");
		chocolateGiftCount = sc.nextInt();
		System.out.println("Enter the name, price and quantity of the chocolate");
		for(int i = 0; i < chocolateGiftCount; i++) {
			Gifts gifts = new Gifts(sc.next(), sc.nextDouble(), sc.nextInt());
			chocolates.add(gifts);
		}
		
	}
	
	public void option(int val) {
		switch(val) {
		case 1:
			Collections.sort(sweets, new sortByPriceSweets());
			for(int i = 0; i < numberOfSweets; i++) {
				System.out.print(sweets.get(i) + " ");
			} System.out.println();
			break; 
		case 2:
			System.out.println("Total number of chocolates are = " + (numberOfChocolates + chocolateGiftCount));
			break;
		case 3:
			Collections.sort(chocolates, new SortByQuantity());
			for(int i = 0; i < chocolateGiftCount; i++) {
				System.out.println(chocolates.get(i) + " ");
			} System.out.println();
			break;
		case 4:
			flag = false;
			break;
		default:
			System.out.println("Enter valid input");
			break;
		}
	}
	
}
