package tomaytotomato.map;

import java.io.Serializable;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Hello world!
 */
public class BruceMap<K, V> extends AbstractMap<K, V>
        implements Map<K, V>, Cloneable, Serializable {


    /* The initial size of the bucket array */
    private int MAP_SIZE = 512;


    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return null;
    }

    @Override
    public void forEach(BiConsumer<? super K, ? super V> action) {

    }

    @Override
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {

    }

    @Override
    public V putIfAbsent(K key, V value) {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        return false;
    }

    @Override
    public V replace(K key, V value) {
        return null;
    }

    @Override
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        return null;
    }

    @Override
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return null;
    }

    @Override
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return null;
    }

    @Override
    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        return null;
    }
}