package com.github.zipcodewilmington;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

// Ali
public class WordGuess {
    public String randomWordList() {

        String[] arr = {"lion", "cat", "wool", "dog", "sheep"};
        return arr[new Random().nextInt(arr.length)];

    }


}
