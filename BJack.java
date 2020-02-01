import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class BJack{
    public static void main(String[] args) {
        intro();
        Deck newDeck = new Deck();
        ArrayList<Card> theDeck = newDeck.builddeck();
        Collections.shuffle(theDeck);
        for(Card x: theDeck){
            System.out.println(" The Card is: " + x.getcard() + "   " + "The suit is: " + x.getsuit());
        }
        System.out.println(theDeck.size());
        System.out.println("lmao");
                
    }
    public static void intro(){
        System.out.println("Welcome to Black Jack");
        System.out.println("The game is just about to begin: ");
        System.out.println("Here are your two cards: ");
        
    }
}
