package com.github.zipcodewilmington;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Random;

public class Main {
        static  String pickedWord ;

    public static void main(String[] args) {

        System.out.println("Welcome to WordGuess lets play! ");

        WordGuess randomWord = new WordGuess();
        String wordlist = randomWord.randomWordList();

        System.out.println(randomWordList());
        pickedWord = WordGuess.randomeWordList;

    }

}
