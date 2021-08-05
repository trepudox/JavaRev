package com.trepudox.comparations.comparator;

import com.trepudox.comparations.comparable.Animal;

import java.text.Collator;
import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        int nameComparison = Collator.getInstance().compare(o1.getName(), o2.getName());
        int weightComparison = Double.compare(o1.getWeight(), o2.getWeight());

        return nameComparison != 0 ? nameComparison : weightComparison;
    }

}
