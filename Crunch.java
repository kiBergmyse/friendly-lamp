package move.physical;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Crunch extends PhysicalMove {

    public Crunch(){
        super(Type.DARK, 80.0, 1.0);
    }
    
    @Override public void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2){
            p.setMod(Stat.DEFENSE, -1);}
    }

    @Override public String describe() {
        return "использует Crunch";
    }
}
