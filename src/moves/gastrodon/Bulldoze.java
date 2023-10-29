package moves.gastrodon;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {

    public Bulldoze(double power, double acc) {
        super(Type.GROUND, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPEED, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        // делим на отдельные части + выбираем последнее и подпись
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length - 1];
    }
}
