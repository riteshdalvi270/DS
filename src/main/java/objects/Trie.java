package objects;

import java.util.HashMap;
import java.util.Map;

/**
 * Trie stucture.
 * Created by ritesh on 5/8/17.
 */
public class Trie{

    public char value;
    public Map<Character,Trie> children = new HashMap<>();
    public boolean isLeaf;

    public Trie() {

    }

    public Trie(char value){
        this.value = value;
    }
}
