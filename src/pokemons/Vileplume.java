package pokemons;

import moves.gloom.GigaDrain;
import moves.oddish.DoubleTeam;
import moves.oddish.EnergyBall;
import moves.vileplume.PoisonPowder;
import ru.ifmo.se.pokemon.*;

public class Vileplume extends Pokemon {

    public Vileplume(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        setStats(75, 80, 85, 110, 90, 50);

        EnergyBall energyBall = new EnergyBall(90,100);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        GigaDrain gigaDrain = new GigaDrain(75,100);
        PoisonPowder poisonPowder = new PoisonPowder(0, 75);

        setMove(energyBall, doubleTeam, gigaDrain, poisonPowder);
    }
}
