package at.htl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        int playerCount = 5;
        boolean gamefinished = false;
        int index = 0;


        WanderingTrader wanderingTrader = new WanderingTrader(playerCount, "Attila");
        Mentor mentor = new Mentor(playerCount, "Sylvio");
        Werewolf werewolf = new Werewolf(playerCount, "Herbert");
        Witch witch = new Witch(playerCount, "Sebastian");
        SleeperChild sleeperChild = new SleeperChild(playerCount, "Silas");

        werewolf.initializeOtherPlayers(mentor, wanderingTrader);
        wanderingTrader.initializeOtherPlayers(werewolf);
        sleeperChild.initializeOtherPlayers(werewolf);
        witch.initializeOtherPlayers(werewolf);

        List<Player> game = new ArrayList<Player>();

        game.add(mentor);
        game.add(werewolf);
        game.add(wanderingTrader);
        game.add(sleeperChild);
        game.add(witch);

        while(!gamefinished) {

        }



    }
}
