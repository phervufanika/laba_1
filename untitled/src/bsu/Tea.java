package bsu;

public class Tea extends Food {


    public Tea() {
        super (Food.Tea);
        this.Calories=calories();
    }

    public void consume() {
        System.out.println(this + " was drunk ");
    }
    public double calories(){

        Calories += 0;
        return Calories;
    }
}