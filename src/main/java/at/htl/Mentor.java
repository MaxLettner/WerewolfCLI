package at.htl;

public class Mentor extends Player{
    private Player _oldProt;

    Mentor(int playerCount) {
        _oldProt = null;
        super(playerCount);
    }
}
