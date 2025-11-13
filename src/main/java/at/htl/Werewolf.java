package at.htl;

import at.htl.Exceptions.FriendlyFireException;
import at.htl.Exceptions.TargetDeadException;

public class Werewolf extends Player {
    private Mentor _mentor;
    private WanderingTrader _wanderingTrader;
    private Player _victim;

    Werewolf(int playerCount, String name) {

        super(playerCount, name);
    }

    public void initializeOtherPlayers(Mentor mentor,  WanderingTrader wanderingTrader)  {
        _mentor = mentor;
        _wanderingTrader = wanderingTrader;
    }

    public void attack(Player player) {
        _victim = null;
        if(_isInLoveWith == player) {
            throw new FriendlyFireException("Das Opfer ist mit dir im Liebespaar!");
        }
        if(!player._isAlive) {
            throw new TargetDeadException("Das Opfer ist tot!");
        }
        if(player != _wanderingTrader && player != _mentor.getProt()) {
            player.setHealth(player.getHealth() - 1);
            _victim = player;
        }

    }

    public Player getVictim() {
        return _victim;
    }

    public void clearVictim() {
        _victim = null;
    }


}
