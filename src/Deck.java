import java.util.ArrayList;
import java.util.Collections;


public class Deck {
     private ArrayList<Card> deck = new ArrayList();

    Deck(){
        String[] suits = {"Sades","Hearts","Clubs","Diamonds"};
        for (int j = 0; j <suits.length ; j++) {
            for (int i = 0; i <13 ; i++) {
                deck.add(new Card(i+1,suits[j]));
            }
        }

        this.shuffle();
    }
    public void setDeck(ArrayList al){
        deck = al;
    }
    public ArrayList getDeck(){
        return this.deck;
    }
    public int getSize(){
        return getDeck().size();
    }
    public Card peek(){
        return deck.get(0);
    }
    public void shuffle() {
        Collections.shuffle(deck);
    }
    public void clear(){
        deck.clear();
    }
    public void add(Card newCard){
        deck.add(newCard);
    }
    public void addCards(Deck pile){
        this.deck.addAll(pile.deck);
        pile.clear();
    }
    public boolean compareRank(){
        if(deck.get(deck.size()-1).getRank()==deck.get(deck.size()-2).getRank())
            return true;
        else
            return false;
    }
    public void play(Deck playArea){
        Card i = this.deck.remove(0);
        playArea.add(i);
        //i.getCard();
    }
    public void list(){
        int num = 1;
        for(Card i:deck){
            System.out.print((num++)+" - ");
            i.getCard();
        }
    }
    public ArrayList splitDeck2(){
        System.out.println(deck.size());
        Deck deck2 = new Deck();
        deck2.clear();
        int limit = deck.size()/2;
        for(int i=0;i<limit;i++){
            deck2.add(deck.remove(i));
        }
        return deck2.deck;
    }
}
