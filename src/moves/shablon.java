package moves;

import ru.ifmo.se.pokemon.*;
import utils.Program;

public class shablon extends SpecialMove {
    public shablon(double power, double acc) {
        super(Type.ELECTRIC, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);

        if(Program.chance(1)) {
            Effect e = new Effect();
            def.addEffect(e);

            System.out.println(def.toString() + " ");
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
