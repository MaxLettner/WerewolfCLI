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

        DayUtils.initializePlayers(mentor, werewolf, wanderingTrader, witch, sleeperChild);

        IO.println(mentor.toString());
        IO.println(werewolf.toString());
        IO.println(wanderingTrader.toString());
        IO.println(witch.toString());
        IO.println(sleeperChild.toString());
        IO.println();

        mentor.putInLove(witch, sleeperChild);

        werewolf.attack(sleeperChild);
        sleeperChild.checkMutation();

        mentor.setHealth(0);
        werewolf.setHealth(0);
        wanderingTrader.setHealth(0);
        DayUtils.kill();

        IO.println();
        IO.println(mentor.toString());
        IO.println(werewolf.toString());
        IO.println(wanderingTrader.toString());
        IO.println(witch.toString());
        IO.println(sleeperChild.toString());



        IO.println(DayUtils.checkIfGameIsFinished());


    }
}
