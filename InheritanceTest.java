
/**
 * Write a description of class InheritanceTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InheritanceTest {

    public static void main(String[] args){

        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 3, 1);
        PokemonMegaEvolution charizard = new PokemonMegaEvolution("Charizard", "Fire/Flying", 3, 1, true);

        Pokemon bulbasaur = new PokemonMegaEvolution("Bulbasaur", "Grass", 3, 1, false);



        System.out.println(pikachu);
        System.out.println(charizard);

        System.out.println(pikachu.gymBattle("Brock"));


    }

}

