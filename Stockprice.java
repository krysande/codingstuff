 public class Stockprice 
 {
 public static void main(String[] args)
 {
 String input; 
 int shares; 
 int price; 
 int commission; 
 shares = 600;
 price = $21.77;
 comission = .02;
 double totalstockprice;
 double totalcommission; 
 double totalamount; 

totalstockprice = shares * price; 
system.out.printin("total stock price =" + totalstockprice);

totalcommission = totalstockprice * commission; 
system.out.printin("total commision =" + totalcommission);

totalamount = totalstockprice + totalcommission; 
system.out.printin("total amount =" + totalamount);
 System.exit(0);
    }

}