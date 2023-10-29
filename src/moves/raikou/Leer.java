package moves.raikou;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {

    public Leer(double power, double acc) {
        super(Type.NORMAL, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.DEFENSE, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        // делим на отдельные части + выбираем последнее и подпись
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length - 1];
    }

}
