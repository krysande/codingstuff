import java.util.Scanner; 

public class AverageTestScoresPrint
{   

 public static void main(String[] args)
{
	String input; 
    int testscore1; 
    int testscore2; 
    int testscore3; 
    double average; 
	
	Scanner keyboard = new Scanner(System.in);
    System.out.print("What is your first test score?");
	testscore1 = keyboard.nextInt();
	System.out.print("What is your second test score?");
	testscore2 = keyboard.nextInt();
	System.out.print("What is your third test score?");
	testscore3 = keyboard.nextInt();
	average = ((testscore1 + testscore2 + testscore3) / 3);
	
	System.out.println ("Your average for the testscores are " + average);
	 }
}