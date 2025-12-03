package at.htl;

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
        if(!player._isAlive) {                                                          //Attacking other players
            throw new TargetDeadException("Das Opfer ist tot!");
        }
        if(player == _wanderingTrader){return;}
        if(player == _mentor.getProt()){return;}
        if(player == _sleeperChild) {                                                   //SleeperChild doesnt get damaged but it may mutate into a werewolf if not healed by the witch
            _sleeperChild.setMayMutate(true);
            return;
        }
        player.setHealth(player.getHealth() - 1);
        _victim = player;
    }

    public Player getVictim() {
        return _victim;
    }


}
