package move.special;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {

    public DreamEater() {
        super(Type.PSYCHIC, 100.0, 1.0);
    }

    private boolean sleep = false;

    @Override public void applyOppEffects(Pokemon p) {
        if (p.getCondition() == Status.SLEEP) {
            sleep = true;
        } else {
            sleep = false;
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.SLEEP) {
            p.setMod(Stat.HP, (int) 50.0);
        }
    }

    @Override public String describe() {
        return "использует Dream Eater";
    }
}