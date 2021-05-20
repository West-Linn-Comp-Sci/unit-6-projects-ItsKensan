
/**
 * Write a description of class PokemonGO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class PokemonGO extends Pokemon{

    private int playerLevel;
    private String player2;

    public PokemonGO(String name, String type, int numEvol, int gen,int playerLevel ) {
        super(name, type, numEvol, gen);
        this.playerLevel = playerLevel;
    }



    public String gymBattle(String player2){
        this.player2 = player2;

        return "You will be facing against " + player2 + " with " + getName();

    }

}

