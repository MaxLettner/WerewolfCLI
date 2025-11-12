package at.htl;

public class Player {
    protected int _health;
    protected Player _isInLoveWith;
    protected int _playerCount;

    Player(int playerCount) {
        _health = 2;
        _isInLoveWith = null;
        _playerCount = playerCount;
    }

    public int getHealth() {
        return _health;
    }
    public void setHealth(int _health) {
        this._health = _health;
    }
    public Player getIsInLoveWith() {
        return _isInLoveWith;
    }
    public void setIsInLoveWith(Player _isInLoveWith) {
        this._isInLoveWith = _isInLoveWith;
    }

}
