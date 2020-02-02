import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class BJack{
    public static void main(String[] args) {
        intro();
        ArrayList<Card> fulldeck = buildmeadeck(); 
        System.out.println(fulldeck.get(0).getcard());
        Player dealer = new Player("DEALER", 1000000000);
        Player bob = new Player("bob", 500);
        while(bob.getcash() > 0){
            if(fulldeck.isEmpty()){
                fulldeck = buildmeadeck();
            }
            dealer.addcard1(fulldeck.get(0));
            fulldeck.remove(0);
            bob.addcard1(fulldeck.get(0));
            fulldeck.remove(0);
            dealer.addcard2(fulldeck.get(0));
            fulldeck.remove(0);
            bob.addcard2(fulldeck.get(0));
            fulldeck.remove(0);
            System.out.println("Your cards are: " + bob.getcard1().getcard() + " " + bob.getcard1().getsuit() + bob.getcard2().getcard()+ " "  + bob.getcard2().getsuit());
            System.out.println("Dealers cards are: " + dealer.getcard1().getcard() + " " + dealer.getcard1().getsuit() + dealer.getcard2().getcard()+ " "  +  dealer.getcard2().getsuit());

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
