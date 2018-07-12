public class Snap {
    static SnapPlayer Player1 = new SnapPlayer();
    static SnapPlayer Player2 = new SnapPlayer(Player1);


    public static void main(String[] args){
        Deck pile = new Deck();
        pile.clear();

        while(true){
            Player1.play(pile);
            if(Player1.getSize()==0)break;
            compare(pile);
            Player2.play(pile);
            if(Player2.getSize()==0)break;
            compare(pile);
        }
        if(Player1.getSize()==0)
            System.out.println("Player 1 wins");
        else
            System.out.println("Player 2 wins");
    }

    public static void compare(Deck pile){
        if(pile.getDeck().size()>1)
            if(pile.compareRank()) {
                System.out.println("SNAP");
                if(Player1.shout()>Player2.shout()){
                    Player1.addCards(pile);
                }else{
                    Player2.addCards(pile);
                }
                System.out.println("Player 1: "+Player1.getSize()+"\tPlayer 2: "+Player2.getSize());
            }

    }
}
