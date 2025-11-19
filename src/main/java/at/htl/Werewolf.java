package at.htl;

import at.htl.Exceptions.FriendlyFireException;
import at.htl.Exceptions.TargetDeadException;

public class Werewolf extends Player {
    private Mentor _mentor;
    private WanderingTrader _wanderingTrader;
    private SleeperChild _sleeperChild;
    private Player _victim;

    Werewolf(int playerCount, String name) {

        super(playerCount, name);
    }

    public void initializeOtherPlayers(Mentor mentor,  WanderingTrader wanderingTrader, SleeperChild sleeperChild)  {
        _mentor = mentor;
        _wanderingTrader = wanderingTrader;
        _sleeperChild = sleeperChild;
    }

    public void attack(Player player) {
        _victim = null;
        if(_isInLoveWith == player) {
            throw new FriendlyFireException("Das Opfer ist mit dir im Liebespaar!");
        }
        if(!player._isAlive) {                                                          //Attacking other players
            throw new TargetDeadException("Das Opfer ist tot!");
        }
        if(player != _wanderingTrader && player != _mentor.getProt()) {
            player.setHealth(player.getHealth() - 1);
            _victim = player;                                                           //_victim is just the player that got attacked, it is possible for witch and
                                                                                        //SleeperChild to change this value
        }                                                                               //WanderingTrader uses it too for looking whether he got damaged

    }

    public Player getVictim() {
        return _victim;
    }

    public void clearVictim() {
        _victim = null;
    }


}
