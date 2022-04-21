/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * krystle sanders
 */
public class Sales
{
public static void main(String[] args)
{
    final int ONE_WEEK = 7;
    double[] sales = new double[ONE_WEEK];
	
    getValues(sales);
	SalesData week = new SalesData(sales);
	DecimalFormat dollar = new DecimalFormat("#,##0.00");
    JOptionPane.showMessageDialog(null, 
     String.format("The total sales were $%,.2f\n" +
              "The average sales were $%,.2f\n"+
             "the highest sales were $%,.2f"+
             "The lowest sales were $%,.2f",
             week.getTotal(),
             week.getAverage(),
             week.getHighest(),
             week.getLowest()));
            System.exit(0);    
}
private static void getValues(double[] array)
{
    String input;
    for (int i = 0;  i < array.length; i++)
    {
        input = JOptionPane.showInputDialog(
            "Enter the sales for the day "+ (i+1) + ",");
        array[i]= Double.parseDouble(input);
    }
    }
}
