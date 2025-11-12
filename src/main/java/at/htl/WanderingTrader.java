package at.htl;

public class WanderingTrader extends Player {
    private Player _oldStuffed;

    WanderingTrader(int playerCount, String name) {
        _oldStuffed = null;

        super(playerCount, name);
    }
}
