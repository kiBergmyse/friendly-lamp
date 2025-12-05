package move.physical;

import ru.ifmo.se.pokemon.*;

public class DoubleSlap extends PhysicalMove{
    
    public DoubleSlap(){
        super(Type.NORMAL, 15, 0.85, 1, (int)(Math.random() * 4) + 2);
    }

    protected String describe() {
        return "использует DoubleSlap!";}
}
