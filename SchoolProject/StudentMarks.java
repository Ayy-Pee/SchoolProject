import java.util.Scanner;
public class StudentMarks
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's name.");
        String nm = sc.nextLine();
        System.out.println("Enter student's class.");
        String cls = sc.nextLine();
        System.out.println("Enter student's Roll number.");
        String roll = sc.nextLine();
        System.out.println("Enter Marks of Subject 1");
        float m1 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 2");
        float m2 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 3");
        float m3 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 4");
        float m4 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 5");
        float m5 = sc.nextFloat();
        float total = m1+m2+m3+m4+m5;
        float per = (total/500)*100;
        char  grade;
        if(per>=90)
            grade = 'A';
        else if(per>=70)
            grade = 'B';
        else if(per>=50)
            grade = 'C';
        else if(per>=40)
            grade = 'D';
        else
            grade = 'E';
    }
}