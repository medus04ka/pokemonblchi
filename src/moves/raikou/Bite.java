package moves.raikou;

import ru.ifmo.se.pokemon.*;
import utils.Program;

public class Bite extends PhysicalMove {

    public Bite(double power, double acc) {
        super(Type.DARK, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);

        if(Program.chance(0.3)) {
            Effect.flinch(def);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }

}