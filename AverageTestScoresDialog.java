//This program displays the average of 3 inputed test scores.
import javax.swing.JOptionPane;
 public class AverageTestScoresDialog {
    public static void main(String[] args)
   {
    String input; // To hold the user's input
    int testscore1; //test score one
    int testscore2; //test score 2
    int testscore3; //test score 3
    double average; //average of all 3 test scores 


//Enter the first test score  
input = JOptionPane.showInputDialog("What is your first test score?"); 
testscore1 = Integer.parseInt(input); 

//Enter the second test score 
input = JOptionPane.showInputDialog("What is your second test score?"); 
testscore2 = Integer.parseInt(input); 

//Enter the third test score 
input = JOptionPane.showInputDialog("What is your third test score?"); 
testscore3 = Integer.parseInt(input); 

//calculate the average 
average = (testscore1 + testscore2 + testscore3) / 3;

//display the average of the test scores in a dialog box
JOptionPane.showMessageDialog(null, "Your average for the testscores are " + average);

 System.exit(0);
   
}

}
