package moves.raikou;

import ru.ifmo.se.pokemon.*;
import utils.Program;

public class Discharge extends SpecialMove {

    public Discharge(double pow, double acc) {

        super(Type.ELECTRIC, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Program.chance(0.3)) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        // делим на отдельные части + выбираем последнее и подпись
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }

}
