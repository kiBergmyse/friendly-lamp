package move.status;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove {

    public Agility() {
        super(Type.PSYCHIC, 0, 1);
    }

    @Override public void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPEED, 2);  
    }

    @Override public String describe() {
        return "использует Agility";
    }
}