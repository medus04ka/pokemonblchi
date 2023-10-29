package pokemons;

import moves.shellos.*;
import ru.ifmo.se.pokemon.*;

public class Shellos extends Pokemon {

    public Shellos(String name, int level) {
        super(name, level);

        super.setType(Type.WATER);
        setStats(76, 48, 48, 57, 62, 34);

        Harden harden = new Harden(0,0);
        BodySlam bodySlam = new BodySlam(85, 100);
        Blizzard blizzard = new Blizzard(110,70);

        setMove(harden, bodySlam, blizzard);
    }

}
