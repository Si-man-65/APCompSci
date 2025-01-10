import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class CelebMain {

    public static void main(String[] args)
    {
    /*    
        // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("Input Form");
    frame.setSize(500, 500);
    // in FlowLayout, objects will be added in order
    frame.setLayout(new FlowLayout(FlowLayout.LEFT));

    // create Labels, TextFields, Buttons
    JLabel celebLabel = new JLabel("Enter Celebrity");
    JTextField celebField = new JTextField(10); // size = 10
    JLabel guessLabel = new JLabel("Enter your Guess");
    JTextField guessField = new JTextField(10);
    
    JButton enterButton = new JButton("Enter");
    JLabel outputLabel = new JLabel();

    // add components to JFrame in this order
    frame.add(celebLabel);
    frame.add(celebField);
    frame.add(guessLabel);
    frame.add(guessField);
    frame.add(enterButton);
    frame.add(outputLabel);
    
    // add event listener for button click
    enterButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) 
    {
      // Create an object of your class with the form inputs
      MyClass c = new MyClass(celebField.getText(),
   guessField.getText() );
      // print out in label using c.toString()
      outputLabel.setText("You entered "
                          + c);
      // Uncomment to write to the file output.txt
      /*
       try {
      FileWriter file = new FileWriter("output.txt", true); // true appends
      file.write(c  + "\n" );
      file.close();
     
    } catch (IOException ex) {
      System.out.println("An I/O error occurred.");
      ex.printStackTrace();
    }
       
      
    }
}); // end of actionlistener
    
    frame.setVisible(true);
    */

    //My Main code 
    boolean done = false;
    while(done == false)
    {
        System.out.println("What celebrity are you choosing? ");
        Scanner scan = new Scanner(System.in);
        String celebinput = scan.nextLine();
        System.out.println("Whats your clue? ");
        String clue = scan.nextLine();
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        Celebrity celeb1 = new Celebrity(celebinput,clue);
        String gameanswer = celeb1.getAnswer();
        System.out.println("Clue: " + celeb1.getClue());
        System.out.println("What is your guess? ");
        String guess = scan.nextLine();
        scan.close();
        if(guess.equalsIgnoreCase(celeb1.getAnswer()))
        {
            System.out.println("Correct guess! " + gameanswer);
            done = true;
        }
        else
        {
            System.out.println("Incorrect guess : " + guess);
            System.out.println("Answer : " + gameanswer);
            done = false;
        }
        
    }
}
    
}
