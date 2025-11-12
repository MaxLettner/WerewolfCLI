package at.htl;

public class Witch extends Player {
    private int _healthPotions;
    private int _damagePotions;
    private int _gonePotions;
    private int _onionPotions;

    Witch(int playerCount) {
        _healthPotions = 2;
        _damagePotions = 1;
        _gonePotions = 1;
        _onionPotions = 0;

        super(playerCount);
    }
}
