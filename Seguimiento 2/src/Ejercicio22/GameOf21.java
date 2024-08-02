package Ejercicio22;

import java.util.Random;
import java.util.Scanner;

class Player {
    private int card1;
    private int card2;
    private int hiddenCard;
    private int totalScore;

    public Player() {
        Random rand = new Random();
        this.card1 = rand.nextInt(10) + 1;
        this.card2 = rand.nextInt(10) + 1;
        this.hiddenCard = rand.nextInt(10) + 1;
        this.totalScore = card1 + card2;
    }

    public int getCard1() {
        return card1;
    }

    public int getCard2() {
        return card2;
    }

    public int getHiddenCard() {
        return hiddenCard;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void revealHiddenCard() {
        totalScore += hiddenCard;
    }
}

public class GameOf21 {
    private Player user;
    private Player computer;
    private Scanner scanner;

    public GameOf21() {
        user = new Player();
        computer = new Player();
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        showInitialCards();
        waitForUserAction();
        revealCardsAndDetermineWinner();
    }

    private void showInitialCards() {
        System.out.println("Tus cartas son: " + user.getCard1() + " y " + user.getCard2());
        System.out.println("Para revelar tu tercera carta y terminar el juego, presiona 'A'.");
    }

    private void waitForUserAction() {
        char choice = scanner.next().charAt(0);
        if (choice == 'A' || choice == 'a') {
            user.revealHiddenCard();
            computer.revealHiddenCard();
        } else {
            System.out.println("Elección inválida. Fin del juego.");
            System.exit(0);
        }
    }

    private void revealCardsAndDetermineWinner() {
        System.out.println("Tu tercera carta es: " + user.getHiddenCard());
        System.out.println("Tu puntuación total es: " + user.getTotalScore());
        System.out.println("La computadora tiene: " + computer.getCard1() + ", " + computer.getCard2() + " y " + computer.getHiddenCard());
        System.out.println("Puntuación total de la computadora: " + computer.getTotalScore());

        determineWinner(user.getTotalScore(), computer.getTotalScore());
    }

    private void determineWinner(int userScore, int computerScore) {
        if (userScore > 21 && computerScore > 21) {
            System.out.println("Ambos jugadores superaron 21. No hay ganador.");
        } else if (userScore > 21) {
            System.out.println("Te pasaste de 21. La computadora gana.");
        } else if (computerScore > 21) {
            System.out.println("La computadora se pasó de 21. Tú ganas.");
        } else {
            if (userScore > computerScore) {
                System.out.println("Tú ganas con una puntuación de " + userScore + " contra " + computerScore + " de la computadora.");
            } else if (computerScore > userScore) {
                System.out.println("La computadora gana con una puntuación de " + computerScore + " contra " + userScore + " tuya.");
            } else {
                System.out.println("Empate con una puntuación de " + userScore);
            }
        }
    }
}
