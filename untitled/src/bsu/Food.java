package bsu;

import java.util.Scanner;

public abstract class Food implements Consumable {
    String name = null;
    public double Calories;
    public static final String Coffee = "Coffee";
    public static final String Cheese = "Cheese";
    public static final String Apple = "Apple";
    public static final String Tea = "Tea";
    public Food(String name) {
        this.name = name;
        this.Calories = 0;
    }

    public String toString() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public void setCalories(double Calories) {
        this.Calories = Calories;
    }

    public double getCalories() {
        return Calories;
    }


    public static String choiceFeature(String[] feature) {
        try (Scanner on = new Scanner(System.in)) {
            System.out.println("We have:");
            for (int i = 0; i < feature.length; i++) {
                System.out.println("- " + feature[i]);
            }
            System.out.println("\nWhat would you like?");

            String ch;

            while (true) {
                ch = on.nextLine();
                for (int i = 0; i < feature.length; i++) {
                    if (ch.equals(feature[i])) {
                        return feature[i];
                    }
                }

                System.out.println("Wrong input, try again");
            }
        }
    }
}