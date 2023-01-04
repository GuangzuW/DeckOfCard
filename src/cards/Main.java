package cards;

public class Main {

    public static void main(String[] args) {
        Deck deck=new Deck();
        System.out.printf(">>Before : %s\n", deck);

        deck.shuffle();

        System.out.println();
        System.out.printf(">>After : %s\n", deck);

    }

    
}
