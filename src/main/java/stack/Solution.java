package stack;

/**
 * Created by ritesh on 4/22/17.
 */
public class Solution {

    public static void main(String args[]) {

        Stack stack = new Stack(5);

        System.out.println("Push:");

        stack.push(65);
        stack.push(44);

        printStack(stack);

        System.out.println("POP:");

        System.out.println("Popped:" + stack.pop());

        printStack(stack);

        System.out.println("Peek:" + stack.peep());

        System.out.println("Push:");

        stack.push(45);
        stack.push(23);
        stack.push(11);
        stack.push(14);
        stack.push(6);

        printStack(stack);

        System.out.println("POP:");

        System.out.println("POPPED:"+ stack.pop());
        printStack(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        printStack(stack);


    }

    public static void printStack(final Stack stack) {

       Object[] arr = stack.getArr();

       for(int i = 0; i<=stack.getTop(); i++) {
           System.out.println(arr[i]);
       }
    }
}
