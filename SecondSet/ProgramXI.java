import java.util.Scanner;
class ProgramXI{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double sum=0,cal=0;
        System.out.println("-----[a]-----\n");
        for(double i=1.0;i<=10;i++){
            cal+=1.0/i;
        }
        System.out.println("Sum: "+cal+"\n\n");
        
        System.out.println("-----[b]-----\n");
        System.out.println("Enter base number.");
        int x=sc.nextInt();
        System.out.println("Enter exponent number.");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            sum+=x/(Math.pow(x,i)/i);
        }
        System.out.println("Sum: "+sum);
    }
}