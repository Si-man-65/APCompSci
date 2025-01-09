import java.util.Scanner;

public class CelebMain {

    public static void main(String[] args)
    {
        Celebrity celeb1 = new Celebrity("Micheal Jordan","Basketball");
        String gameanswer = celeb1.getAnswer();
        Scanner scan = new Scanner(System.in);
        String guess = scan.nextLine();
        System.out.println("Clue: " + celeb1.getClue());
        if(guess.equalsIgnoreCase(celeb1.getAnswer()))
        {
            System.out.println("Correct guess!" + gameanswer);
        }
        else
        {
            System.out.println("Incorrect guess :(" + guess);
        }
        System.out.println(gameanswer);
    }
    
}
