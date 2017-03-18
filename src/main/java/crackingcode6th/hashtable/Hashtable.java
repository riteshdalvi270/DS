package crackingcode6th.hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritesh on 3/15/17.
 */
public class Hashtable<K, V>
{

    int size = 0;

    private List<HashNode<K, V>> array[];

    public Hashtable(int size)
    {
        this.size = size;
        array = new List[size];
    }

    public void put(K key, V value)
    {
        final HashNode<K, V> hashNode = new HashNode<K, V>(key, value);

        int index = getBucket(key);

        addToBucket(index, hashNode);
    }

    public V get(K key)
    {
        int index = getBucket(key);

        return getHashNodeValue(index, key);
    }

    private int getBucket(K key)
    {

        int hashCode = key.hashCode();

        int index = hashCode % size;

        return index;
    }

    private void addToBucket(int index, HashNode<K, V> hashNode)
    {
        List<HashNode<K, V>> hashNodes = array[index];
        if (hashNodes == null)
        {
            hashNodes = new ArrayList<>();
        }
        hashNodes.add(hashNode);

        array[index] = hashNodes;
    }

    private V getHashNodeValue(int index, K key)
    {
        final List<HashNode<K, V>> hashNodes = array[index];

        if (hashNodes == null)
        {
            throw new RuntimeException("Index does not exist");

        }

        for (final HashNode<K, V> hashNode : hashNodes)
        {
            if (hashNode.getKey() == key)
            {
                return hashNode.getValue();
            }
        }

        return null;
    }
}
