package pokemon;

import ru.ifmo.se.pokemon.*;
import move.special.IceBeam;
import move.physical.Facade;

public class Poliwag extends Pokemon{
    public Poliwag(String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(40, 50, 40, 40, 40, 90);
        setMove(new IceBeam(), new Facade());
    }
}
