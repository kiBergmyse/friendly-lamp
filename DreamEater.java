package move.special;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {

    public DreamEater() {
        super(Type.PSYCHIC, 100.0, 1.0);
    }

    private boolean sleep = false;

    protected void applyOppDamage(Pokemon p, double damage) {
        sleep = (p.getCondition() == Status.SLEEP);
        p.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override protected void applySelfDamage(Pokemon p, double damage){
        if (sleep) {
            p.setMod(Stat.HP, (int) - Math.round(damage / 2));
        }
    }

    @Override public String describe() {
        return "использует Dream Eater";
    }
}