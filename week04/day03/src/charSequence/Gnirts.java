package charSequence;

public class Gnirts implements CharSequence {
    private  String string;
    private  int integer;

    public Gnirts(String string) {
        this.string = string;
        this.integer = 0;
    }

    public Gnirts(String string, int integer) {
        this.string = string;
        this.integer = integer;
    }

    private int fromEnd(int i) {
        if (integer == 0){
        return string.length() - 1 - i;
        } else
            return i + integer;
    }


    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        if ((index < 0) || (index >= string.length())) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return string.charAt(fromEnd(index));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
