import java.util.ArrayList;
public class Player{
    private String name;
    private String cash;
    private ArrayList<Card> cards;
    
    public void addcard1(Card card1){  
        cards.add(card1);
    }
    public void addcard2(Card card2){
        cards.add(card2);
    }
    public int getaddedvalue(){
        int card1 = cards.get(0).getcard();
        if(card1 > 10){
            card1 = 10;
        }
        
        int card2 = cards.get(1).getcard();
        if(card2 > 10){
            card2 = 10;
        }
        int total = card1 + card2;
        if(card1 == 1 && total + 11 < 21){
            card1 = 11;
        }
        else{
            card1 = 1;
        }
        if(card2 == 1 && total + 11 < 21){
            card2 = 11;
        }
        else{
            card2 = 1;
        }
        total = card1 + card2;
        
        return total;
    }

}