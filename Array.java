import java.util.Scanner;
public class Array {

    public static void main(String[] args)
    {
        int[] intArray = new int[3]; //Declare and initialize an array
        boolean quit = false;
        Scanner scan = new Scanner(System.in);

        intArray[0] = (int) (Math.random()*7 + 1);
        intArray[1] = (int) (Math.random()*7 + 1);
        intArray[2] = (int) (Math.random()*7 + 1);

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

        int[] array = new int[50];

        //Create a list with the first 50 even integers using a for loop
        for(int count = 0; count <50; count++)
        {  
            array[count] = (int)(Math.random()*7 + 1);
            System.out.println(array[count]);
        }

        
        
        String[] names = {"Levi", "Silas", "Micah", "Jong-In"};

        names[0] = "Levi"; names[1] = "Silas"; names[2] = "Micah"; names[3] = "Jong-In";

        while(!quit)
        {
            System.out.println(RandomStudent(names));
            System.out.print("Would you like to continue? : ");
            String input = scan.nextLine();
            if(input.equalsIgnoreCase("y"))
            {
                quit = false;
            }
            if(input.equalsIgnoreCase("n"))
            {
                quit = true;
                scan.close();
            }     
            
        }

    }

    public static String RandomStudent(String[] sList)
    {
    return sList[(int)(Math.random()*4)];
    }




}
