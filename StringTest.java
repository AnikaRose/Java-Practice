import java.util.Scanner;

public class StringTest {
  
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);

    System.out.println ("Enter String:" );
    String phrase = scan.nextLine();
    String mutation1, mutation2, mutation3, mutation4;
    
    System.out.println ("Original string: \"" + phrase + "\"");
    System.out.println ("Length of string: " + phrase.length());
    
    mutation1 = phrase.concat (", except for Rimi.");
    mutation2 = mutation1.toUpperCase();
    mutation3 = mutation2.replace ('E', 'X');
    mutation4 = mutation3.substring (3, 12);
    
    // Print each mutated string
    System.out.println ("Mutation #1: " + mutation1);
    System.out.println ("Mutation #2: " + mutation2);
    System.out.println ("Mutation #3: " + mutation3);
    System.out.println ("Mutation #4: " + mutation4);
    
    System.out.println ("Mutated length: " + mutation4.length());
    
    System.out.println ("Phrase: " + phrase );
    
    
  }
  
  
  
}