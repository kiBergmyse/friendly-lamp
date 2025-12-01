package pokemon;

import ru.ifmo.se.pokemon.*;
import move.physical.IcePunch;
import move.status.FakeTears;
import move.physical.HeartStamp;


public class Smoochum extends Pokemon {
    public Smoochum(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC, Type.ICE);
        setStats(45, 30, 15, 85, 65, 65);
        setMove(new IcePunch(), new FakeTears(), new HeartStamp());
    }
}
