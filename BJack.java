import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class BJack{
    public static void main(String[] args) {
        intro();
        ArrayList<Card> fulldeck = buildmeadeck(); 
        
        Player dealer = new Player("DEALER", 1000000000);
        Player bob = new Player("bob", 50);
        while(bob.getcash() > 0){

            for(int i = 0; i < 2; i++){
                dealer.addcard(fulldeck.get(0));
                
                fulldeck.remove(0);
                bob.addcard(fulldeck.get(0));
                fulldeck.remove(0);
            }
            System.out.println("dealer cards: "); 
            dealer.printcards();
            System.out.println("bobs cards: ");
            bob.printcards();
            System.out.println(bob.getaddedvalue());


            if(dealer.getaddedvalue() > bob.getaddedvalue()){
                bob.setcash(bob.getcash() - 50 );
                dealer.setcash(dealer.getcash()+50);
                System.out.println("You lose");
            }
            else{
                bob.setcash(bob.getcash() + 50 );
                dealer.setcash(dealer.getcash() -50);
                System.out.println("You win");
                
            }
            dealer.emptyhand();
            bob.emptyhand();
            
            
            




        }

                
    }
    public static void intro(){
        System.out.println("Welcome to Black Jack");
        System.out.println("The game is just about to begin: ");
        System.out.println("Here are your two cards: ");
        
    }
    public static ArrayList<Card> buildmeadeck(){ 
        Deck newDeck = new Deck();
        ArrayList<Card> theDeck = newDeck.builddeck();
        Collections.shuffle(theDeck);
        return theDeck;
    }
   
}
