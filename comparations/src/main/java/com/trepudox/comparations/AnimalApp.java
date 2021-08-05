package com.trepudox.comparations;

import com.trepudox.comparations.comparable.Animal;
import com.trepudox.comparations.comparator.AnimalComparator;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalApp {

    public static void main(String[] args) {
        Animal gato = new Animal("Zazu", 4.0);
        Animal cachorro = new Animal("Jasper", 15.0);

        List<Animal> animalList = List.of(gato, cachorro);

        System.out.println(animalList.stream().sorted(new AnimalComparator()).collect(Collectors.toList()));
    }

}
