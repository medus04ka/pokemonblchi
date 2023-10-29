package moves.vileplume;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove {

    public PoisonPowder(double power, double acc) {
        super(Type.POISON, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effectHP = new Effect().chance(100).turns(0).stat(Stat.HP, 1/8);
        p.addEffect(effectHP);
    }

    @Override
    protected String describe() {
        // делим на отдельные части + выбираем последнее и подпись
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length - 1];
    }

}
