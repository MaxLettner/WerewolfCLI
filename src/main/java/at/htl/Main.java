package at.htl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        int playerCount = 5;
        boolean gamefinished = false;
        int index = 0;

        Player Sepp1 = new Witch(playerCount, "Sebastian");
        Player Sepp2 = new Werewolf(playerCount, "Herbert");
        Player Sepp3 = new Mentor(playerCount, "Sylvio");
        Player Sepp4 = new SleeperChild(playerCount, "Silas");
        Player Sepp5 = new WanderingTrader(playerCount, "Attila");

        List<Player> game = new ArrayList<Player>();

        game.add(Sepp3);
        game.add(Sepp2);
        game.add(Sepp4);
        game.add(Sepp5);
        game.add(Sepp1);

        while(!gamefinished) {

        }



    }
}
