package crackingcode6th.stringbuilder;

/**
 * Created by ritesh on 3/18/17.
 */
public class StringBuilder {

    private String array[] = null;
    private int size = 0;
    private int counter = 0;

    public StringBuilder(int size) {

        this.size = size;
        array = new String[size];
    }

    public int length() {
        return size;
    }

    public void add(String value) {

        if(counter == size) {

            array = copyOver();
        }

        array[counter] = value;
        counter++;
    }

    private String[] copyOver() {

        size = size * 2;

        String newArray[] = new String[size];

        for(int i =0; i<array.length; i++) {

            newArray[i] = array[i];
        }

        return newArray;
    }
}
