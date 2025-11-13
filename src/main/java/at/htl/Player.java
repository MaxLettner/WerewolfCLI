package at.htl;

    public class Player {
    public final String _name;
    protected int _health;
    protected Player _isInLoveWith;
    protected int _playerCount;
    protected boolean _isAlive;

    Player(int playerCount,  String name) {
        _health = 2;
        _isInLoveWith = null;
        _playerCount = playerCount;
        _isAlive = true;
        _name = name;

    }

    public int getHealth() {
        return _health;
    }
    public void setHealth(int health) {
        _health = health;
    }
    public Player getIsInLoveWith() {
        return _isInLoveWith;
    }
    public void setIsInLoveWith(Player isInLoveWith) {
        _isInLoveWith = isInLoveWith;
    }
    public boolean getIsAlive() {
        return _isAlive;
    }
    public void setIsAlive(boolean isAlive) {
        _isAlive = isAlive;
    }

    @Override
    public String toString() {
        String s = String.format("Name: %s Health: %s IsAlive: %s", _name,  _health, _isAlive);
        if(_isInLoveWith != null){
            s += String.format(" IsInLoveWith: %s ", _isInLoveWith);
        }
        return s;
    }

}
