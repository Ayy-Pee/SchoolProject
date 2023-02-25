import java.util.Scanner;
class ProgramXIV{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=65;
        int n=1;
        System.out.println("-----Letter Series (a)-----");
            for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print((char)k+" ");
                    k++;
                }
                System.out.println("");
            }
        System.out.println("-----Number Series (b)-----");
            for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(n+" ");
                    n++;
                }
                System.out.println("");
            }
    }
}