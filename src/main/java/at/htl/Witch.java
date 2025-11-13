package at.htl;

public class Witch extends Player {
    private int _healthPotions;
    private int _damagePotions;
    private int _gonePotions;
    private int _onionPotions;

    private Werewolf _werewolf;

    Witch(int playerCount, String name) {
        _healthPotions = 2;
        _damagePotions = 1;
        _gonePotions = 1;
        _onionPotions = 0;

        super(playerCount,  name);
    }

    public void initializeOtherPlayers(Werewolf werewolf) {
        _werewolf = werewolf;
    }
}
