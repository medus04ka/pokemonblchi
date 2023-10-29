package pokemons;

import moves.gastrodon.Bulldoze;
import moves.shellos.*;
import ru.ifmo.se.pokemon.*;

public class Gastrodon extends Pokemon {

    public Gastrodon(String name, int level) {
        super(name, level);

        super.setType(Type.WATER, Type.GROUND);
        setStats(111, 83, 68, 92, 82, 39);

        Harden harden = new Harden(0,0);
        BodySlam bodySlam = new BodySlam(85, 100);
        Blizzard blizzard = new Blizzard(110,70);
        Bulldoze bulldoze = new Bulldoze(60, 100);

        setMove(harden, bodySlam, blizzard, bulldoze);
    }
}
