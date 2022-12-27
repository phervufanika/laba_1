package bsu;

public class  Apple extends Food {

    public final String[] size = {"big", "small", "middle"};
    static final double[] calories_fill = {60, 40, 50};
    public String size_;

    public Apple() {
        super("Apple");
        this.size_ = choiceSize(size);
        this.Calories = calories();
    }

    public static String choiceSize(String[] sz) {
        System.out.println("\nChoose a size.");
        return Food.choiceFeature(sz);
    }

    public double calories() {

        Calories += fill_calorie();
        return Calories;
    }

    public double fill_calorie() {
        for (int i = 0; i < size.length; i++) {
            if (this.size_.equals(size[i])) {
                return calories_fill[i];
            }
        }
        return 0;
    }


    @Override
    public void consume() {
        System.out.println(this + " was eaten");

    }
}
