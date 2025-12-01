package move.special;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove{
    public IceBeam(){
        super(Type.ICE, 90.0, 1.0);
    }

    private boolean fr = false;

    @Override protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.1) && (!p.hasType(Type.ICE))){
            Effect.freeze(p);
            fr = true;
        }
    }
    @Override protected String describe() {
        if (fr){
            return "Использует Ice Beam и замораживает врага!";}
        return "атакует при помощи Ice Beam, но не замораживает врага";}
}
