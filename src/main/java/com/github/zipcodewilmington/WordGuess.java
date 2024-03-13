package com.github.zipcodewilmington;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

// Ali
public class WordGuess {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        WordGuess game = new WordGuess();
        game.runGame();
    }

    public WordGuess() {
    }
    // instance variables go here
    // set up a list (array) of strings of words players could guess

    private void runGame(){
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
        String[] wordArray = {"cat","tire","crabs","single", "randoms"};
        
//        choose a random word from a list
        String secretWord = generateRandomWord(wordArray);
        StringBuilder guesses = new StringBuilder(secretWord.length());

        guesses.append("_".repeat(secretWord.length()));
        int numberofAllowedGuesses = secretWord.length();
        while(numberofAllowedGuesses > 0){
            announceGame();
            printCurrentState(guesses);

            char guess = getNextGuess();

            if(secretWord.contains((String.valueOf(guess)))){
                int index = secretWord.indexOf(guess);
                guesses.setCharAt(index, guess);
            }
            numberofAllowedGuesses--;
            System.out.println("Number of guesses left: " + numberofAllowedGuesses);
            if(secretWord.equals(guesses.toString())){
                playerWon();
                if(!askToPlayAgain()) {
                    break;
                }else {
                    secretWord = generateRandomWord(wordArray);
                    numberofAllowedGuesses = secretWord.length();
                    guesses = new StringBuilder(secretWord.length());
                    guesses.append("_".repeat(secretWord.length()));
                }
            }
            if(numberofAllowedGuesses <= 0) {
                playerLost();
                if(!askToPlayAgain()) {
                    break;
                }else{
                    secretWord = generateRandomWord(wordArray);
                    numberofAllowedGuesses = secretWord.length();
                    guesses = new StringBuilder(secretWord.length());
                    guesses.append("_".repeat(secretWord.length()));
                }
            }
        }

    }


//    public static char printArray(char[] a){
//        for (int i = 0; i < ; i++) {
//            System.out.println();
//        }
//    }


    public void announceGame(){
//        prints a welcome
        System.out.println("Welcome to WordGuess ");
    }


    public void gameOver(){
//        prints "game over"
        System.out.println("Game over out of guesses ");
    }


//    public void initializeGameState(){
//
////        return sets up char[] for secret word and guesses
//    }


    public char getNextGuess(){
        System.out.println("Enter a letter: ");
        char guess = scanner.next().charAt(0);
        return guess;
//        returns char from player input;
    }


//    public static void isWordGuessed(){
////        returns booleans;
//    }


    public boolean askToPlayAgain(){
//        returns boolean;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Play again?\t(yes / no)");
        String userInput = scanner1.nextLine();
        if(userInput.equals("yes")){
            return true;
        }else return false;

    }


    public void printCurrentState(StringBuilder guesses){
//        uses printArray to show player where they are at
        System.out.println(guesses.toString());
    }


//    public static void processLoopsThruArray(){
////        process() loops thru the word array, looking for the inputted guess, and replaces the "_" with the guesses char if found
//    }


    public static void playerWon(){
        System.out.println("Congratulations you won! ");
//        prints happy message
    }


    public static void playerLost(){
        System.out.println("Unfortunately today wasn't your lucky day better luck");
//        prints sad message
    }
    public String generateRandomWord (String[] words){
        Random random = new Random();
        int randomNumber = random.nextInt(4 + 1);
        String magicWord = words[randomNumber];
        return magicWord;
    }

}

