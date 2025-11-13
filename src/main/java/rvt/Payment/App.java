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

        // PaymentCard card = new PaymentCard(10);
        // System.out.println("Paul: " + card);
        // card.addMoney(-15);
        // System.out.println("Paul: " + card);


        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul: " + paulsCard.toString());
        System.out.println("Matt: " + mattsCard.toString());

        paulsCard.addMoney(20);

        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard.toString());
        System.out.println("Matt: " + mattsCard.toString());

        paulsCard.eatAffordably();
        mattsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard.toString());
        System.out.println("Matt: " + mattsCard.toString());

    }
}