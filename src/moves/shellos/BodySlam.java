package moves.shellos;

import ru.ifmo.se.pokemon.*;
import utils.Program;

public class BodySlam extends PhysicalMove {

    public BodySlam(double power, double acc) {
        super(Type.NORMAL, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p, damage);

        if(Program.chance(0.3)) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        // делим на отдельные части + выбираем последнее и подпись
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length - 1];
    }

}
