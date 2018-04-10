// Testing push from Andy to Jonathan

package calculations;

public class Calc{
    private int age;
    private int goal;
    private int recommended;
    private String goalname;
    private double fos;
    private double p;
    private double d;
    private double f;
    private double v;
    private double g;
    
    public Calc(int age,int goal){
        this.age = age;
        this.goal = goal;
        if(goal==0){this.goalname = "Bulking";}
        else if (goal==1){this.goalname="Normal Planning";}
        else{this.goalname="Losing Weight";}
        recommendedcalc(this.age,this.goal);
    }
    private void recommendedcalc(int age,int goal){
        int temprec = 0;
        if(age>0&&age<=5){
            temprec = 1400;
            this.recommended=temprec;
            goalcalc(temprec,goal);
        }
        else if(age>5&&age<=10){
            temprec = 1800;
            this.recommended=temprec;
            goalcalc(temprec,goal);
        }
        else if((age>10&&age<=13)||(age>66)){
            temprec = 2200;
            this.recommended=temprec;
            goalcalc(temprec,goal);
        }
        else if((age>13&&age<=16)||(age>46&&age<=65)){
            temprec = 2400;
            this.recommended=temprec;
            goalcalc(temprec,goal);
        }
        else if((age>16&&age<=20)||(age>26&&age<=45)){
            temprec = 2600;
            this.recommended=temprec;
            goalcalc(temprec,goal);
        }
        else if(20>0&&age<=25){
            temprec = 2800; 
            this.recommended=temprec;
            goalcalc(temprec,goal);
        }
    }
    private void goalcalc(int temprec,int goal){
        if (goal == 0){
            this.fos=0.01;
            this.p=0.40;
            this.d=0.20;
            this.v=0.15;
            this.f=0.15;
            this.g=0.10;
        }
        else if (goal == 1){
            this.fos=0.01;
            this.p=0.10;
            this.d=0.10;
            this.v=0.15;
            this.f=0.15;
            this.g=0.40;
        }
        else if (goal == 2){
            this.fos=0.01;
            this.p=0.10;
            this.d=0.15;
            this.v=0.25;
            this.f=0.25;
            this.g=0.25;
        }
    }
}

