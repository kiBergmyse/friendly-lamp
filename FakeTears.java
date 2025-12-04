package move.status;

import ru.ifmo.se.pokemon.*;

public class FakeTears extends StatusMove{
    public FakeTears(){
        super(Type.DARK, 0, 1.0);
    }

    @Override protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, -2);
    }

    @Override public String describe() {
        return "использует FakeTears";
    }
}