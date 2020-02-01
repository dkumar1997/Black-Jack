
public class Card{
    private String suit;
    private int number;
    public Card(int number, String suit){
        this.number = number;
        this.suit = suit;
    }
    
    public int getcard(){
        return number;
    }
    public String getsuit(){
        return suit;
    }
    

}