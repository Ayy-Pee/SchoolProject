import java.util.Scanner;
class ProgramXIII{
    public static void main(String[]args){
        int fac,sum=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number.");
        int num=sc.nextInt();
        int num2=num;
        while(num2!=0){
            fac=1;
            n=num2%10;
            for(int i=n;i>=1;i--){
                fac=fac*i;
            }
            sum=sum+fac;
            num2=num2/10;
        }
        if(sum==num)
            System.out.println("Special number!");
        else
            System.out.println("Not a Special number!");
    }
}