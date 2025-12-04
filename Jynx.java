package pokemon;

import ru.ifmo.se.pokemon.*;
import move.physical.DoubleSlap;

public class Jynx extends Smoochum {
    public Jynx(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC, Type.ICE);
        addMove(new DoubleSlap());
        setStats(65, 50, 35, 115, 95, 95);
    }

}
