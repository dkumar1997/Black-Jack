import java.util.ArrayList;
public class Player{
    private String name;
    private int cash;
    private ArrayList<Card> cards;
    
    public Player(String name, int cash){
        this.name = name;
        this.cash = cash;
        cards = new ArrayList<Card>();
    }
    public void addcard(Card card){  
        cards.add(card);
    }

    public int getaddedvalue(){
        int total = 0;
        for(Card card: cards){
            if(card.getcard() > 10){
                total = total + 10;
            }
            else if( card.getcard() == 1 && (total + 11 < 21)){
                total = total + 11;
            }
            else{
                total = total + card.getcard();
            }
        }
        return total;
    }

    public int getcash(){
        return this.cash;

    }
    public void setcash(int setto){
        this.cash = setto;
    }
    public String getname(){
        return this.name;
    }
    public void printcards(){
        for(Card card: cards){
            System.out.println(card.getsuit() + " " + card.getcard());
        }
    }
    public void emptyhand(){
        cards.clear();
    }


}