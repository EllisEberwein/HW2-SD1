import java.util.Scanner; // Import scanner for later

public class HW2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // First let's create a scanner, so we can put inputs
    System.out.println("What year did the Civil War End?"); // print the question, with the answer choices
    System.out.println("A: 1865"); 
    System.out.println("B: 1888"); 
    System.out.println("C: 1891"); 
    Integer score = 0; // Set the score to 0, so if they are right the variable will get updated each time with a +1
    String Q1 = sc.nextLine(); // Create user input for question 1 with the scanner
    if (Q1.equals( "A")){  // Checking if user input is equal to the correct answer, A
    // I tried == "A", but it didn't work, so I looked up on the internet a better way and I found .equals
    // Source: https://stackoverflow.com/questions/39228386/user-input-if-statements-in-java-not-working
    System.out.println("You are correct"); // Feedback on user if they are right
    score = (score + 1); // Updating the score
    } else {
    System.out.println("Incorrect, the answer was A"); // Printing that the user is wrong, and what the right answer was.
    // No score update since they were incorrect
    }
    // Next question, commenting is redundant for the next 20 or so lines, since the code is practically identical
    // Aside from the content in the questions and the correct answer letter
    System.out.println("Who wrote the book, House of Leaves?"); 
    System.out.println("A: Cormac McCarthy"); 
    System.out.println("B: Mark Z. Danielewski"); 
    System.out.println("C: Edgar Allan Poe"); 
    
    String Q2 = sc.nextLine();
    if (Q2.equals("B")){
    System.out.println("You are correct");
    score = (score + 1);
    } else {
    System.out.println("Incorrect, the answer was B!");
    }
    System.out.println("In Norse mythology which wolf chases the sun?"); 
    System.out.println("A: Fenrir"); 
    System.out.println("B: Hati"); 
    System.out.println("C: Sköll"); 
    
    String Q3 = sc.nextLine();
    if (Q3.equals( "C")){
    System.out.println("You are correct");
    score = (score + 1);
    } else {
    System.out.println("Incorrect, the answer was C!");
    }
    // Finally as we are at the end of our questions,
    // we can print the score
    System.out.println("Your score is " + score + "!" ); 
    }
}
// I learned how to use if else statements to update variables and perform checks on strings. It's cool since this is the first time, we were tasked to make a small game.  
