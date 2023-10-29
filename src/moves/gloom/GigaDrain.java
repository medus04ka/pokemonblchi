package moves.gloom;

import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove {

    public GigaDrain(double power, double acc) {
        super(Type.GRASS, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        //эффект хп как работает???
        Effect effectHP = new Effect().chance(0.5).turns(0).stat(Stat.HP, 5);

        p.addEffect(effectHP);

        System.out.println(p + " увеличил 5 HP!");
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}

