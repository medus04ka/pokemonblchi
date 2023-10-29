package pokemons;

import moves.raikou. *;
import ru.ifmo.se.pokemon.*;

public class Raikou extends Pokemon {

    public Raikou(String name, int level) {
        super(name, level);

        super.setType(Type.ELECTRIC);
            setStats(90, 85, 75, 115, 100, 115);

        Discharge discharge = new Discharge(80, 100);
        ThunderShock thunderShock = new ThunderShock(40, 100);
        Bite bite = new Bite(60,100);
        Leer leer = new Leer(0,100);

        setMove(discharge, thunderShock, bite, leer);

    }

}
