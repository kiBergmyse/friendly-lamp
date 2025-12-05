package move.status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0.0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
            System.out.println(p.getHP());
        p.setMod(Stat.HP, (int) - (p.getStat(Stat.HP) - p.getHP()));
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
            System.out.println(p.getHP());

    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}