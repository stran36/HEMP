import java.util.Random;
public class preference {
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
    private List < Food > Foods = new < Food > ArrayList();
    private List < Food > Dairy = new < Food > ArrayList();
    private List < Food > Protein = new < Food > ArrayList();
    private List < Food > Vegetable = new < Food > ArrayList();
    private List < Food > Fruit = new < Food > ArrayList();
    private List < Food > Grains = new < Food > ArrayList();
    private List < Food > CheatFoodMon = new < Food > ArrayList();
    private List < Food > CheatFoodTues = new < Food > ArrayList();
    private List < Food > CheatFoodWeds = new < Food > ArrayList();
    private List < Food > CheatFoodThurs = new < Food > ArrayList();
    private List < Food > CheatFoodFri = new < Food > ArrayList();
    private List < Food > CheatFoodSat = new < Food > ArrayList();
    private List < Food > CheatFoodSun = new < Food > ArrayList();
    private List < Food > Monday = new < Food > ArrayList();
    private List < Food > Tuesday = new < Food > ArrayList();
    private List < Food > Wedsnday = new < Food > ArrayList();
    private List < Food > Thursday = new < Food > ArrayList();
    private List < Food > Friday = new < Food > ArrayList();
    private List < Food > Saturday = new < Food > ArrayList();
    private List < Food > Sunday = new < Food > ArrayList();
    Foods.add(new Food(name, type, calorie, Tag_1, Tag_2));
	
