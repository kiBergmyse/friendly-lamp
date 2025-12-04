package move.physical;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove{
    public WakeUpSlap(){
        super(Type.FIGHTING, 70.0, 1.0);
    }

    @Override protected void applyOppEffects(Pokemon p){
        if (p.getCondition() == Status.SLEEP){
            p.setCondition(new Effect().condition(Status.NORMAL));
            this.power = 140.0;}
    }
    
    @Override protected String describe(){
        return "использует WakeUpSlap на противнике!";
    }

}