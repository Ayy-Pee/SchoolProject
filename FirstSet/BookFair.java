import java.util.Scanner;
class BookFair
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the store");
        String nm = sc.nextLine();
        System.out.println("Enter the price of the book");
        float price = sc.nextFloat();
        float dis = 0.0f;
        if(price<=1000)
            dis = 2.0f;
        else if(price<=3000)
            dis = 10.0f;
        else if(price>3000)
            dis = 15.5f;
        float dis_price=price-((dis/100)*price);
        System.out.println("Shop name: "+nm);
        System.out.println("Price after discount is: "+dis_price);
    }
}
