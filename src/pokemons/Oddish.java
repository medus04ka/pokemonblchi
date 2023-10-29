package pokemons;


import moves.oddish.DoubleTeam;
import moves.oddish.EnergyBall;
import ru.ifmo.se.pokemon.*;

public class Oddish extends Pokemon {

    public Oddish(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        setStats(45, 50, 55, 75, 65, 30);

        EnergyBall energyBall = new EnergyBall(90,100);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);

        setMove(energyBall, doubleTeam);
    }
}
