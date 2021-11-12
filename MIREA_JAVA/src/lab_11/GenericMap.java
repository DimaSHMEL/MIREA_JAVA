package lab_11;

import java.util.HashMap;
import java.util.Map;

public class GenericMap<K,V> {
    Map<K, V> dataset = new HashMap<>();

    public void Insert(K key, V value) {
        dataset.put(key, value);
    }

    public Map<K, V> getDataset() {
        return dataset;
    }

    public V getValue(K key) {
        return this.dataset.get(key);
    }

    public boolean checkkey(K key)
    {
        return dataset.containsKey(key);
    }
    @Override
    public String toString() {
        return "GenericMap{" +
                "dataset=" + dataset +
                '}';
    }
}
