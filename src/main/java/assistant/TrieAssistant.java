package assistant;

import objects.Trie;

import java.util.Map;

/**
 * Assistant to build a Trie stucture.
 * Created by ritesh on 5/8/17.
 */
public class TrieAssistant {

    Trie root;

    public TrieAssistant() {
        root = new Trie();
    }

    public void insert(String input) {

            final String word = (String) input;

            char[] wordChar = word.toCharArray();

            Map<Character, Trie> children = root.children;

            int counter = 0;

            for(char wd : wordChar) {

                Trie t;

                if(children.containsKey(wd)) {
                    t = children.get(wd);
                }else {
                    Trie node = new Trie(wd);
                    children.put(wd,node);

                    t = node;
                }

                children = t.children;

                counter++;

                if(counter == wordChar.length-1) {
                    t.isLeaf = true;
                }
            }
    }

    public boolean search(final String word) {

        final Trie t = searchNode(word);

        if(t!=null && t.isLeaf) {
            return true;
        }

        return false;
    }

    private Trie searchNode(final String word) {

        Map<Character, Trie> children = root.children;
        Trie t = null;
        for(int i=0; i<word.length(); i++) {

            char alphabet = word.charAt(i);

            if(children.containsKey(alphabet)) {
                t = children.get(alphabet);
                children = t.children;
            }else {
                return null;
            }
        }

        return t;
    }
}
