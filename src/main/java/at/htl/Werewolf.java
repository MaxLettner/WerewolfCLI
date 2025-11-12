package at.htl;

public class Werewolf extends Player {
    Werewolf(int playerCount, String name) {
        super(playerCount, name);
    }

    public void attack(Player player) {
        if(_isInLoveWith == player) {
            //throw new FriendlyFireException();
        }
        if(!player._isAlive) {
            //throw new TargetDeadException();
        }

        player.setHealth(player.getHealth() - 1);
    }
}
