package stack;

/**
 * Implement Stack
 * Created by ritesh on 4/22/17.
 */
public class Stack {

    private Object arr[];
    private int top = -1;
    private int lastElementIndex = -1;

    public Stack (int capacity) {
        arr = new Object[capacity];
    }

    public void push(Object element) {

      if(top == arr.length-1) {

          System.out.println("Stack full, cannot push "+element+" pop elements first");
          return;
      }

      if(top == -1) {
          lastElementIndex++;
      }

      top++;
      arr[top] = element;
    }

    public Object pop() {

        if(top == -1) {
            System.out.println("No Elements to retrieve");
            return -1;
        }

        Object value = arr[top];

        reinitializeArray();

        return value;
    }

    private void reinitializeArray() {

        final Object[] newArray = new Object[arr.length];

       while(lastElementIndex!=top) {

            newArray[lastElementIndex] = arr[lastElementIndex];
            lastElementIndex++;
        }
        top = lastElementIndex - 1;
        lastElementIndex = 0;

       arr = newArray;
    }

    public Object peep() {

        return arr[top];
    }

    public Object[] getArr() {
        return arr;
    }

    public int getTop() {
        return top;
    }
}
