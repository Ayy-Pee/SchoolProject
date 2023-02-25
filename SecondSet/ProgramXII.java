import java.util.Scanner;
class ProgramXII{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int inp,even=0,odd=0,ave=0,sum=0;
        System.out.println("Enter 20 numbers");
        for(int i=1;i<=20;i++){
            inp=sc.nextInt();
            if(inp%2==0)
                even+=inp;
            else
                odd+=1;
            sum+=inp;
            ave=sum/20;
        }
        System.out.println("Sum of all even number: "+even+"\nCount of all odd number: "+odd+"\nAverage of all numbers: "+ave);
    }
}