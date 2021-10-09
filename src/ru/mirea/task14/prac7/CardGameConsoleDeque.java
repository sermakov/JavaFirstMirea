package ru.mirea.task14.prac7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class CardGameConsoleDeque {

    public static void run() throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("src/ru/mirea/task14/prac7/input.txt"));
        Deque<Integer> firstPlayerCards = new LinkedList<>();
        Deque<Integer> secondPlayerCards = new LinkedList<>();
        // Duplicate...
        String[] playerOneDeck = reader.nextLine().split(" ");
        String[] playerTwoDeck = reader.nextLine().split(" ");
        for (int i = 0; i < playerOneDeck.length; ++i) {
            firstPlayerCards.add(Integer.parseInt(playerOneDeck[i]));
        }
        for (int i = 0; i < playerTwoDeck.length; ++i) {
            secondPlayerCards.add(Integer.parseInt(playerTwoDeck[i]));
        }
        int turnCount = 0;
        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            if (turnCount >= 106) {
                System.out.println("botva");
                break;
            }
            int firstPlayerCard = firstPlayerCards.remove();
            int secondPlayerCard = secondPlayerCards.remove();
            if (firstPlayerCard < secondPlayerCard) {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            } else {
                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            }
            ++turnCount;
        }
        if (firstPlayerCards.isEmpty()) {
            System.out.println("second " + turnCount);
        } else if (secondPlayerCards.isEmpty()) {
            System.out.println("first " + turnCount);
        }
    }
}