public class preference{
	private int age = 35;
	private int goal;
	private String name = "John Doe";
	private int reccomended 2600;
	private String goalname;
	private double p;
    private double d;
    private double f;
    private double v;
    private double g;
	private int excludeMon;
	private int excludeTues;
	private int excludeWeds;
	private int excludeThurs;
	private int excludeFri;
	private int excludeSat;
	private int excludeSun;
	private List<Food> Foods = new <Food>ArrayList();
	private List<Food> CheatFoodMon = new <Food>ArrayList();
	private List<Food> CheatFoodTues = new <Food>ArrayList();
	private List<Food> CheatFoodWeds = new <Food>ArrayList();
	private List<Food> CheatFoodThurs = new <Food>ArrayList();
	private List<Food> CheatFoodFri = new <Food>ArrayList();
	private List<Food> CheatFoodSat = new <Food>ArrayList();
	private List<Food> CheatFoodSun = new <Food>ArrayList();
	private List<Food> FillFoods = new <Food>ArrayList();
	private List<Food> Monday = new <Food>ArrayList();
	private List<Food> Tuesday = new <Food>ArrayList();
	private List<Food> Wedsnday = new <Food>ArrayList();
	private List<Food> Thursday = new <Food>ArrayList();
	private List<Food> Friday = new <Food>ArrayList();
	private List<Food> Saturday = new <Food>ArrayList();
	private List<Food> Sunday = new <Food>ArrayList();
	Foods.add(new Food(name, type, calorie,Tag_1,Tag_2));
	
	public void preference(int goal){
		this.goal=goal;
		if(goal==0){goalname = "Muscle Gain"}
        else if (goal==1){goalname="Maintaining Weight"}
        else{goalname="Weight loss"}
		goalcalc();
	}
	private void goalcalc(){
        if (goal == 0){
            p=0.40*reccomended;
			d=0.20*reccomended;
            v=0.15*reccomended;
            f=0.15*reccomended;
            g=0.10*reccomended;
        }
        else if (goal == 1){
			p=0.10*reccomended;
            d=0.10*reccomended;
            v=0.15*reccomended;
            f=0.15*reccomended;
            g=0.40*reccomended;
        }
        else if (goal == 2){
            p=0.10*reccomended;
            d=0.15*reccomended;
            v=0.25*reccomended;
			f=0.25*reccomended;
            g=0.25*reccomended;
        }
    }
	public void cheatpickerMon(String Tag_in){
		for (Food F : Foods) {
			if (F.getTag_1.equals(Tag_in)||F.getTag_1.equals(Tag_in)){
				CheatFoodMon.add(F);
				excludeMon = F.gettype();
			}
		}
	}
	public void cheatpickerTues(String Tag_in){
		for (Food F : Foods) {
			if (F.getTag_1.equals(Tag_in)||F.getTag_1.equals(Tag_in)){
				CheatFoodTues.add(F);
				excludeTues = F.gettype();
			}
		}
	}
	public void cheatpickerWeds(String Tag_in){
		for (Food F : Foods) {
			if (F.getTag_1.equals(Tag_in)||F.getTag_1.equals(Tag_in)){
				CheatFoodWeds.add(F);
				excludeWeds = F.gettype();
			}
		}
	}
	public void cheatpickerThurs(String Tag_in){
		for (Food F : Foods) {
			if (F.getTag_1.equals(Tag_in)||F.getTag_1.equals(Tag_in)){
				CheatFoodThurs.add(F);
				excludeThurs = F.gettype();
			}
		}
	}
	public void cheatpickerFri(String Tag_in){
		for (Food F : Foods) {
			if (F.getTag_1.equals(Tag_in)||F.getTag_1.equals(Tag_in)){
				CheatFoodFri.add(F);
				excludeFri = F.gettype();
			}
		}
	}
	public void cheatpickerSat(String Tag_in){
		for (Food F : Foods) {
			if (F.getTag_1.equals(Tag_in)||F.getTag_1.equals(Tag_in)){
				CheatFoodSat.add(F);
				excludeSat = F.gettype();
			}
		}
	}
	public void cheatpickerSun(String Tag_in){
		for (Food F : Foods) {
			if (F.getTag_1.equals(Tag_in)||F.getTag_1.equals(Tag_in)){
				CheatFoodSun.add(F);
				excludeSun = F.gettype();
			}
		}
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