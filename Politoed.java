package pokemon;

import move.status.Confide;
import ru.ifmo.se.pokemon.*;

public class Politoed extends Poliwag{
    public Politoed(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(90, 75, 75, 90, 100, 70);
        addMove(new Confide());
    }

}
