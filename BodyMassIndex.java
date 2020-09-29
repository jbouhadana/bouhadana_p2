import java.util.*;

public class BodyMassIndex {
    System.out.println("Hello! Welcome to the BMI calculator");
    Scanner console = new Scanner(System.in);

boolean n = false;
        do {
            try {
                System.out.print("Would you like to check your bmi?(enter y or n)");
                Scanner n = new Scanner(System.in);
                boolean an = n.nextBoolean();
                if (an == y) {
    System.out.print("height in inches: ");
    double UserHeight = console.nextDouble();
    System.out.print("weight in pounds: ");
    double UserWeight = console.nextDouble();
    double bmi = UserWeight * 703 / UserHeight / UserHeight;
    System.out.printf("BMI = %.2f\n", bmi);
    if(bmi < 18.5) {
      System.out.println("underweight");
    }else if (bmi < 25) {
      System.out.println("normal");
    }else if (bmi <= 30) {
      System.out.println("overweight");
    }else{
      System.out.println("obese");
    }
                } else if (an == n) {
                    System.out.println("GoodBye!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            }
        } while (!b);



  }