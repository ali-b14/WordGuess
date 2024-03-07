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
    // instance variables go here

    // set up a list (array) of strings of words players could guess
    String[] words = {"lion", "cat", "wool", "dog", "sheep", "ball", "toy", "candy", "fire"};

    public void runGame(){
//        choose a random word from a list
        random_Num = get_Next_Random_Integer(words.length-1);
        secret_Word = words[random_Num]; 


//        while (you want to play) { //outer loop
//            start the game
//            set word guessed to false
//            while (the word isn't guessed) { //inner loop
//            print the current game state
//            ask for a guess (a single letter)
//
//            check the letter against the word
//            using the two character arrays discussed above
//            increment the number of guesses
//
//            if the word is guessed
//            player won, congrats
//
//            if too many guesses
//            player lost, too bad, quit game
//        }
//        ask if player wants to play again
//    }
//    display game over
    }
    public static void main(String[] args){
        Wordguess game = new Wordguess();
        game.runGame();
    }


}

