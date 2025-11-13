package rvt.Payment;

public class App {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);

        card.addMoney(15);
        System.out.println(card);

        card.addMoney(90.2);
        System.out.println(card);
    }
}