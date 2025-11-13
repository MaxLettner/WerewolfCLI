package at.htl;

import at.htl.Exceptions.AlreadyLastTimeException;
import at.htl.Exceptions.NotYourselfException;

public class WanderingTrader extends Player {
    private Player _stuffed;
    private Player _sleptWith;

    private Werewolf _werewolf;

    WanderingTrader(int playerCount, String name) {
        _stuffed = null;
        _sleptWith = null;

        super(playerCount, name);
    }

    public void initializeOtherPlayers(Werewolf werewolf) {
        _werewolf = werewolf;
    }

    public void stuff(Player player) {
        if (_stuffed == player) {
            throw new AlreadyLastTimeException("You can't stuff the same person two times in a row!");
        }
        if (player == this) {
            throw new NotYourselfException("You can't stuff yourself!");
        }
        _stuffed = player;
    }

    public void sleepWith(Player player) {
        //if (_sleptWith == _werewolf.getVictim()) {}
        if (_sleptWith == player) {
            throw new AlreadyLastTimeException("You can't sleep with the same person two times in a row!");
        }
        if (player == this) {
            throw new NotYourselfException("You can't sleep with yourself!");
        }
        _sleptWith = player;
    }
}
