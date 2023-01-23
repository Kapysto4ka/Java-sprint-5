import java.lang.CharSequence;
public class CharSeq implements CharSequence {
    String str;
    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public CharSeq() {}
    public CharSeq(String str) {
        this.str = str;
    }
    @Override
    public int length() {
        int value = 0;
        for (int i = 0; i < str.length(); i++){
            value++;
        }
        return value;
    }
    private int searchIndex(int index) {
        return str.length() - str.length() + index;
    }
    @Override
    public char charAt(int index) {
        if (index < 0 && index > str.length() - 1) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return str.charAt(index);
    }
    @Override
    public String toString() {
        return str;

    }

}