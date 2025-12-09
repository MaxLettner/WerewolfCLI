package at.htl;

import java.util.ArrayList;
import java.util.List;

public class DayUtils {
    private static final List<Player> _players = new ArrayList<>();
    private static Mentor _mentor;
    private static Werewolf _werewolf;
    private static WanderingTrader _wanderingTrader;
    private static Witch _witch;
    private static SleeperChild _sleeperChild;


    private DayUtils() {}

    public static void initializePlayers(Mentor mentor, Werewolf werewolf, WanderingTrader wanderingTrader, Witch witch, SleeperChild sleeperChild) {
        _players.clear();
        _players.add(mentor);
        _players.add(werewolf);
        _players.add(wanderingTrader);
        _players.add(witch);
        _players.add(sleeperChild);
        _mentor = mentor;
        _werewolf = werewolf;
        _wanderingTrader = wanderingTrader;
        _witch = witch;
        _sleeperChild = sleeperChild;

    }

    public static void kill() {
        for (Player player : _players) {
            if (player.getHealth() <= 0) {
                player.setIsAlive(false);
                if(player.getIsInLoveWith() != null) {
                    player.getIsInLoveWith().setIsAlive(false);
                    _mentor.setLoveIsAlive(false);
                }
            }
        }
    }

    public String checkIfGameIsFinished() {
        int good = 0;
        int bad = 0;

        if (_werewolf.getIsAlive()) {
            bad++;
        }
        if (_sleeperChild.getIsAlive()) {
            if (_sleeperChild.getIsMutated()) {
                bad++;
            } else {
                good++;
            }
        }
        if (_mentor.getIsAlive()) {
            good++;
        }
        if (_wanderingTrader.getIsAlive()) {
            good++;
        }
        if (_witch.getIsAlive()) {
            good++;
        }
        if (bad == 0) {
            return "Das Spiel ist vorbei! Die Dorfbewohner haben gewonnen!";
        }
        if (bad >= good) {
            if(_mentor.getLoveIsAlive()) {
                if(bad+good == 2){
                    return "Das Spiel ist vorbei! Das Liebespaar hat gewonnen!";
                }
                if(bad == 2) {
                    if(_werewolf.getIsInLoveWith() == null && _sleeperChild.getIsInLoveWith() == null || _werewolf.getIsInLoveWith() == _sleeperChild) {
                        return "Das Spiel ist vorbei! Die Werwölfe haben gewonnen!";
                    }
                }else {
                    Player evil;
                    if(_werewolf.getIsAlive()) {
                        evil = _werewolf;
                    }else {
                        evil = _sleeperChild;
                    }
                    if(evil.getIsInLoveWith() == null) {
                        return "Das Spiel ist vorbei! Die Werwölfe haben gewonnen!";
                    }
                }
            }else {
                return "Das Spiel ist vorbei! Die Werwölfe haben gewonnen!";
            }

        }
        return "";
    }
}