	// constructor used after user interacts with goal module
    public void preference(int goal) {
        this.goal = goal;
        if (goal == 0) {
            goalname = "Muscle Gain"
        } else if (goal == 1) {
            goalname = "Maintaining Weight"
        } else {
            goalname = "Weight loss"
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
            if (F.gettype == 0 && F.getcalorie = < d) {
                Dairy.add(F);
            } else if (F.gettype == 1 && F.getcalorie = < d) {
                Protein.add(F);
            } else if (F.gettype == 2 && F.getcalorie = < v) {
                Vegetable.add(F);
            } else if (F.gettype == 3 && F.getcalorie = < f) {
                Fruit.add(F);
            } else if (F.gettype == 4 && F.getcalorie = < g) {
                Grains.add(F);
            }
        }
    }
	//each of the following cheat pickers take a string value that is predetermined by the corresponding drop-down menu 
    public void cheatpickerMon(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1.equals(Tag_in) || F.getTag_1.equals(Tag_in)) {
                if (F.gettype == 0 && F.getcalorie = < d) {
                    CheatFoodMon.add(F);
                    excludeMon = F.gettype();
                } else if (F.gettype == 1 && F.getcalorie = < d) {
                    CheatFoodMon.add(F);
                    excludeMon = F.gettype();
                } else if (F.gettype == 2 && F.getcalorie = < v) {
                    CheatFoodMon.add(F);
                    excludeMon = F.gettype();
                } else if (F.gettype == 3 && F.getcalorie = < f) {
                    CheatFoodMon.add(F);
                    excludeMon = F.gettype;
                } else if (F.gettype == 4 && F.getcalorie = < g) {
                    CheatFoodMon.add(F);
                    excludeMon = F.gettype();
                }
            }
        }
    }
    public void cheatpickerTues(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1.equals(Tag_in) || F.getTag_1.equals(Tag_in)) {
                if (F.gettype == 0 && F.getcalorie = < d) {
                    CheatFoodTues.add(F);
                    excludeTues = F.gettype();
                } else if (F.gettype == 1 && F.getcalorie = < d) {
                    CheatFoodTues.add(F);
                    excludeTues = F.gettype();
                } else if (F.gettype == 2 && F.getcalorie = < v) {
                    CheatFoodTues.add(F);
                    excludeTues = F.gettype();
                } else if (F.gettype == 3 && F.getcalorie = < f) {
                    CheatFoodTues.add(F);
                    excludeTues = F.gettype();
                } else if (F.gettype == 4 && F.getcalorie = < g) {
                    CheatFoodTues.add(F);
                    excludeTues = F.gettype();
                }
            }
        }
    }
    public void cheatpickerWeds(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1.equals(Tag_in) || F.getTag_1.equals(Tag_in)) {
                if (F.gettype == 0 && F.getcalorie = < d) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.gettype();
                } else if (F.gettype == 1 && F.getcalorie = < d) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.gettype();
                } else if (F.gettype == 2 && F.getcalorie = < v) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.gettype();
                } else if (F.gettype == 3 && F.getcalorie = < f) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.gettype();
                } else if (F.gettype == 4 && F.getcalorie = < g) {
                    CheatFoodWeds.add(F);
                    excludeWeds = F.gettype();
                }
            }
        }
    }
    public void cheatpickerThurs(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1.equals(Tag_in) || F.getTag_1.equals(Tag_in)) {
                if (F.gettype == 0 && F.getcalorie = < d) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.gettype();
                } else if (F.gettype == 1 && F.getcalorie = < d) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.gettype();
                } else if (F.gettype == 2 && F.getcalorie = < v) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.gettype();
                } else if (F.gettype == 3 && F.getcalorie = < f) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.gettype();
                } else if (F.gettype == 4 && F.getcalorie = < g) {
                    CheatFoodThurs.add(F);
                    excludeThurs = F.gettype();
                }
            }
        }
    }
    public void cheatpickerFri(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1.equals(Tag_in) || F.getTag_1.equals(Tag_in)) {
                if (F.gettype == 0 && F.getcalorie = < d) {
                    CheatFoodFri.add(F);
                    excludeFri = F.gettype();
                } else if (F.gettype == 1 && F.getcalorie = < d) {
                    CheatFoodFri.add(F);
                    excludeFri = F.gettype();
                } else if (F.gettype == 2 && F.getcalorie = < v) {
                    CheatFoodFri.add(F);
                    excludeFri = F.gettype();
                } else if (F.gettype == 3 && F.getcalorie = < f) {
                    CheatFoodFri.add(F);
                    excludeFri = F.gettype();
                } else if (F.gettype == 4 && F.getcalorie = < g) {
                    CheatFoodFri.add(F);
                    excludeFri = F.gettype();
                }
            }
        }
    }
    public void cheatpickerSat(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1.equals(Tag_in) || F.getTag_1.equals(Tag_in)) {
                if (F.gettype == 0 && F.getcalorie = < d) {
                    CheatFoodSat.add(F);
                    excludeSat = F.gettype();
                } else if (F.gettype == 1 && F.getcalorie = < d) {
                    CheatFoodSat.add(F);
                    excludeSat = F.gettype();
                } else if (F.gettype == 2 && F.getcalorie = < v) {
                    CheatFoodSat.add(F);
                    excludeSat = F.gettype();
                } else if (F.gettype == 3 && F.getcalorie = < f) {
                    CheatFoodSat.add(F);
                    excludeSat = F.gettype();
                } else if (F.gettype == 4 && F.getcalorie = < g) {
                    CheatFoodSat.add(F);
                    excludeSat = F.gettype();
                }
            }
        }
    }
    public void cheatpickerSun(String Tag_in) {
        for (Food F: Foods) {
            if (F.getTag_1.equals(Tag_in) || F.getTag_1.equals(Tag_in)) {
                if (F.gettype == 0 && F.getcalorie = < d) {
                    CheatFoodSun.add(F);
                    excludeSun = F.gettype();
                } else if (F.gettype == 1 && F.getcalorie = < d) {
                    CheatFoodSun.add(F);
                    excludeSun = F.gettype();
                } else if (F.gettype == 2 && F.getcalorie = < v) {
                    CheatFoodSun.add(F);
                    excludeSun = F.gettype();
                } else if (F.gettype == 3 && F.getcalorie = < f) {
                    CheatFoodSun.add(F);
                    excludeSun = F.gettype();
                } else if (F.gettype == 4 && F.getcalorie = < g) {
                    CheatFoodSun.add(F);
                    excludeSun = F.gettype();
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
            if (F.gettype == excludeMon) {
                Monday.remove(F)
            }
        }
        for (Food F: Tuesday) {
            if (F.gettype == excludeTues) {
                Tuesday.remove(F)
            }
        }
        for (Food F: Wedsnday) {
            if (F.gettype == excludeWeds) {
                Wedsnday.remove(F)
            }
        }		
        for (Food F: Thursday) {
            if (F.gettype == excludeThurs) {
                Thursday.remove(F)
            }
        }
        for (Food F: Friday) {
            if (F.gettype == excludeFri) {
                Friday.remove(F)
            }
        }
        for (Food F: Saturday) {
            if (F.gettype == excludeSat) {
                Saturday.remove(F)
            }
        }
        for (Food F: Sunday) {
            if (F.gettype == excludeSun) {
                Sunday.remove(F)
            }
        }
		
		Monday.add(CFM);
		Tuesday.add(CFT);
		Wedsnday.add(CFW);
		Thursday.add(CFTH);
		Friday.add(CFF);
		Saturday.add(CFSA);
		Sunday.add(CFSU);
    }
   //End screen printer
    private void printMonday() {
        for (Food F: Monday) {
            System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
        }
    }
    private void printTuesday() {
        for (Food F: Tuesday) {
            System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
        }
    }
    private void printWedsnday() {
        for (Food F: Wedsnday) {
            System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
        }
    }
    private void printThursday() {
        for (Food F: Thursday) {
            System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
        }
    }
    private void printFriday() {
        for (Food F: Friday) {
            System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
        }
    }
    private void printSaturday() {
        for (Food F: Saturday) {
            System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
        }
    }
    private void printSunday() {
        for (Food F: Sunday) {
            System.out.println(F.getname() + " " + F.gettypename() + " " + F.getcalorie() + " calories");
        }
    }
}