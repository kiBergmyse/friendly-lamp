package pokemon;

import ru.ifmo.se.pokemon.*;
import move.physical.WakeUpSlap;


public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level); 
        setType(Type.WATER);
        setStats(65, 65, 65, 50, 50, 90);
        addMove(new WakeUpSlap());
    }
}
