public class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator)
    {
        this. numerator = numerator;
        this. denominator = denominator;
    }
    public String toString()
    {
        return numerator+"/"+denominator;
    }
    public int getNum()
    {
        return numerator;
    }
    public int getDen()
    {
        return denominator;
    }
    public static Fraction multiply(Fraction FirstFrac, Fraction SecondFrac)
    {
        return new Fraction(FirstFrac.getNum() * SecondFrac.getNum(),FirstFrac.getDen() * SecondFrac.getDen());
    }
    public Fraction multiply(Fraction otherFrac)
    {
        return multiply(this, otherFrac);
    }
}

class TesterClass
{
    public static void main(String[] args)
    {
    Fraction one = new Fraction(2,3);
    Fraction two = new Fraction(3,4);
    System.out.println(one.toString());
    System.out.println(one.getNum());
    System.out.println(Fraction.multiply(one,two));
    System.out.println(one.multiply(two));
    }
}