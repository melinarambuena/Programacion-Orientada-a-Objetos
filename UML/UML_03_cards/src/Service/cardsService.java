/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Melina Narambuena
 */
public class cardsService {

    Scanner leer = new Scanner(System.in);

    public ArrayList<card> fillCards() {
        int number = 0;
        int suit = 0;
        ArrayList<card> cards = new ArrayList();

        for (int i = 0; i < 4; i++) {
            suit = i + 1;

            for (int j = 0; j < 12; j++) {

                number = j + 1;

                if (number != 8 && number != 9) {

                    if (number > 12) {
                        number = 1;
                    }

                    card c1 = new card();

                    c1.setNumber(number);

                    switch (suit) {
                        case 1:
                            c1.setSuit("club");
                            break;
                        case 2:
                            c1.setSuit("sword");
                            break;
                        case 3:
                            c1.setSuit("coin");
                            break;
                        case 4:
                            c1.setSuit("cup");
                            break;
                    }

                    cards.add(c1);

                }

            }

        }
        System.out.println("mazo completo: ");
        for (card mostrar : cards) {
            System.out.println(mostrar);
        }
        return cards;
    }

    public void shuffle(ArrayList<card> cards) {
        Collections.shuffle(cards);
        System.out.println("cartas mezcladas: ");
        for (card mostrar : cards) {
            System.out.println(mostrar);
        }
    }

    public void nextCard(ArrayList<card> cards) {

        card c1 = new card();
        int position = 0;
        for (int i = 0; i < cards.size(); i++) {
            card currentCard = cards.get(i);
            System.out.println("La siguiente carta es: " + currentCard);

            String answer;
            System.out.println("Desea repartir otra carta s/n: ");
            answer = leer.next();

            position = position + 1;

            c1.setPosition(position);

            if (!answer.equalsIgnoreCase("s")) {
                System.out.println("No se repartirán más cartas.");
                break;

            }

        }
    }

    public void availableCards(ArrayList<card> cards, card c1) {
//                card c1 = new card();

        int run;
        run = c1.getPosition();
        int available;
        available = cards.size() - run;

        System.out.println("Las cartas disponibles son: " + available);
    }

}
