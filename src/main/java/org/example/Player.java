package org.example;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    static int countPlayers = 0;

    public Player(int stamina) throws IllegalArgumentException {
        if(stamina < 90 || stamina > MAX_STAMINA) {
            throw new IllegalArgumentException("Выносливость должна быть в диапазоне от 90 до 100");
        } else {
            this.stamina = stamina;
        }

        if (countPlayers < 6) {
            countPlayers++;
        } else {
            System.out.println("Игроков уже 6");
        }
    }

    public int getStamina() {
        return stamina;
    }


    public void run() {
        if (stamina == MIN_STAMINA) {
            System.out.println("Игрок уже устал");
            return;
        }

        stamina--;

        if (stamina == MIN_STAMINA) {
            System.out.println("Игрок покинул поле");
            countPlayers--;
        }
    }

    static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные, на поле есть еще " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
