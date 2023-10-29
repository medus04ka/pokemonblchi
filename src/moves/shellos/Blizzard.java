package moves.shellos;

import ru.ifmo.se.pokemon.*;
import utils.Program;

public class Blizzard extends SpecialMove {

    public Blizzard(double power, double acc) {
        super(Type.ICE, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Program.chance(0.1)) {
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe() {
        // делим на отдельные части + выбираем последнее и подпись
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length - 1];
    }
}