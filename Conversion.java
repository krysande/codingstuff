import javax.swing.JOptionPane;
import java.util.Scanner; 

public class Conversion
{
public static void main(String[] args)
{

double distance;
      
     
      Scanner keyboard = new Scanner(System.in);
      
      
      System.out.print("Enter a distance in meters: ");
      distance = keyboard.nextDouble();
      
      while (distance < 0){
         System.out.println("Distance cannot be negative.");
         System.out.print("Please enter a distance in meters: ");
         distance = keyboard.nextDouble();
      }
 
      menu(distance);
      
     }
   
  public static void menu(double distance){
      
     
      int sentinal = 0;
      String choice;
      
      
      do {
         
         System.out.println("1. Convert to kilometers");
         System.out.println("2. Convert to inches");
         System.out.println("3. Convert to feet");
         System.out.println("4. Quit the program");
         
         
         Scanner keyboard = new Scanner(System.in);
         System.out.print("\nPlease enter your choice: ");
         choice = keyboard.next();
         
         if (choice.equals("1")){
            showKilometers(distance);
         }
         else if(choice.equals("2")){
            showInches(distance);
         }
         else if(choice.equals("3")){
            showFeet(distance);
         }
         else if(choice.equals("4")){
            System.out.println("Thanks");
            sentinal = -99;
         }
         else {
            System.out.println("Invalid choice!");
         }
      }
      while (sentinal != -99);
  
  }

  
  
 
  public static void showKilometers(double distance){
      
     
      final double KILO_CONVERSION = 0.001;
      double kilometers;
      
   
      kilometers = distance * KILO_CONVERSION;
      
    
      System.out.printf("%,.2f meters is %,.2f kilometers%n%n" , distance, kilometers);
  }

  public static void showInches(double distance){
  
      
      final double INCHES_CONVERSION = 39.37;
      double inches;
      
     
      inches = distance * INCHES_CONVERSION;
      
    
      System.out.printf("%,.2f meters is %,.2f inches%n%n" , distance, inches);
   
  }  
  

  
  
 
  public static void showFeet(double distance){
  
      
      final double FEET_CONVERSION = 3.281;
      double feet;
      
      
      feet = distance * FEET_CONVERSION;
      
     
      System.out.printf("%,.2f meters is %,.2f feet%n%n" , distance, feet);
  }  


}