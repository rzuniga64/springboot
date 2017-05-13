package org.spring.boot.propertymaps;

import org.spring.boot.intro.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Owner on 5/11/2017.
 */
public class JungleFoods {

    /** A food map with key and value as Strings. */
    private Map<String, String> foods = new HashMap<>();

    /** A animals map with key as String and value as Animal type. */
    private Map<StringBuilder, Animal> animals = new HashMap<>();

    /**
     *  Set the map of foods.
     *  @param newFoods newFoods
     */
    public void setFoods(final Map<String, String> newFoods) {
        this.foods = newFoods;
    }

    /**
     *  Set the map of animals.
     *  @param newAnimals newAnimals
     */
    public void setAnimals(final Map<StringBuilder, Animal> newAnimals) {
        this.animals = newAnimals;
    }

    /**
     *  toString method.
     *  @return data as a String.
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> entry: this.foods.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }

        sb.append("\n");

        for (Map.Entry<StringBuilder, Animal> entry: animals.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }

        return sb.toString();
    }
}
