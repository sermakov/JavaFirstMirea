package ru.mirea.task14.prac7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class CardGameDoubleLinkedList {

    private static final int NUMBER_OF_CARDS = 10;
    private static final Scanner reader = new Scanner(System.in);

    public static void run() throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("src/ru/mirea/task14/prac7/input.txt"));
        List<Integer> firstPlayerCards = new LinkedList<>();
        List<Integer> secondPlayerCards = new LinkedList<>();
        // Again duplicate... (mb create another function?)
        String[] playerOneDeck = reader.nextLine().split(" ");
        String[] playerTwoDeck = reader.nextLine().split(" ");
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            firstPlayerCards.add(Integer.parseInt(playerOneDeck[i]));
        }
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            secondPlayerCards.add(Integer.parseInt(playerTwoDeck[i]));
        }
        int turnCount = 0;
        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            if (turnCount >= 106) {
                System.out.println("botva");
                break;
            }
            int firstPlayerCard = firstPlayerCards.remove(0);
            int secondPlayerCard = secondPlayerCards.remove(0);
            if (firstPlayerCard < secondPlayerCard || (firstPlayerCard == 9 && secondPlayerCard == 0)) {
                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            } else {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
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