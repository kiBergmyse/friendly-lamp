package move.special;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove{
    public IceBeam(){
        super(Type.ICE, 90.0, 1.0);
    }

    @Override protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.1) && (!p.hasType(Type.ICE))){
            Effect.freeze(p);
        }
    }
    @Override protected String describe() {
        return "Использует Ice Beam!";
    }
}
