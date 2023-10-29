package pokemons;

import moves.gloom.GigaDrain;
import moves.oddish.DoubleTeam;
import moves.oddish.EnergyBall;
import ru.ifmo.se.pokemon.*;

public class Gloom extends Pokemon {

    public Gloom(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        setStats(60, 65, 70, 85, 75, 40);

        EnergyBall energyBall = new EnergyBall(90,100);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        GigaDrain gigaDrain = new GigaDrain(75,100);

        setMove(energyBall, doubleTeam, gigaDrain);
    }
}
