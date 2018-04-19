
public class Test {

	public static void main(String[] args) {
		Preference P = new Preference();
		P.preference(1);
		P.cheatpickerMon("American");
		P.cheatpickerTues("French");
		P.cheatpickerWeds("Asian");
		P.cheatpickerThurs("Italian");
		P.cheatpickerFri("Burger");
		P.cheatpickerSat("Vegetarian");
		P.cheatpickerSun("Steak");
		P.randomize();
		
		P.printMonday();
		System.out.println("");
		P.printTuesday();
		System.out.println("");
		P.printWedsnday();
		System.out.println("");
		P.printThursday();
		System.out.println("");
		P.printFriday();
		System.out.println("");
		P.printSaturday();
		System.out.println("");
		P.printSunday();
		System.out.println("");
		
	}

}
