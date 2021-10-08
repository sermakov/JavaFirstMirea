package ru.mirea.task14.prac7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class CardGameUpgraded {

    private int turnCount = 0;

    private CardGameUpgraded() throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("src/ru/mirea/task14/prac7/input2.txt"));
        int playerAmount = Integer.parseInt(reader.nextLine());
        Player[] players = new Player[playerAmount];
        for (int i = 0; i < players.length; i++) {
            Player p = new Player();
            players[i] = p;

            String[] deck = reader.nextLine().split(" ");
            Arrays.stream(deck).forEach(s -> p.takeCard(Integer.parseInt(s)));
        }
        turnCount = 0;
        round(players);
    }

    public static void run() throws Exception {
        CardGameUpgraded game = new CardGameUpgraded();
    }

    public void round(Player[] players) {
        ArrayList<Player> playingPlayers = Arrays.stream(players).filter(player -> !player.isEmpty()).collect(Collectors.toCollection(ArrayList::new));
        while (playingPlayers.size() > 1) {
            playingPlayers = Arrays.stream(players).filter(player -> !player.isEmpty()).collect(Collectors.toCollection(ArrayList::new));
            if (turnCount >= 106) {
                System.out.println("botva");
                return;
            }
            int[] openedCards = playingPlayers.stream().mapToInt(Player::openCard).toArray();
            int min = Integer.MAX_VALUE;
            int min_c = 0;
            ArrayList<Player> bestPlayers = new ArrayList<>();
            for (int i = 0, x; i < openedCards.length; i++) {
                x = openedCards[i];
                if (x > min) continue;
                if (x < min) {
                    min = x;
                    min_c = 1;
                    bestPlayers.clear();
                    bestPlayers.add(playingPlayers.get(i));
                    continue;
                }
                min_c++;
                bestPlayers.add(players[i]);
            }
            int finalMin = min;
            int[] min_ids = Arrays.stream(openedCards).map(operand -> (finalMin == operand ? 1 : 0)).toArray();
            Player bestPlayer;
            if (min_c > 1) {
                bestPlayer = Collections.min(bestPlayers, Comparator.comparingInt(Player::deckSize));
            } else {
                bestPlayer = bestPlayers.get(0);
            }
            Player p;
            for (int i = 0; i < playingPlayers.size(); i++) {
                p = playingPlayers.get(i);
                bestPlayer.takeCard(openedCards[i]);
            }
            turnCount++;
        }
        Player wonPlayer = Arrays.stream(players).filter(player -> !player.isEmpty()).findFirst().orElseThrow();
        int wonPlayerId = -1;
        for (int i = 0; i < players.length; i++) {
            if (players[i] != wonPlayer) continue;
            wonPlayerId = i;
            break;
        }
        System.out.println(String.format("Игрок %d победил! Затрачено: %d ходов", wonPlayerId+1, turnCount));
    }


}

class Player {
    private Stack<Integer> playerCards = new Stack<>();

    @Override
    public String toString() {
        return "Player{" +
                "playerCards=" + playerCards +
                '}';
    }

    public Player() {
    }

    public void takeCard(int c) {
        if (c >= 0 && c <= 9) playerCards.push(c);
    }
    public int openCard() {
        return playerCards.pop();
    }

    public int deckSize() {
        return playerCards.size();
    }

    public boolean isEmpty() {
        return playerCards.isEmpty();
    }
}