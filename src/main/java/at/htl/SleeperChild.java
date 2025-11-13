package at.htl;

public class SleeperChild extends Player {
    private boolean _isMutated;
    private boolean _mayMutate;
    private Werewolf _werewolf;

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
