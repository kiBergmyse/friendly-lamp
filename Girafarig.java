package pokemon;

import ru.ifmo.se.pokemon.*;
import move.status.Rest;
import move.special.DreamEater;
import move.status.Agility;
import move.physical.Crunch;

public final class Girafarig extends Pokemon {
    public Girafarig(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC);
        setStats(70, 80, 65, 90, 65, 85);
        setMove(new Rest(), new DreamEater(), new Agility(), new Crunch());
    }

}
