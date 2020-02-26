
public class Card{
    private String suit;
    private int number;
    private Card card;
    public Card(int number, String suit){
        this.number = number;
        this.suit = suit;
    }
    public Card(Card newCard){
        this.card = newCard;
    }
    
    public int getcard(){
        return number;
    }
    public String getsuit(){
        return suit;
    }
    

}
