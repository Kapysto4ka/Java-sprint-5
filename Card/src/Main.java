public class Main {
    public static void main(String[] args) {
        Card card = new Card();
        card.getRank();
        card.getSuit();
        System.out.println("\n--------------");
        Cards cards = new Cards();
        cards.getRanks();
        cards.getSuit();
        cards.show();
    }
}