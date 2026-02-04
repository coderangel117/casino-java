package fr.perino.casino.service;

public class GuessNumberService {
    private final Integer randomNumber;

    public GuessNumberService() {
        this.randomNumber = (int) (Math.random() * 100) + 1;
    }

    public boolean verifyNumber(Integer trial) {
        if (trial == randomNumber) {
            return true;
        }
        return false;
    }

    public String giveHint(Integer trial) {
        if (trial > randomNumber) {
            return "trop grand !";
        } else {
            return "trop petit !";
        }
    }
}
