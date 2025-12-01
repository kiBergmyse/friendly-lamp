package move.physical;

import ru.ifmo.se.pokemon.*;

public class IcePunch extends PhysicalMove{

    public IcePunch(){
        super(Type.ICE, 75.0, 1.0);
    }

    private boolean fr = false;

    @Override protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.1) && (!p.hasType(Type.ICE))){
            Effect.freeze(p);
            fr = true;
        }
    }
    protected String describe() {
        if (fr){
            return "Ааакует при помощи Ice Punch и замораживает врага!";}
        return "атакует при помощи Ice Punch, но не замораживает врага";}
}