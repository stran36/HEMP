package calculations;

import java.util.ArrayList;

/* Class created by Steve Tran
 * Edited by Andy Echeverria 
 * Notes: Rewrote the class from DevOne branch. Rewrote ArrayLists and are populated when the constructor is instantiated 
 * */

public class FoodTester{
	
	private ArrayList<Food> Monday = new ArrayList<>();
	private ArrayList<Food> Tuesday = new ArrayList<>();
	private ArrayList<Food> Wednesday = new ArrayList<>();
	private ArrayList<Food> Thursday = new ArrayList<>();
	private ArrayList<Food> Friday = new ArrayList<>();
	private ArrayList<Food> Saturday = new ArrayList<>();
	private ArrayList<Food> Sunday = new ArrayList<>();
	
	public FoodTester() {
		populateDays();
	}
	
	
	public void populateDays() {
		Monday.add(new Food("Orange Fruit Cup",3,200,"Dessert","Vegetarian"));
		Monday.add(new Food("Caesar Salad",2,330,"Italian","Salad"));
		Monday.add(new Food("Pita Bread",4,100,"Mediterranean","Vegetarian"));
		Monday.add(new Food("Three Bean Salad",1,300,"Salad","Vegetarian"));
		Monday.add(new Food("Vanilla Ice Cream",0,350,"Dessert","Vegetarian"));
		Tuesday.add(new Food("Huevos Rancheros",1,450,"Latin","Breakfast"));
		Tuesday.add(new Food("Lo Mein",4,250,"Asian","Noodles"));
		Tuesday.add(new Food("Strawberry Gelato",0,350,"Italian","Dessert"));
		Tuesday.add(new Food("Strawberry Tart",3,150,"French","Breakfast"));
		Tuesday.add(new Food("Seaweed Salad",2,200,"Asian","Salad"));
		Wednesday.add(new Food("Mango Fruit Cup",3,200,"Dessert","Vegetarian"));
		Wednesday.add(new Food("Flank Steak",1,330,"American","Steak"));
		Wednesday.add(new Food("Garlic Bread",4,100,"Italian","Vegetarian"));
		Wednesday.add(new Food("Spinach Salad",2,300,"Salad","Vegetarian"));
		Wednesday.add(new Food("Greek Yogurt",0,350,"Dessert","Vegetarian"));
		Thursday.add(new Food("Breakfast Burrito",1,450,"Latin","Breakfast"));
		Thursday.add(new Food("Udon",4,250,"Asian","Noodles"));
		Thursday.add(new Food("Strawberry Gelato",0,350,"Italian","Dessert"));
		Thursday.add(new Food("Strawberry Crumpet",3,150,"English","Dessert"));
		Thursday.add(new Food("Seaweed Salad",2,200,"Asian","Salad"));
		Friday.add(new Food("Angus Steak",1,400,"Steak","American"));
		Friday.add(new Food("Macaroni Salad",4,200,"Pasta","Salad"));
		Friday.add(new Food("Milk Shake",0,300,"Dessert","American"));
		Friday.add(new Food("Watermelon",3,100,"Dessert","American"));
		Friday.add(new Food("Grilled Asparagus",2,200,"Vegetarian","American"));
		Saturday.add(new Food("Hibachi Steak",1,400,"Steak","Asian"));
		Saturday.add(new Food("Spaghetti",4,200,"Pasta","Italian"));
		Saturday.add(new Food("Milk Shake",0,300,"Dessert","American"));
		Saturday.add(new Food("Fruit Salad",3,100,"Salad","Vegetarian"));
		Saturday.add(new Food("Spinach Salad",2,300,"Salad","Vegetarian"));
		Sunday.add(new Food("Apple Fruit Cup",3,200,"Dessert","Vegetarian"));
		Sunday.add(new Food("Garden Salad",2,330,"American","Salad"));
		Sunday.add(new Food("Pita Bread",4,100,"Mediterranean","Vegetarian"));
		Sunday.add(new Food("Baked Beans",1,300,"American","Vegetarian"));
		Sunday.add(new Food("Chocolate Ice Cream",0,350,"Dessert","Vegetarian"));
	}
	
	//Changed return type to STRING for testing purposes
	//Testing this method in Scene3
	public String printMonday() {
		String output = "";
		for (Food F : Monday) {
			//System.out.println(F.getname() + " " + F.getTypeName() + " " + F.getcalorie() + " calories" + "/n");
			output += F.getname() + " " + F.getTypeName() + " " + F.getcalorie() + " calories" + "\n";
		}
		return output;
	}
	
	private void printTuesday() {
		for (Food F : Tuesday) {
			System.out.println(F.getname() + " " + F.getTypeName() + " " + F.getcalorie() + " calories");
		}
	}
	private void printWednesday() {
		for (Food F : Wednesday) {
			System.out.println(F.getname() + " " + F.getTypeName() + " " + F.getcalorie() + " calories");
		}
	}
	private void printThursday() {
		for (Food F : Thursday) {
			System.out.println(F.getname() + " " + F.getTypeName() + " " + F.getcalorie() + " calories");
		}
	}
	private void printFriday() {
		for (Food F : Friday) {
			System.out.println(F.getname() + " " + F.getTypeName() + " " + F.getcalorie() + " calories");
		}
	}
	private void printSaturday() {
		for (Food F : Saturday) {
			System.out.println(F.getname() + " " + F.getTypeName() + " " + F.getcalorie() + " calories");
		}
	}
	private void printSunday() {
		for (Food F : Sunday) {
			System.out.println(F.getname() + " " + F.getTypeName() + " " + F.getcalorie() + " calories");
		}
	}
	
	public void printTest() {
		printMonday();
		printTuesday();
		printWednesday();
		printThursday();
		printFriday();
		printSaturday();
		printSunday();
	}
}
