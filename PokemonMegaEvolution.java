
/**
 * Write a description of class PokemonMegaEvolution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PokemonMegaEvolution extends Pokemon {

    private boolean megaEvol;
    private String gym;

    public PokemonMegaEvolution(String name, String type, int numEvol, int gen, boolean megaEvol) {
        super(name, type, numEvol, gen);
        this.megaEvol = megaEvol;

    }

    public boolean getmegaEvol(){
        return megaEvol;

    }
    public String gymBattle(String gym){
        this.gym = gym;

        return "You will be facing against " + gym + " with " + getName();

    }



    public String MegaEvolution(){
        return getName() + " will be Mega evolved";
    }


    public String toString(){
        String name;
        return "The Pokemon name is " + getName() + " and the ability for this pokemon to mega evolve is " + getmegaEvol();
    }

}

