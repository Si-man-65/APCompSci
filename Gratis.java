public class Gratis
{
    private int GratisCount = 0;
    private int XtGratisCount = 0;
    private int MissFee = 2;
    private int RegularFee = 1;
    private String name;
    private String dorm;

    public static void main(String[] args)
    {
        Gratis Silas = new Gratis("Silas", 7);
        Silas.print();
      
    }

    public Gratis(String nameIn, int GratisCountIn)
    {
        name = nameIn;
        GratisCount = GratisCountIn;
       
     

    }


    public void print()
    {
        System.out.println("Name: " + name + ", Gratis Count: " + GratisCount);
        if(GratisCount > 5)
        {
            System.out.println("Wow youve got a lot of gratises!");
        }
    }



}
