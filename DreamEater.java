package move.special;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {

    public DreamEater() {
        super(Type.PSYCHIC, 100.0, 1.0);
    }

    @Override public void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.SLEEP) {
            p.setMod(Stat.HP, -50);}
    }

    

    @Override public String describe() {
        return "использует Dream Eater";
    }
}