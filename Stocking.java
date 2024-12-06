public class Stocking
{
    //Instance variable are stored in dynamically
    private String owner; // Owner of the stocking
    private int itemCount; //Number of items in a stocking
    private int idNum; //ID Number of a stocking

    private static int stockingCount = 0; //Static variables belong to the class
    public Stocking()
    {
        owner = "";
        itemCount = 0;
        stockingCount++;
        idNum = stockingCount;
    }
    public Stocking (String name, int initItems)
    {
        owner = name;
        itemCount = initItems;
        idNum = ++stockingCount;
    }
    public int getitemCount()
    {
        return itemCount;
    }
    public String getOwner()
    {
        return owner;
    }
    public int getID()
    {
        return idNum;
    }
}
class TestStocking()
{
    public static void main(String[] args)
    {
        Stocking s1 = new Stocking();
        Stocking s2 = new Stocking("Silas", 4);
        Stocking s3 = new Stocking("Micah", 2);

        s2.getitemCount();
    }

}
