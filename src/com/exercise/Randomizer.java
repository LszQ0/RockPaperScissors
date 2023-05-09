package com.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Randomizer {


    List<String> list = Arrays.asList("Rock", "Paper", "Scissors");
    Random random = new Random();


    public String randomChoice() {
        int indexList = random.nextInt(list.size());
        return list.get(indexList);
    }





}
