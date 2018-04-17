package calculations;

public class Food {
    private String name;
    private int type;
    private String typename;
    private int calorie;
	private String Tag_1;
	private String Tag_2;
    
    public Food(String name,int type, int calorie, String Tag_1, String Tag_2){
        this.name=name;
        this.type=type;
		this.Tag_1=Tag_1;
		this.Tag_2=Tag_2;
        if(type == 0){typename = "Dairy";}
        else if(type == 1){typename = "Protein";}
        else if(type == 2){typename = "Vegetable";}
        else if(type == 3){typename = "Fruit";}
        else{typename = "Grain and Cereals";}
        this.calorie=calorie;
    }
    public String getname(){
        return name;
    }
    public int getType(){
        return type;
    }
    public String getTypeName(){
        return typename;
    }
    public int getCalorie(){
        return calorie;
    }
	public String getTag_1(){
        return Tag_1;
    }
	public String getTag_2(){
        return Tag_2;
    }
	
    
}
