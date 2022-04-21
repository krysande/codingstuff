public class BMI
{
 public static void main(String[] args)
{

String input; 
double weight;
Double height; 
double squared;
double bmi;
 

 input = JOptionPane.showInputDialog("Please Enter your height in inches"  +
 "inches.");
height = Double.parseDouble(input);


input = JOptionPane.showInputDialog("Enter your weight. " +
"lbs.");
weight = Double.parseDouble(input);


BMI= weight * 703 / (height * height);
JoptionPane.showmessagedialog(null, "your bmi is" + bmi);

 if (bmi < 18.5);
{
JOptionPane.showMessageDialog(null, "Your BMI is underweight.");
}
else if (BMI > 18.5 || BMI < 24.9);
{ 
JOptionPane.showMessageDialog(null, "Your BMI is at optimal weight");
}
else if(bmi > 25);
{
 JOptionPane.showMessageDialog(null, "Your BMI is overweight.");
}
 System.exit(0);
}

}