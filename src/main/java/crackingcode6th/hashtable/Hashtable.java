package crackingcode6th.hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritesh on 3/15/17.
 */
public class Hashtable<K,V> {

    int size = 0;

    final List<HashNode<K,V>> chaining = new ArrayList<>();

    List<HashNode<K,V>> [] hashNodes = null;

    public Hashtable(int size) {
        this.size = size;
        hashNodes = new List[size];
    }


    public void put(K key, V value) {

        final HashNode<K,V> hashNode = new HashNode<K, V>(key,value);

        int index = getBucket(key);

        addToBucket(index,hashNode);
    }

    private int getBucket(K key) {

        int hashCode = key.hashCode();

        int index = hashCode % size;

        return index;
    }

    private void addToBucket(int index, HashNode<K,V> hashNode) {
        
    }
}
