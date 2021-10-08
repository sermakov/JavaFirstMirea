package ru.mirea.task14.prac7;

import java.io.FileNotFoundException;

public class Prac7 {
    public static void main(String[] args) throws Exception {
        CardGameConsole.run();
        CardGameConsoleDeque.run();
        CardGameConsoleQueue.run();
        CardGameDoubleLinkedList.run();
        CardGameUpgraded.run();
    }
}
