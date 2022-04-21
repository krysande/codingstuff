import java.util.Scanner; 

public class BookClubPoints
{
 public static void main(String[] args)
{
int numberofbookspurchased;

Scanner keyboard = new Scanner(System.in);

System.out.print("Welcome to Serendipity Booksellers."   +
"Please enter total number of books you've bought this month.");
numberofbookspurchased = keyboard.nextInt();
switch (numberofbookspurchased)
{
 case 1:
 System.out.println("You have earned 5 points this month.");
 break;
 case 2:
 System.out.println("You have earned 15 points this month.");
 break;
 case 3:
 System.out.println("You have earned 30 points this month.");
 break;
case 4:
System.out.println("You have earned 60 points this month.");
 break;
case 0 :
            System.out.println("Sorry you haven't earned any points this month");
         break;

 }
}
}