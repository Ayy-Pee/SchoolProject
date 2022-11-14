import java.util.Scanner;
class MathFunc
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p");
        int p = sc.nextInt();
        System.out.println("Enter the value of q");
        int q = sc.nextInt();
        System.out.println("p to the power q: "+Math.pow(p,q));
        System.out.println("Square root of p: "+Math.sqrt(p));
    }
}