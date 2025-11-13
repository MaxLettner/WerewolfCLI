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

    public void updateMutate() {
        if(_werewolf.getVictim() == this) {
            _health++;
            _werewolf.clearVictim();
            _mayMutate = true;
        }
    }
}
