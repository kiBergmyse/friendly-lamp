package lab2;

import ru.ifmo.se.pokemon.*;
import pokemon.*;
import move.physical.*;
import move.status.*;

public final class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Girafarig("Жираф", 5));
        b.addAlly(new Jynx("Джинкс", 5));
        b.addAlly(new Poliwag("Поливог", 5));
        b.addFoe(new Smoochum("Смучум", 5));
        b.addFoe(new Politoed("Лягушка", 5));
        b.addFoe(new Poliwhirl("Поливирл", 5));
        b.go();
    }
}