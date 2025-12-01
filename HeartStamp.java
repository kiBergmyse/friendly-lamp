package move.physical;

import ru.ifmo.se.pokemon.*;

public class HeartStamp extends PhysicalMove {

    public HeartStamp() {
        super(Type.PSYCHIC, 60.0, 1.0);
    }
    private boolean fl = false;
    @Override protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.flinch(p); 
            fl = true;

        }
    }

    @Override public String describe() {
        if (fl){
            return "использует HeartStamp и вызывает у противника страх!";
        }
        return "использует HeartStamp";
    }
}