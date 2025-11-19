package at.htl;

public class SleeperChild extends Player {
    private boolean _isMutated;                                         //_isMutated states whether the Kid has fully mutated and is a Werewolf
    private boolean _mayMutate;                                         //_mayMutate states whether the Kid has been attacked this round but this value can be changed
    private Werewolf _werewolf;                                         //by the Witch, if the _mayMutate flag is still true when the day comes then in the DayUtils.java
                                                                        //_isMutated will be set to true
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

    public void updateMutation() {
        if(_werewolf.getVictim() == this) {
            _health++;
            _werewolf.clearVictim();
            _mayMutate = true;
        }
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
    public void setIsMutated(boolean isMutated) {
        _isMutated = isMutated;
    }
}
