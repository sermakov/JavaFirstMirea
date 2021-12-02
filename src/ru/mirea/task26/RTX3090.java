package ru.mirea.task26;

public class RTX3090 extends GPU {

    public RTX3090() {
        this.hashrateStrategy = new highHash();
    }
}
