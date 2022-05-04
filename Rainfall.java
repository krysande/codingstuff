import javax.swing.JOptionPane;
import java.util.Scanner; 

public class Rainfall
{
public    static void main(String[] args)
{
        Scanner rainfall = new Scanner(System.in);
		final int ONE_YEAR = 12;
        double rain[] = new double[ONE_YEAR];
        double sum = 0;
        double avg = 0;
        double most = 0;
        double least = 0;

        System.out.println("Welcome to the Yearly Rainfall Program!");
        System.out.println("");
        System.out.println("Please enter in the following rainfall for the months ahead: ");
        System.out.println("Monthly Rainfall (In inches)");

        String months[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i=0;i<months.length;i++) {
            System.out.println(months[i]+" :");
            double val = rainfall.nextDouble();
            while(val<0){
                System.out.println("negatives not allowed ! Please enter again");
                val = rainfall.nextDouble();
            }
            rain[i]=val;
            sum+=val;
        }

        avg = sum / 12;

        System.out.println("The sum of all the rain is: " + sum +" inches");
        System.out.println("The average rainfall was:" + avg + " inches");
        most = getMaxValue(rain);
        least = getMinValue(rain);
        System.out.println("The max rain is: " + most +" inches");
        System.out.println("The min rain is: " + least+ " inches");
		 System.out.println("Thank You!");
    }

    private static double getMaxValue(double[] rain) {
        double max = 0;
        for (double i : rain) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static double getMinValue(double[] rain) {

        double min = Double.MAX_VALUE;
        for (double i : rain) {
                        System.out.println(i);
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
        return min;
    }
}