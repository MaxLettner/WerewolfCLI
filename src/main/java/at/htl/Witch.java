package at.htl;

import at.htl.Exceptions.FriendlyFireException;
import at.htl.Exceptions.OutOfAmmoException;
import at.htl.Exceptions.TargetDeadException;

public class Witch extends Player {
    private int _healthPotions;
    private int _damagePotions;
    private int _gonePotions;
    private int _onionPotions;

    private Werewolf _werewolf;
    private WanderingTrader _wanderingTrader;
    private Mentor _mentor;
    private SleeperChild _sleeperChild;

    Witch(int playerCount, String name) {
        _healthPotions = 2;
        _damagePotions = 1;
        _gonePotions = 1;
        _onionPotions = 0;

        super(playerCount,  name);
    }

    public void initializeOtherPlayers(Werewolf werewolf, WanderingTrader wanderingTrader, Mentor mentor, SleeperChild sleeperChild) {
        _werewolf = werewolf;
        _wanderingTrader = wanderingTrader;
        _mentor = mentor;
        _sleeperChild = sleeperChild;
    }

    public String getPotions() {
        String s = "";
        if(_healthPotions > 1) {s += String.format("Du hast %s Heiltränke!\n", _healthPotions);}
        if(_healthPotions == 1) {s += String.format("Du hast %s Heiltrank!\n", _healthPotions);}
        if(_damagePotions == 1) {s += String.format("Du hast %s Schadenstrank!\n", _damagePotions);}
        if(_gonePotions == 1) {s += String.format("Du hast %s Verschwindetrank!\n", _gonePotions);}

        if(s.equals("")) {
            return "Du hast keine Tränke mehr!";
        }else{
            return s;
        }
    }

    public void damage(Player player) {
        if(_damagePotions < 1) {
            throw new OutOfAmmoException("You have no more damage potions!");
        }
        if(_isInLoveWith == player) {
            throw new FriendlyFireException("Das Opfer ist mit dir im Liebespaar!");
        }
        if(!player._isAlive) {
            throw new TargetDeadException("Das Opfer ist tot!");
        }
        if(player != _wanderingTrader && player != _mentor.getProt()) {
            player.setHealth(player.getHealth() - 1);
        }
        _damagePotions--;
    }

    public void heal(Player player) {
        if(_healthPotions < 1) {
            throw new OutOfAmmoException("You have no more heal potions!");
        }
        if(!player._isAlive) {
            throw new TargetDeadException("Das Opfer ist tot!");
        }
        if(player == _sleeperChild && _sleeperChild.getMayMutate() == true){
            _sleeperChild.setMayMutate(false);
        }
        player.setHealth(player.getHealth() + 1);
        _healthPotions--;
    }
}
