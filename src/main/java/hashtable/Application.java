package hashtable;

/**
 * @author Ritesh Dalvi (rd026600).
 */
public class Application
{
    public static void main(String args[])
    {
        Hashtable<Integer, String> hashtable = new Hashtable<>(7);

        hashtable.put(123, "abcd");
        hashtable.put(234, "hthy");
        hashtable.put(124, "cdf");
        hashtable.put(122, "jsjnjn");
        hashtable.put(121, "uyuui");

        System.out.println(hashtable.get(123));
        System.out.println(hashtable.get(234));
        System.out.println(hashtable.get(124));
        System.out.println(hashtable.get(122));
        System.out.println(hashtable.get(121));
    }
}
