package nest;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ritesh on 4/11/17.
 */
public class LRU {

    public static void main(String args[]) {

    }

    public static class LRUCache {

        final Map<Integer, Value> cache;
        int capacity = 0;

        public LRUCache(int capacity) {
            cache = new HashMap<>(capacity);
            this.capacity = capacity;
        }

        public int get(int key) {
            Value value = cache.get(key);

            if (value == null) {
                return -1;
            }

            value.setCounter(Instant.now());

            cache.put(key, value);

            return value.getValue().intValue();
        }

        public void put(int key, int value) {

            int size = cache.size();

            if (size == capacity) {
                Integer keyValue = null;

                Instant leastUsed = null;

                for (Map.Entry<Integer, Value> entrySet : cache.entrySet()) {

                    Value outputValue = entrySet.getValue();

                    if (leastUsed == null) {

                        leastUsed = outputValue.getCounter();
                        keyValue = entrySet.getKey();
                    } else {

                        if (leastUsed.isAfter(outputValue.getCounter()) || leastUsed.equals(outputValue.getCounter())) {

                            leastUsed = outputValue.getCounter();
                            keyValue = entrySet.getKey();
                        }
                    }
                }

                cache.remove(keyValue);

                cache.put(key, new Value(value));
            } else {
                cache.put(key, new Value(value));
            }
        }
    }

    static class Value {

        Integer value;
        Instant counter = Instant.now();

        public Value() {

        }

        public Value(Integer value) {
            this.value = value;
        }

        public Value(Integer value, Instant counter) {
            this.value = value;
            this.counter = counter;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Instant getCounter() {
            return counter;
        }

        public void setCounter(Instant counter) {
            this.counter = counter;
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
