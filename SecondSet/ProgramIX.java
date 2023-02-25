import java.util.Scanner;
class ProgramIX{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number.");
        int num=sc.nextInt();
        System.out.println("Enter [1] for Palindrome number and [2] for Niven number.");
        int exe=sc.nextInt();   
        int temp=num;
        int x=0, y=0;
        switch(exe){
            case 1: 
                while(temp!=0){
                    x=temp%10;
                    y=y*10+x;
                    temp=temp/10;
                }
                if(y==num)
                    System.out.println("Palindrome number");
                else
                    System.out.println("Not a Palindrome number");
                    break;
            case 2: 
                while(temp!=0){
                    x=temp%10;
                    y=y+x;
                    temp=temp/10;
                }
                if(num%y==0)
                    System.out.println("Niven number");
                else
                    System.out.println("Not a Niven number");
                break;
            default:
                System.out.println("Wrong Input!");
        }
    }
}