public class SnapPlayer extends Deck{

    SnapPlayer(){
        super();
    }
    SnapPlayer(SnapPlayer p1){
        this.setDeck(p1.splitDeck2());
    }
    public double shout(){
        return Math.random();
    }


}
