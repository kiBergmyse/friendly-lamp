package move.physical;

import ru.ifmo.se.pokemon.*;

public class HeartStamp extends PhysicalMove {

    public HeartStamp() {
        super(Type.PSYCHIC, 60.0, 1.0);
    }
    @Override protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.flinch(p); 
        }
    }

    @Override public String describe() {
        return "использует HeartStamp";
    }
}