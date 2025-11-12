package at.htl;

public class SleeperChild extends Player {
    private boolean _isMutated;
    SleeperChild(int playerCount, String name) {
        _isMutated = false;
        super(playerCount, name);
    }
}
