public class Card {
    private int rank;
    private String suit;

    Card(int newRank, String newSuit){
        this.setSuit(newSuit);
        this.setRank(newRank);
    }
    private void setRank(int newRank){
        this.rank = newRank;
    }
    private void setSuit(String newSuit){
        this.suit = newSuit;
    }
    public int getRank() {
        return rank;
    }
    public String getSuit() {
        return suit;
    }
    public void getCard(){
        if(this.getRank()==1){
            System.out.println("Ace of "+this.getSuit());
        }else if(this.getRank()==11){
            System.out.println("Jack of "+this.getSuit());
        }else if(this.getRank()==12){
            System.out.println("Queen of "+this.getSuit());
        }else if(this.getRank()==13){
            System.out.println("King of "+this.getSuit());
        }else{
            System.out.println(this.getRank()+" of "+this.getSuit());
        }
    }
}
