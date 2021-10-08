package ru.mirea.task14.prac7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class CardGameConsole {

    private static final int NUMBER_OF_CARDS = 10;

    public static void run() throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("src/ru/mirea/task14/prac7/input.txt"));
        Stack<Integer> firstPlayerCards = new Stack<>();
        Stack<Integer> secondPlayerCards = new Stack<>();
        String[] playerOneDeck = reader.nextLine().split(" ");
        String[] playerTwoDeck = reader.nextLine().split(" ");
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            firstPlayerCards.push(Integer.parseInt(playerOneDeck[NUMBER_OF_CARDS / 2 - i - 1]));
        }
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            secondPlayerCards.push(Integer.parseInt(playerTwoDeck[NUMBER_OF_CARDS / 2 - i - 1]));
        }
        int turnCount = 0;
        while (!firstPlayerCards.empty() && !secondPlayerCards.empty()) {
            if (turnCount >= 106) {
                System.out.println("botva");
                break;
            }
            int firstPlayerCard = firstPlayerCards.pop();
            int secondPlayerCard = secondPlayerCards.pop();
            if (firstPlayerCard < secondPlayerCard || (firstPlayerCard == 9 && secondPlayerCard == 0)) {
                secondPlayerCards.add(0, firstPlayerCard);
                secondPlayerCards.add(0, secondPlayerCard);
            } else {
                firstPlayerCards.add(0, firstPlayerCard);
                firstPlayerCards.add(0, secondPlayerCard);
            }
            ++turnCount;
        }
        if (firstPlayerCards.empty()) {
            System.out.println("second " + turnCount);
        } else if (secondPlayerCards.empty()) {
            System.out.println("first " + turnCount);
        }
    }
}