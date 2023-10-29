package moves.oddish;

import ru.ifmo.se.pokemon.*;
import utils.Program;

public class EnergyBall extends SpecialMove {

    public EnergyBall(double power, double acc) {
        super(Type.GRASS, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {

        if (Program.chance(0.1)) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        // делим на отдельные части + выбираем последнее и подпись
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}
