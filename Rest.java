package move.status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0.0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, (int) (pokemon.getHP() - pokemon.getStat(Stat.HP)));
        pokemon.addEffect(new Effect().condition(Status.SLEEP).turns(2)
        );
    }

    @Override
    protected String describe() {
        return "использует Rest, восстанавливает все HP и засыпает";
    }
}