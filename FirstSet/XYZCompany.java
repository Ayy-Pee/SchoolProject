import java.util.Scanner;
public class XYZCompany
{
   public static void main(String[]args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter product price");
       int price = sc.nextInt();
       System.out.println("Enter the number of units sold");
       int unit = sc.nextInt();
       int amt = price*unit;
       float dis = 0.0f;
       if(unit>=100000)
           dis = 7.5f;
       if(unit>=50000)
           dis = 5;
       if(unit>=25000)
           dis = 3.5f;
       if(unit>=10000)
           dis = 2.0f;
       else
           dis = 1.0f;    
       double dis_amt=amt-((dis/100)*amt);
   }
}