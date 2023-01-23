import java.util.*;
public class Cards {
    Random rnd = new Random();
    final int[] Ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    final String[] Suit = {"Hearts", "Tiles", "Clovers", "Pikes"};
    String[] cards = new String[52];
    int x;
    int y;
    int v;

    public void getRanks() {
        for (int i = 0; i <= (Ranks.length-1); i++) {
            x = rnd.nextInt(Ranks.length);
            y = Ranks[i];
            Ranks[i] = Ranks[x];
            Ranks[x] = y;
        }
    }
    public  void getSuit(){
        for (int i = 0; i <= (Suit.length-1); i++) {
            v = rnd.nextInt(Suit.length);
            String string = Suit[i];
            Suit[i] = Suit[v];
            Suit[v] = string;
        }
        }
    public void show(){
        for (int i = 0; i <= (Suit.length-1); i++) {
            for(int j =0;j<=(Ranks.length-1);j++){
                System.out.println(Suit[i]+" " +Ranks[j]);
            }

        }
    }

}