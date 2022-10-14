package ru.mail.polis.homework.oop.vet.Animals;

import ru.mail.polis.homework.oop.vet.Animal;
import ru.mail.polis.homework.oop.vet.Pet;

public class Cow extends Animal implements Pet {
    public Cow(int legs) {
        super(legs);
    }

    @Override
    public String say() {
        return "Moo-Moo";
    }
}
