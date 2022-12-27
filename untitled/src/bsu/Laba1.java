package bsu;

import java.util.Scanner;
import java.util.Vector;


public class Laba1  {


    public static void main(String[]args) throws Exception {
        final String yes ="y";
        final String no = "n";
        final String calorie_сalculator = "-calories";

        try (Scanner in = new Scanner(System.in)) {
            Vector<Food> breakfast = new Vector <Food>();
            System.out.println("Are you hungry? Input 'y' if yes or 'n' if no.");
            String choice = in.nextLine().toLowerCase();

            if (choice.equals(yes)){

                while(true){
                    System.out.println("What would you like for breakfast?");
                    System.out.println("Menu:\n- "+ Food.Cheese + "\n- " + Food.Apple + "\n- " + Food.Coffee + "\n- "+  Food.Tea);
                    System.out.println("\nPick something from the menu: ");

                    String foodName = in.nextLine();
                    if (foodName.equals("Cheese")){
                        breakfast.add(new Cheese());

                    }
                    if (foodName.equals("Tea")){
                        breakfast.add(new Tea());

                    }
                    if (foodName.equals("Coffee")){
                        breakfast.add(new Coffee());
                    }
                    if (foodName.equals("Apple")){
                        breakfast.add(new Apple());
                    }


                    System.out.println("Anything else? Input 'y' if yes or 'n' if no.");
                    if(in.hasNextLine()){
                        choice = in.nextLine().toLowerCase();

                    }



                    if(choice.equals(no)){
                        System.out.print("To calculate calories input '-calories'. ");
                        System.out.println("Else input 'n'.");
                        choice = in.nextLine().toLowerCase();
                        if(choice.equals(calorie_сalculator)){
                            Nutritious.calculateCalories(breakfast);
                        }
                        System.out.println("Have a good day)");
                        break;
                    }

                }


            }
            else{
                System.out.println("Hope, you will visit us later)");
            }
            //in.close();
        }

    }

}

