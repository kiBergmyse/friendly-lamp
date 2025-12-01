package lab2;

import ru.ifmo.se.pokemon.*;
import pokemon.*;
import move.physical.*;
import move.status.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Girafarig("Жираф", 5));
        b.addFoe(new Smoochum("Первая эволюция", 5));
        b.addFoe(new Jynx("Вторая эволюция", 5));
        b.go();
    }
}