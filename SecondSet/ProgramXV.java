public class ProgramXV{
    public static void main(String[]args){
        int n=10;
        System.out.println("-----Number Series (a)-----");
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n--;
            }
            System.out.println("");
        }
        System.out.println("-----Number Series (b)-----");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}