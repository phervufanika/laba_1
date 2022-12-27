package bsu;

public class Cheese extends Food {


    public Cheese() {
        super (Food.Cheese);
        this.Calories=calories();
    }

    public void consume() {
        System.out.println(this + " was eaten");
    }
    public double calories(){

        Calories += 300;
        return Calories;
    }
}
