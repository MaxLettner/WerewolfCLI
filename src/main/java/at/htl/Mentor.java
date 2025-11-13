package at.htl;

import at.htl.Exceptions.AlreadyLastTimeException;
import at.htl.Exceptions.SamePlayerException;

public class Mentor extends Player{
    private Player _prot;

    Mentor(int playerCount, String name) {

        _prot = null;
        super(playerCount, name);
    }

    public void initializeOtherPlayers() {
        return;
    }

    public void _putInLove(Player player1, Player player2) {
        if(player1 == player2){
            throw new SamePlayerException("Player1 == Player2!");
        }
        player1.setIsInLoveWith(player2);
        player2.setIsInLoveWith(player1);
    }

    public Player getProt() {
        return _prot;
    }

    public void protect(Player player) {
        if(_prot == player){
            throw new AlreadyLastTimeException("You can't protect the same player two times in a row!");
        }
        _prot = player;
    }


}
