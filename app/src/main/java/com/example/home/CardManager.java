package com.example.home;

public class CardManager {
    public static void main(String[] args){
        CreditCard card1 = new CreditCard(43241334,5932);
        CreditCard card2 = new CreditCard(94839347,8057);
        CreditCard card3 = new CreditCard(27236732,43543);

        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();

        card1.deposit();
        card2.deposit();
        card3.withdraw();

        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();
    }
}
