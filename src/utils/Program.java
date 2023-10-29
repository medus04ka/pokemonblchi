package utils;

import pokemons. *;
import ru.ifmo.se.pokemon.*;

public class Program {

            // https://pokemondb.net/pokedex/raikou
            // https://pokemondb.net/pokedex/oddish
            // https://pokemondb.net/pokedex/shellos
            // https://pokemondb.net/pokedex/gloom
            // https://pokemondb.net/pokedex/vileplume
            // https://pokemondb.net/pokedex/gastrodon

    public static void main(String[] args) {
        start();
    }

    public static boolean chance(double d) {
        return d > Math.random();
    }

    private static void start() {
        Battle b = new Battle();


        // Pokemon p2 = new Pokemon("[l[sak]", 1);
        Raikou p1 = new Raikou("Rai", 1);
        Shellos p2 = new Shellos("Shell", 1);
        Gastrodon p3 = new Gastrodon("Tomato", 1);
        Oddish p4 = new Oddish("Beetroot", 1);
        Gloom p5 = new Gloom("Pineapple", 1);
        Vileplume p6 = new Vileplume("Carrot", 1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();

    }

}
