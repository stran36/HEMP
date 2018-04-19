
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Preference {
    private int age = 35;
    private int goal;
    private String name = "John Doe";
    private int reccomended = 2600;
    private String goalname;
    private double p;
    private double d;
    private double f;
    private double v;
    private double g;
    private int excludeMon = 9;
    private int excludeTues = 9;
    private int excludeWeds = 9;
    private int excludeThurs = 9;
    private int excludeFri = 9;
    private int excludeSat = 9;
    private int excludeSun = 9;
    private List<Food> Foods = new ArrayList<>();
    private List < Food > Dairy = new ArrayList();
    private List < Food > Protein = new ArrayList();
    private List < Food > Vegetable = new ArrayList();
    private List < Food > Fruit = new < Food > ArrayList();
    private List < Food > Grains = new ArrayList();
    private List < Food > CheatFoodMon = new ArrayList();
    private List < Food > CheatFoodTues = new ArrayList();
    private List < Food > CheatFoodWeds = new ArrayList();
    private List < Food > CheatFoodThurs = new ArrayList();
    private List < Food > CheatFoodFri = new ArrayList();
    private List < Food > CheatFoodSat = new ArrayList();
    private List < Food > CheatFoodSun = new ArrayList();
    private List < Food > Monday = new ArrayList();
    private List < Food > Tuesday = new ArrayList();
    private List < Food > Wedsnday = new ArrayList();
    private List < Food > Thursday = new ArrayList();
    private List < Food > Friday = new ArrayList();
    private List < Food > Saturday = new ArrayList();
    private List < Food > Sunday = new ArrayList();
    
    
	public void populateLists() {
	Foods.add(new Food("McDonalds Cheeseburger",1,313,"Burger","American"));
	Foods.add(new Food("Kabuki Vegan Burger", 2,240,"Burger","Vegetarian"));
	Foods.add(new Food("Giuseppe's Pizza Burger",1,300,"Burger","Italian"));
	Foods.add(new Food("Habit Char Burger",1,275,"Burger","American"));
	Foods.add(new Food("LaCroix Portabella Burger",1,277,"Burger","French"));
	Foods.add(new Food("Olive Garden Caesar Salad", 2,150,"Italian","Salad"));
	Foods.add(new Food("Olive Garden French Salad",2,145,"French","Salad"));
	Foods.add(new Food("Cheesecake Factory Fruit Salad", 3,120,"Salad","Vegetarian"));
	Foods.add(new Food("Kabuki Seaweed Salad",2,150,"Salad","Asian"));
	Foods.add(new Food("Dickey’s BBQ Salad",2,200,"Salad","American"));
	Foods.add(new Food("Norm’s Porterhouse Steak",1,300,"Steak","American"));
	Foods.add(new Food("Black Angus Prime Rib",1,277,"Steak","American"));
	Foods.add(new Food("Olive Garden NY Strip",1,210,"Steak","Italian"));
	Foods.add(new Food("LaCroix Bearnaise Porterhouse",1,300,"Steak","French"));
	Foods.add(new Food("LaCroix Filet Minion",1,250,"Steak","French"));
	Foods.add(new Food("LaCroix Strawberry Tart",3,120,"French","Vegetarian"));
	Foods.add(new Food("McCormicks Fruit Medley",3,200,"American","Vegetarian"));
	Foods.add(new Food("Anthony’s Pineapple Tart", 3,120,"American","Vegetarian"));
	Foods.add(new Food("Giuseppe's Raspberry Cannoli",3,124,"Italian","Vegetarian"));
	Foods.add(new Food("Kabuki Fresh Fruit",3,100,"Asian","Vegetarian"));
	Foods.add(new Food("China King Lo Mein",4,200,"Asian","Asian"));
	Foods.add(new Food("Shinsengumi Ramen",4,155,"Asian","Asian"));
	Foods.add(new Food("Giuseppes Mushroom Risotto",4,155,"Italian","Italian"));
	Foods.add(new Food("Giuseppes Seafood Linguini",4, 200, "Italian","Italian"));
	Foods.add(new Food("Olive Garden Garlic Bread Loaf",4, 500, "Italian","Vegetarian"));
	Foods.add(new Food("McDonalds Milkshake",0,120,"American","Vegetarian"));
	Foods.add(new Food("Kabuki Milk Tea",0,100,"Asian","Vegetarian"));
	Foods.add(new Food("Giuseppes Gelato",0,150,"Italian","Vegetarian"));
	Foods.add(new Food("Shinsengumi Ice Cream",0,150,"Asian","Vegetarian"));
	Foods.add(new Food("LaCroix Cheesecake",1,200, "French", "Vegetarian"));
	}
	
	// Tag options for drop down menu French,Italian,American,Asian,Salad,Burger,Steak,Vegetarian
	
	
	// constructor used after user interacts with goal module
    public void preference(int goal) {
    		populateLists();
        this.goal = goal;
        if (goal == 0) {
            goalname = "Muscle Gain";
			} else if (goal == 1) {
            goalname = "Maintaining Weight";
			} else {
            goalname = "Weight loss";
		}
        goalcalc();
        org();
	}
    private void goalcalc() {
        if (goal == 0) {
            p = 0.40 * reccomended;
            d = 0.20 * reccomended;
            v = 0.15 * reccomended;
            f = 0.15 * reccomended;
            g = 0.10 * reccomended;
			} else if (goal == 1) {
            p = 0.10 * reccomended;
            d = 0.10 * reccomended;
            v = 0.15 * reccomended;
            f = 0.15 * reccomended;
            g = 0.40 * reccomended;
			} else if (goal == 2) {
            p = 0.10 * reccomended;
            d = 0.15 * reccomended;
            v = 0.25 * reccomended;
            f = 0.25 * reccomended;
            g = 0.25 * reccomended;
		}
	}
    public void org() {
        for (Food F: Foods) {
            if (F.getType() == 0 && F.getCalorie() <= d) {
                Dairy.add(F);
				} else if (F.getType() == 1 && F.getCalorie() <= d) {
                Protein.add(F);
				} else if (F.getType() == 2 && F.getCalorie() <= v) {
                Vegetable.add(F);
				} else if (F.getType() == 3 && F.getCalorie() <= f) {
                Fruit.add(F);
				} else if (F.getType() == 4 && F.getCalorie() <= g) {
                Grains.add(F);
			}
		}
	}
	//each of the following cheat pickers take a string value that is predetermined by the corresponding drop-down menu 
    public void cheatpickerMon(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1().equals(Tag_in) || F.getTag_2().equals(Tag_in)) {
                if (F.getType() == 0 && F.getCalorie() <= d) {
                    CheatFoodMon.add(F);
                    excludeMon = F.getType();
					} else if (F.getType() == 1 && F.getCalorie() <= d) {
                    CheatFoodMon.add(F);
                    excludeMon = F.getType();
					} else if (F.getType() == 2 && F.getCalorie() <= v) {
                    CheatFoodMon.add(F);
                    excludeMon = F.getType();
					} else if (F.getType() == 3 && F.getCalorie() <= f) {
                    CheatFoodMon.add(F);
                    excludeMon = F.getType();
					} else if (F.getType() == 4 && F.getCalorie() <= g) {
                    CheatFoodMon.add(F);
                    excludeMon = F.getType();
				}
			}
		}
	}
    public void cheatpickerTues(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1().equals(Tag_in) || F.getTag_2().equals(Tag_in)) {
                if (F.getType() == 0 && F.getCalorie() <= d) {
                    CheatFoodTues.add(F);
                    excludeTues = F.getType();
					} else if (F.getType() == 1 && F.getCalorie() <= d) {
                    CheatFoodTues.add(F);
                    excludeTues = F.getType();
					} else if (F.getType() == 2 && F.getCalorie() <= v) {
                    CheatFoodTues.add(F);
                    excludeTues = F.getType();
					} else if (F.getType() == 3 && F.getCalorie() <= f) {
                    CheatFoodTues.add(F);
                    excludeTues = F.getType();
					} else if (F.getType() == 4 && F.getCalorie() <= g) {
                    CheatFoodTues.add(F);
                    excludeTues = F.getType();
				}
			}
		}
	}
    public void cheatpickerWeds(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1().equals(Tag_in) || F.getTag_2().equals(Tag_in)) {
                if (F.getType() == 0 && F.getCalorie() <= d) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.getType();
					} else if (F.getType() == 1 && F.getCalorie() <= d) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.getType();
					} else if (F.getType() == 2 && F.getCalorie() <= v) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.getType();
					} else if (F.getType() == 3 && F.getCalorie() <= f) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.getType();
					} else if (F.getType() == 4 && F.getCalorie() <= g) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.getType();
				}
			}
		}
	}
    public void cheatpickerThurs(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1().equals(Tag_in) || F.getTag_2().equals(Tag_in)) {
                if (F.getType() == 0 && F.getCalorie() <= d) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.getType();
					} else if (F.getType() == 1 && F.getCalorie() <= d) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.getType();
					} else if (F.getType() == 2 && F.getCalorie() <= v) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.getType();
					} else if (F.getType() == 3 && F.getCalorie() <= f) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.getType();
					} else if (F.getType() == 4 && F.getCalorie() <= g) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.getType();
				}
			}
		}
	}
    public void cheatpickerFri(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1().equals(Tag_in) || F.getTag_2().equals(Tag_in)) {
                if (F.getType() == 0 && F.getCalorie() <= d) {
                    CheatFoodFri.add(F);
                    excludeFri = F.getType();
					} else if (F.getType() == 1 && F.getCalorie() <= d) {
                    CheatFoodFri.add(F);
                    excludeFri = F.getType();
					} else if (F.getType() == 2 && F.getCalorie() <= v) {
                    CheatFoodFri.add(F);
                    excludeFri = F.getType();
					} else if (F.getType() == 3 && F.getCalorie() <= f) {
                    CheatFoodFri.add(F);
                    excludeFri = F.getType();
					} else if (F.getType() == 4 && F.getCalorie() <= g) {
                    CheatFoodFri.add(F);
                    excludeFri = F.getType();
				}
			}
		}
	}
    public void cheatpickerSat(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1().equals(Tag_in) || F.getTag_2().equals(Tag_in)) {
                if (F.getType() == 0 && F.getCalorie() <= d) {
                    CheatFoodSat.add(F);
                    excludeSat = F.getType();
					} else if (F.getType() == 1 && F.getCalorie() <= d) {
                    CheatFoodSat.add(F);
                    excludeSat = F.getType();
					} else if (F.getType() == 2 && F.getCalorie() <= v) {
                    CheatFoodSat.add(F);
                    excludeSat = F.getType();
					} else if (F.getType() == 3 && F.getCalorie() <= f) {
                    CheatFoodSat.add(F);
                    excludeSat = F.getType();
					} else if (F.getType() == 4 && F.getCalorie() <= g) {
                    CheatFoodSat.add(F);
                    excludeSat = F.getType();
				}
			}
		}
	}
    public void cheatpickerSun(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1().equals(Tag_in) || F.getTag_2().equals(Tag_in)) {
                if (F.getType() == 0 && F.getCalorie() <= d) {
                    CheatFoodSun.add(F);
                    excludeSun = F.getType();
					} else if (F.getType() == 1 && F.getCalorie() <= d) {
                    CheatFoodSun.add(F);
                    excludeSun = F.getType();
					} else if (F.getType() == 2 && F.getCalorie() <= v) {
                    CheatFoodSun.add(F);
                    excludeSun = F.getType();
					} else if (F.getType() == 3 && F.getCalorie() <= f) {
                    CheatFoodSun.add(F);
                    excludeSun = F.getType();
					} else if (F.getType() == 4 && F.getCalorie() <= g) {
                    CheatFoodSun.add(F);
                    excludeSun = F.getType();
				}
			}
		}
	}
	
	// re-randomize button at print screen
	private void rerandomize() {
		Monday.clear();
		Tuesday.clear();
		Wedsnday.clear();
		Thursday.clear();
		Friday.clear();
		Saturday.clear();
		Sunday.clear();
		randomize();
	}
	
    // after cheat food input interface
	private void randomize() {
        Random R = new Random();
        int CFM = R.nextInt(CheatFoodMon.size());
        int DM = R.nextInt(Dairy.size());
        int PM = R.nextInt(Protein.size());
        int VM = R.nextInt(Vegetable.size());
        int FM = R.nextInt(Fruit.size());
        int GM = R.nextInt(Grains.size());
        int CFT = R.nextInt(CheatFoodTues.size());
        int DT = R.nextInt(Dairy.size());
        int PT = R.nextInt(Protein.size());
        int VT = R.nextInt(Vegetable.size());
        int FT = R.nextInt(Fruit.size());
        int GT = R.nextInt(Grains.size());
        int CFW = R.nextInt(CheatFoodWeds.size());
        int DW = R.nextInt(Dairy.size());
        int PW = R.nextInt(Protein.size());
        int VW = R.nextInt(Vegetable.size());
        int FW = R.nextInt(Fruit.size());
        int GW = R.nextInt(Grains.size());
        int CFTH = R.nextInt(CheatFoodThurs.size());
        int DTH = R.nextInt(Dairy.size());
        int PTH = R.nextInt(Protein.size());
        int VTH = R.nextInt(Vegetable.size());
        int FTH = R.nextInt(Fruit.size());
        int GTH = R.nextInt(Grains.size());
        int CFF = R.nextInt(CheatFoodFri.size());
        int DF = R.nextInt(Dairy.size());
        int PF = R.nextInt(Protein.size());
        int VF = R.nextInt(Vegetable.size());
        int FF = R.nextInt(Fruit.size());
        int GF = R.nextInt(Grains.size());
        int CFSA = R.nextInt(CheatFoodSat.size());
        int DSA = R.nextInt(Dairy.size());
        int PSA = R.nextInt(Protein.size());
        int VSA = R.nextInt(Vegetable.size());
        int FSA = R.nextInt(Fruit.size());
        int GSA = R.nextInt(Grains.size());
        int CFSU = R.nextInt(CheatFoodSun.size());
        int DSU = R.nextInt(Dairy.size());
        int PSU = R.nextInt(Protein.size());
        int VSU = R.nextInt(Vegetable.size());
        int FSU = R.nextInt(Fruit.size());
        int GSU = R.nextInt(Grains.size());
        Monday.add(Dairy.get(DM));
        Monday.add(Protein.get(PM));
        Monday.add(Vegetable.get(VM));
        Monday.add(Fruit.get(FM));
        Monday.add(Grains.get(GM));
        Tuesday.add(Dairy.get(DT));
        Tuesday.add(Protein.get(PT));
        Tuesday.add(Vegetable.get(VT));
        Tuesday.add(Fruit.get(FT));
        Tuesday.add(Grains.get(GT));
        Wedsnday.add(Dairy.get(DW));
        Wedsnday.add(Protein.get(PW));
        Wedsnday.add(Vegetable.get(VW));
        Wedsnday.add(Fruit.get(FW));
        Wedsnday.add(Grains.get(GW));
        Thursday.add(Dairy.get(DTH));
        Thursday.add(Protein.get(PTH));
        Thursday.add(Vegetable.get(VTH));
        Thursday.add(Fruit.get(FTH));
        Thursday.add(Grains.get(GTH));
        Friday.add(Dairy.get(DF));
        Friday.add(Protein.get(PF));
        Friday.add(Vegetable.get(VF));
        Friday.add(Fruit.get(FF));
        Friday.add(Grains.get(GF));
        Saturday.add(Dairy.get(DSA));
        Saturday.add(Protein.get(PSA));
        Saturday.add(Vegetable.get(VSA));
        Saturday.add(Fruit.get(FSA));
        Saturday.add(Grains.get(GSA));
        Sunday.add(Dairy.get(DSU));
        Sunday.add(Protein.get(PSU));
        Sunday.add(Vegetable.get(VSU));
        Sunday.add(Fruit.get(FSU));
        Sunday.add(Grains.get(GSU));
        
        for (Food F: Monday) {
            if (F.getType() == excludeMon) {
                Monday.remove(F);
			}
		}
        for (Food F: Tuesday) {
            if (F.getType() == excludeTues) {
                Tuesday.remove(F);
			}
		}
        for (Food F: Wedsnday) {
            if (F.getType() == excludeWeds) {
                Wedsnday.remove(F);
			}
		}		
        for (Food F: Thursday) {
            if (F.getType() == excludeThurs) {
                Thursday.remove(F);
			}
		}
        for (Food F: Friday) {
            if (F.getType() == excludeFri) {
                Friday.remove(F);
			}
		}
        for (Food F: Saturday) {
            if (F.getType() == excludeSat) {
                Saturday.remove(F);
			}
		}
        for (Food F: Sunday) {
            if (F.getType() == excludeSun) {
                Sunday.remove(F);
			}
		}
		
		Monday.add(CheatFoodMon.get(CFM));
		Tuesday.add(CheatFoodMon.get(CFT));
		Wedsnday.add(CheatFoodMon.get(CFW));
		Thursday.add(CheatFoodMon.get(CFTH));
		Friday.add(CheatFoodMon.get(CFF));
		Saturday.add(CheatFoodMon.get(CFSA));
		Sunday.add(CheatFoodMon.get(CFSU));
	}
	//End screen printer
    public void printMonday() {
    	System.out.println("Runs");
        for (Food F: Monday) {
            System.out.println(F.getName() + " " + F.getTypeName() + " " + F.getCalorie() + " calories");
		}
	}
    private void printTuesday() {
        for (Food F: Tuesday) {
            System.out.println(F.getName() + " " + F.getTypeName() + " " + F.getCalorie() + " calories");
		}
	}
    private void printWedsnday() {
        for (Food F: Wedsnday) {
            System.out.println(F.getName() + " " + F.getTypeName() + " " + F.getCalorie() + " calories");
		}
	}
    private void printThursday() {
        for (Food F: Thursday) {
            System.out.println(F.getName() + " " + F.getTypeName() + " " + F.getCalorie() + " calories");
		}
	}
    private void printFriday() {
        for (Food F: Friday) {
            System.out.println(F.getName() + " " + F.getTypeName() + " " + F.getCalorie() + " calories");
		}
	}
    private void printSaturday() {
        for (Food F: Saturday) {
            System.out.println(F.getName() + " " + F.getTypeName() + " " + F.getCalorie() + " calories");
		}
	}
    private void printSunday() {
        for (Food F: Sunday) {
            System.out.println(F.getName() + " " + F.getTypeName() + " " + F.getCalorie() + " calories");
		}
	}
}

