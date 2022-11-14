class ElectricityBill
{
    public static void main(String[]args)
    {
        int FixRent=250;
        int CMR=1750;
        int LMR=1200;
        float RPU=6.75f;
        int TUC = CMR-LMR;
        float bill_amt=TUC*RPU+250;
        System.out.println("Total unit consumed: "+TUC);
        System.out.println("Rate per unit: "+RPU);
        System.out.println("Bill amount: "+bill_amt);
    }
}