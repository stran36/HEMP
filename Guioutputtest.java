public class Guioutputtest{
	private List<Food> Monday = new <Food>ArrayList();
	private List<Food> Tuesday = new <Food>ArrayList();
	private List<Food> Wedsnday = new <Food>ArrayList();
	private List<Food> Thursday = new <Food>ArrayList();
	private List<Food> Friday = new <Food>ArrayList();
	private List<Food> Saturday = new <Food>ArrayList();
	private List<Food> Sunday = new <Food>ArrayList();
	//Foods.add(new Food(name, type, calorie,Tag_1,Tag_2));
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
	Wedsnday.add(new Food("Mango Fruit Cup",3,200,"Dessert","Vegetarian"));
	Wedsnday.add(new Food("Flank Steak",1,330,"American","Steak"));
	Wedsnday.add(new Food("Garlic Bread",4,100,"Italian","Vegetarian"));
	Wedsnday.add(new Food("Spinach Salad",2,300,"Salad","Vegetarian"));
	Wedsnday.add(new Food("Greek Yogurt",0,350,"Dessert","Vegetarian"));
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
	
	public void Guioutputtest(){
		
	}
	
	private void printMonday() {
		for (Food F : Monday) {
			System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
		}
	}
	private void printTuesday() {
		for (Food F : Tuesday) {
			System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
		}
	}
	private void printWedsnday() {
		for (Food F : Wedsnday) {
			System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
		}
	}
	private void printThursday() {
		for (Food F : Thursday) {
			System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
		}
	}
	private void printFriday() {
		for (Food F : Friday) {
			System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
		}
	}
	private void printSaturday() {
		for (Food F : Saturday) {
			System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
		}
	}
	private void printSunday() {
		for (Food F : Sunday) {
			System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
		}
	}
}