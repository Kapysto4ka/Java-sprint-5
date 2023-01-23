import java.util.Random;

public class Card {
    final String[] Ranks = {"1","2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};
    final String[] Suit = {"Hearts","Tiles","Clovers","Pikes"};
    String[] card = new String[2];
    Random rnd = new Random();
    int i = rnd.nextInt(4);
    int j = rnd.nextInt(13);
    public void getSuit(){
       switch(i){
           case(0): System.out.print(" Hearts ");
               break;
           case(1): System.out.print(" Tiles ");
               break;
           case(2): System.out.print(" Clovers ");
               break;
           case(3): System.out.print(" Pikes ");
               break;
        }
    }
    public void getRank(){
        switch (j) {
            case (0):
                System.out.print("1");
                break;
            case (1):
                System.out.print("2");
                break;
            case (2):
                System.out.print("3");
                break;
            case (3):
                System.out.print("4");
                break;
            case (4):
                System.out.print("5");
                break;
            case (5):
                System.out.print("6");
                break;
            case (6):
                System.out.print("7");
                break;
            case (7):
                System.out.print("8");
                break;
            case (8):
                System.out.print("9");
                break;
            case (9):
                System.out.print("10");
                break;
            case (10):
                System.out.print("Jack");
                break;
            case (11):
                System.out.print("Queen");
                break;
            case (12):
                System.out.print("King");
                break;
            case (13):
                System.out.print("Ace");
                break;
        }
    }
}
