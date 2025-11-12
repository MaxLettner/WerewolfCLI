package at.htl;

public class Mentor extends Player{
    private Player _prot;

    Mentor(int playerCount, String name) {

        _prot = null;
        super(playerCount, name);
    }
}
