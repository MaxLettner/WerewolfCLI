package at.htl;

public class Witch extends Player {
    private int _healthPotions;
    private int _damagePotions;
    private int _gonePotions;
    private int _onionPotions;

    Witch(int healthPotions, int damagePotions, int gonePotions, int onionPotions, int playerCount) {
        this._healthPotions = healthPotions;
        this._damagePotions = damagePotions;
        this._gonePotions = gonePotions;
        this._onionPotions = onionPotions;

        super(playerCount);
    }
}
