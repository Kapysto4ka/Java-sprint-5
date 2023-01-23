public class Main  {
    public static void main(String[] args) {
        CharSeq Charseq = new CharSeq("Just plain text");
        System.out.println((Charseq.charAt(1)));
        System.out.println(Charseq.length());
        System.out.println(Charseq.subSequence(0,5));
        System.out.println(Charseq.isEmpty());

    }
}