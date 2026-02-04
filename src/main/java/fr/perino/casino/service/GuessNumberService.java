package fr.perino.casino.service;

public class GuessNumberService {
    private static Integer randomNumber;

    public GuessNumberService() {
        this.randomNumber = (int) (Math.random() * 100) + 1;
    }

}
