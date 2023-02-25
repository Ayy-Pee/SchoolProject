import java.util.Scanner;
class ProgramX{
    public static void main(String[]args){
        double cal;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your calculation!");
        System.out.println("Area of Circle-[1], Area of Square-[2], Area of Rectangle-[3]");
        int op=sc.nextInt();
        switch(op){
            case 1: System.out.println("Enter length of radius.");
                    int r=sc.nextInt();
                    cal=Math.PI*Math.pow(r,2);
                    System.out.println("Radius of circle: "+cal);
                    break;
            case 2: System.out.println("Enter length of side.");
                    int s=sc.nextInt();
                    cal=Math.pow(s,2);
                    System.out.println("Area of square: "+cal);
                    break;
            case 3: System.out.println("Enter length.");
                    int l=sc.nextInt();
                    System.out.println("Enter breadth.");
                    int b=sc.nextInt();
                    cal=l*b;
                    System.out.println("Area of Rectangle: "+cal);
                    break;
        }
    }
}