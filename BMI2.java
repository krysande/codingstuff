 import java.util.Scanner; 

public class BMI2
{   

 public static void main(String[] args)
{


        double height; 
		double heightFeet; 
		double heightInches; 
		double weight;
		double BMI;
		
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Your height (feet only): ");
        heightFeet = keyboard.nextDouble();
        System.out.print("Your height (inches): ");
        heightInches = keyboard.nextDouble();
        System.out.print("Your weight in pounds: ");
        weight = keyboard.nextDouble();
        height = heightFeet * 12 + heightInches;
        BMI = weight * (703 / (height * height));
        System.out.println("Your BMI is " + BMI);
        System.out.println("BMI Category: " + BMI);
		if (BMI < 18.5) {
           System.out.println("underweight");
        }
        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("normal weight");
        }
        if (BMI >= 25.0) {
            System.out.println("overweight");
        }
}
}