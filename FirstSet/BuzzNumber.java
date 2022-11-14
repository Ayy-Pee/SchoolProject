import java.util.Scanner;
class BuzzNumber
{
    public static void main(String[]args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number you want to check for Buzz number");
        int n = sc.nextInt();
        String x = (n%7==0||n%10==7)?"a Buzz number":"not a Buzz number";
        System.out.println(n+" is "+x);
    }
}