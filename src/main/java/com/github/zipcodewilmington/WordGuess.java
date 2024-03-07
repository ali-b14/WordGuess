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


    public WordGuess() {

    }


    public static void main(String[] args){
        WordGuess game = new WordGuess();
        game.runGame();
    }


    // instance variables go here
    // set up a list (array) of strings of words players could guess
    String[] words = {"lion", "cat", "wool", "dog", "sheep", "ball", "toy", "candy", "fire", "soccer"};


    public static void runGame(){
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


    public static char printArray(char[] a){
        for (int i = 0; i < ; i++) {
            System.out.println();
        }
    }


    public static void printAnnounceGame(){
//        prints a welcome
    }


    public static void printGameOver(){
//        prints "game over"
    }


    public static void initializeGameState(){
//        return sets up char[] for secret word and guesses
    }


    public static void getNextGuess(){
//        returns char from player input;
    }


    public static void isWordGuessed(){
//        returns booleans;
    }


    public static void askToPlayAgain(){
//        returns boolean;
    }


    public static void printCurrentState(){
//        uses printArray to show player where they are at
    }


    public static void processLoopsThruArray(){
//        process() loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found
    }


    public static void playerWon(){
//        prints happy message
    }


    public static void playerLost(){
//        prints sad message
    }

}

