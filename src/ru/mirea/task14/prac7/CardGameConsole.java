package ru.mirea.task14.prac7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class CardGameConsole {

    public static void run() throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("src/ru/mirea/task14/prac7/input.txt"));
        Stack<Integer> firstPlayerCards = new Stack<>();
        Stack<Integer> secondPlayerCards = new Stack<>();
        String[] playerOneDeck = reader.nextLine().split(" ");
        String[] playerTwoDeck = reader.nextLine().split(" ");
        for (int i = playerOneDeck.length-1; i >= 0; i--) {
            firstPlayerCards.push(Integer.parseInt(playerOneDeck[i]));
        }
        for (int i = playerTwoDeck.length-1; i >= 0; i--) {
            secondPlayerCards.push(Integer.parseInt(playerTwoDeck[i]));
        }
        int turnCount = 0;
        while (!firstPlayerCards.empty() && !secondPlayerCards.empty()) {
            if (turnCount >= 106) {
                System.out.println("botva");
                break;
            }
            int firstPlayerCard = firstPlayerCards.pop();
            int secondPlayerCard = secondPlayerCards.pop();
            if (firstPlayerCard < secondPlayerCard) {
                firstPlayerCards.add(0, firstPlayerCard);
                firstPlayerCards.add(0, secondPlayerCard);
            } else {
                secondPlayerCards.add(0, firstPlayerCard);
                secondPlayerCards.add(0, secondPlayerCard);
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