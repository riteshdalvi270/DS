package crackingcode6th.arraylist;

/**
 * Created by ritesh on 3/18/17.
 */
public class Application {

    public static void main(String args[]) {

        ArrayList<String> lists = new ArrayList<>(String.class,3);

        lists.add("Ritesh");
        lists.add("Ridima");
        lists.add("Sid");

        System.out.println(lists.lenght());


        for(int i = 0; i<3; i++) {
            System.out.println(lists.get(i));
        }

        lists.add("Aarti");
        lists.add("Nitin");

        System.out.println(lists.lenght());


        for(int i = 0; i<lists.lenght(); i++) {
            System.out.println(lists.get(i));
        }
    }
}
