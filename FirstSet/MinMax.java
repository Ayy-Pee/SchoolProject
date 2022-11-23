import java.util.Scanner;
class MinMax
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = sc.nextInt();
        System.out.println("Enter value of y");
        int y = sc.nextInt();
        System.out.println("Enter value of z");
        int z = sc.nextInt();
        System.out.println("Maximum number is: "+Math.max(x,Math.max(y,z)));
        System.out.println("Minimum number is: "+Math.min(x,Math.min(y,z)));
    }
}
