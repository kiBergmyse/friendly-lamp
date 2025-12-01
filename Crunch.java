package move.physical;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Crunch extends PhysicalMove {

    public Crunch(){
        super(Type.DARK, 80.0, 1.0);
    }

    private boolean a = false;
    
    @Override public void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2){
            a = true;
            p.setMod(Stat.DEFENSE, -1);}
    }

    @Override public String describe() {
        if (a){
            return "использует Crunch и уменьшает броню на 1!";}
        else{
            return "использует Crunch";}

    }
}
