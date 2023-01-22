public class NumberHolder{
    private int anInt;
    private float aFloat;
    public static void main(String[] args) {
        NumberHolder aNumberHolder = new NumberHolder();
        aNumberHolder.anInt = 2;
        aNumberHolder.aFloat = 62.5f;
        System.out.println(aNumberHolder.anInt);
        System.out.println(aNumberHolder.aFloat);
    }
}