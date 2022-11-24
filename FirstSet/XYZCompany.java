import java.util.Scanner;
public class XYZCompany
{
   public static void main(String[]args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter product price");
       double price = sc.nextInt();
       System.out.println("Enter the number of units sold");
       int unit = sc.nextInt();
       double amt = price*unit;
       float dis = 0.0f;
       if(amount>=100000)
           dis = 7.5f;
       else if(amount>=50000)
           dis = 5;
       else if(amount>=25000)
           dis = 3.5f;
       else if(unit>=10000)
           dis = 2.0f;
       else
           dis = 1.0f;    
       double dis_amt=amt-((dis/100)*amt);
       System.out.println("Amount: "+amt);
       System.out.println("Discount: "+dis);
       System.out.println(Discounted amount: "+dis_amt);
   }
}
