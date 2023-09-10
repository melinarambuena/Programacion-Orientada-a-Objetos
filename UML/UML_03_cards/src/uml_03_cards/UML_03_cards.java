/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml_03_cards;

import Entity.card;
import Service.cardsService;
import java.util.ArrayList;

/**
 *
 * @author Melina Narambuena
 */
public class UML_03_cards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        card c1 = new card();
        cardsService cs = new cardsService();
        ArrayList<card> cards = cs.fillCards();
        cs.shuffle(cards);
        cs.nextCard(cards);
        cs.availableCards(cards, c1);
//cs.play(cards);



    }
    
}
