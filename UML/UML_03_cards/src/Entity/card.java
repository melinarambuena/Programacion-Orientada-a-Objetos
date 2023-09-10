/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Melina Narambuena
 */
public class card {
    private int number;
    private String suit;
    private int position;

    public card() {
    }

    public card(int number, String suit, int position) {
        this.number = number;
        this.suit = suit;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "card{" + "number=" + number + ", suit=" + suit + ", position=" + position + '}';
    }

    
}
