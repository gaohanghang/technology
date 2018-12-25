package java知识.Java基础.集合.bit.HashMap;

public interface Map<K, V> {

    public Object put(K k, V v);

    public V get(K k);

    public int size();

    // Entry接口
    public interface Entry<K, V> {

        /**
         * 返回key
         *
         * @return
         */
        public K getKey();

        /**
         * 返回value
         *
         * @return
         */
        public V getValue();

    }
}
