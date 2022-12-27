package bsu;

import java.util.Vector;
public interface Nutritious {
    public static int calculateCalories(Vector<Food> breakfast){
        int sum = 0;
        for(int i = 0; i < breakfast.size(); i++){
            sum+=breakfast.get(i).Calories;

        }
        System.out.println("Calories: " + sum);

        return sum;
    }

}
