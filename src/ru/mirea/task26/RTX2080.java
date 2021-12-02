package ru.mirea.task26;

public class RTX2080 extends GPU{

    public RTX2080() {
        this.hashrateStrategy = new midHash();
    }
}
