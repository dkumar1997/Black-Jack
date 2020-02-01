import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    private ArrayList<Card> fulldeck;
    
    public ArrayList<Card> builddeck(){
        fulldeck = new ArrayList<Card>();
        ArrayList<String> allsuits = new ArrayList<String>();
        allsuits.add("Diamond");
        allsuits.add("Hearts");
        allsuits.add("Spades");
        allsuits.add("Clovers");
        for(String suit: allsuits){
            for(int i = 1; i <14; i++){
                Card newcard = new Card(i, suit);
                fulldeck.add(newcard);

            }
        }
        return fulldeck;
    }

    


    
}