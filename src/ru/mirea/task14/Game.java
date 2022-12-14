package ru.mirea.task14;
import java.util.Scanner;
import java.util.Stack;

public class Game {
    private static final int NUMBER_OF_CARDS = 10;
    private static final Scanner reader = new Scanner(System.in);

    static int doTurn(Stack<Integer> firstPlayerCards, Stack<Integer> secondPlayerCards, int turnCount) {
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
        return turnCount;
    }

    public static void main(String[] args) {
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
            turnCount = doTurn(firstPlayerCards, secondPlayerCards, turnCount);
        }
        if (firstPlayerCards.empty()) {
            System.out.println("second " + turnCount);
        } else if (secondPlayerCards.empty()) {
            System.out.println("first " + turnCount);
        }
    }
}
