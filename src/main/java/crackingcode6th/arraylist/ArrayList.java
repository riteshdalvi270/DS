package crackingcode6th.arraylist;

import java.lang.reflect.Array;

import static java.lang.reflect.Array.*;

/**
 * @author Ritesh Dalvi (rd026600).
 */
public class ArrayList<T>
{
    private T array[];
    private int size;
    private Class<T> clazz;

    private int counter = 0;

    public ArrayList(Class<T> c, int size)
    {
        clazz = c;
        this.size = size;

        array = (T[]) newInstance(c,size);
    }

    public int lenght() {

        return size;
    }

    public void add(T data) {

        if(counter == size) {

            array = copyOver();
        }

        array[counter] = data;
        counter++;
    }

    public T get(int index) {

        if(index >= size) {
            throw new RuntimeException("index >= size");
        }

        return array[index];
    }

    private T[] copyOver() {

        size = size*2;
        T[] newArray = (T[])newInstance(clazz,size);

        for(int i = 0; i<array.length; i++) {

            newArray[i] = array[i];
        }

        return newArray;
    }
}
