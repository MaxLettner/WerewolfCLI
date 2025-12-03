package at.htl;

import java.util.ArrayList;
import java.util.List;

public class DayUtils {
    private static List<Player> _players = new ArrayList<>();

    private DayUtils() {}

    public static void initializePlayers(Mentor mentor, Werewolf werewolf, WanderingTrader wanderingTrader, Witch witch, SleeperChild sleeperChild) {
        _players.clear();
        _players.add(mentor);
        _players.add(werewolf);
        _players.add(wanderingTrader);
        _players.add(witch);
        _players.add(sleeperChild);
    }

    public static void kill() {
        for(Player player : _players){
            if(player.getHealth() <= 0) {
                player.setIsAlive(false);
            }
        }
    }

   // public String checkIfGameIsFinished() {

    //}
}
