package at.htl;

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

        werewolf.initializeOtherPlayers(mentor, wanderingTrader, sleeperChild);
        wanderingTrader.initializeOtherPlayers(werewolf);
        sleeperChild.initializeOtherPlayers(werewolf);
        witch.initializeOtherPlayers(werewolf, wanderingTrader, mentor, sleeperChild);


        IO.println(mentor.toString());
        IO.println(werewolf.toString());
        IO.println(sleeperChild.toString());
        IO.println(wanderingTrader.toString());
        IO.println(witch.toString());
        IO.println();

        werewolf.attack(sleeperChild);

        IO.println(sleeperChild.toString());
        sleeperChild.updateMutation();
        IO.println(sleeperChild.toString());
        IO.println(sleeperChild.getMayMutate());
        witch.heal(sleeperChild);
        IO.println(sleeperChild.toString());
        IO.println(sleeperChild.getMayMutate());


    }
}
