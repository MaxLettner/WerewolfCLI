package at.htl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        //int playerCount = 5;

        Player Sepp1 = new Witch(5);
        Player Sepp2 = new Werewolf(5);
        Player Sepp3 = new Mentor(5);
        Player Sepp4 = new SleeperChild(5);
        Player Sepp5 = new WanderingTrader(5);

        List<Player> game = new ArrayList<Player>();

        game.add(Sepp1);
        game.add(Sepp2);
        game.add(Sepp3);
        game.add(Sepp4);
        game.add(Sepp5);



    }
}
