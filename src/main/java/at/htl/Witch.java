package at.htl;

public class Witch extends Player {
    private int _healthPotions;
    private int _damagePotions;
    private int _gonePotions;
    private int _onionPotions;

    private Werewolf _werewolf;

    Witch(int playerCount, String name) {
        _healthPotions = 2;
        _damagePotions = 1;
        _gonePotions = 1;
        _onionPotions = 0;

        super(playerCount,  name);
    }

    public void initializeOtherPlayers(Werewolf werewolf) {
        _werewolf = werewolf;
    }

    public String getPotions() {
        String s = "";
        if(_healthPotions > 1) {s += String.format("Du hast %s Heiltränke!\n", _healthPotions);}
        if(_healthPotions == 1) {s += String.format("Du hast %s Heiltrank!\n", _healthPotions);}
        if(_damagePotions == 1) {s += String.format("Du hast %s Schadenstrank!\n", _damagePotions);}
        if(_gonePotions == 1) {s += String.format("Du hast %s Verschwindetrank!\n", _gonePotions);}

        if(s.equals("")) {
            return "Du hast keine Tränke mehr!";
        }else{
            return s;
        }
    }
}
