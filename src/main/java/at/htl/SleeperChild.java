package at.htl;

public class SleeperChild extends Player {
    private boolean _isMutated;                                         //_isMutated states whether the Kid has fully mutated and is a Werewolf
    private boolean _mayMutate;                                         //_mayMutate states whether the Kid has been attacked this round but this value can be changed
    private Werewolf _werewolf;                                         //by the Witch
    SleeperChild(int playerCount, String name) {
        _isMutated = false;
        _mayMutate = false;

        super(playerCount, name);
    }

    public void initializeOtherPlayers(Werewolf werewolf) {
        _werewolf = werewolf;
    }

    public boolean checkIfWerewolf(Player player) {
        return _werewolf == player;
    }

    public boolean checkMutation() {
        if(_mayMutate){_isMutated = true;}
        return _isMutated;
    }
    public boolean getMayMutate() {
        return _mayMutate;
    }

    public void setMayMutate(boolean mayMutate) {
        _mayMutate = mayMutate;
    }

    public boolean getIsMutated() {
        return _isMutated;
    }
}
