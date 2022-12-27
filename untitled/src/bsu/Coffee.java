package bsu;

public class Coffee extends Food{
    public final String[] aroma={"rich","bitter","oriental"};
    static final double[] calories_fill={37,35,38};
    public String aroma_;

    public Coffee() {
        super ("Coffee");
        this.aroma_ =choiceAroma(aroma) ;
        this.Calories = calories();
    }
    public static String choiceAroma(String[] aromas){
        System.out.println("\nChoose an aroma.");
        return Food.choiceFeature(aromas);
    }
    public double calories(){

        Calories += fill_calorie();
        return Calories;
    }
    public double fill_calorie(){
        for(int i = 0; i < aroma.length; i++){
            if(this.aroma_.equals(aroma[i])){
                return calories_fill[i];
            }
        }
        return 0;
    }


    @Override
    public void consume() {
        System.out.println(this + " was drunk");

    }

}



