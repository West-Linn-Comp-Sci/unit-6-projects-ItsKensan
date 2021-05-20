
/**
 * Write a description of class Pokemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Pokemon {

    private String name;
    private String type;
    private int numEvol;
    private int gen;
    private String gym;



    public Pokemon(String name, String type, int numEvol, int gen){
        this.name = name;
        this.type = type;
        this.numEvol = numEvol;
        this.gen = gen;

    }


    public String gymBattle(String gym){
        this.gym = gym;

        return "You will be facing against " + gym + " with " + getName();

    }

    public String pokemonCenter(String name){

        return "We restored your " + name + " to full health";
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getNumEvol(){
        return numEvol;
    }
    public int getGen(){
        return gen;
    }




    public String toString(){

        return "The Pokemon name is " + name;

    }



}


