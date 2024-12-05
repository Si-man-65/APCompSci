public class Person
{
    //Define instance variables
    private String name;
    private String email;
    private String phone;
    private String age;
    //Constructor
    public Person(String nameIn, String emailIn, String phoneIn, String ageIn )
    {
        name = nameIn;
        email = emailIn;
        phone = phoneIn;
        age = ageIn;

    }
    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phone);
        System.out.println("Age: " + age);
    }





    
}