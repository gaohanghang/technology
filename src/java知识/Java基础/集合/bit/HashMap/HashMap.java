package java知识.Java基础.集合.bit.HashMap;

public class HashMap<K,V> implements Map<K,V>{
    // 成员变量
    private static int defaultLength=16; // 默认容量
    private static double defaultLoader=0.75;// 因子
    private Entry[] table = null;

    private int size = 0;

    // 构造函数
    public HashMap(int defaultLength,double defaultLoader){
        defaultLength=defaultLength;
        defaultLoader=defaultLoader;
        table=new Entry[defaultLength];
    }

    public HashMap(){
        this(defaultLength,defaultLoader);
    }

    // 方法
    public Object put(K k, V v) {
        int index = getIndex(k);
        Entry entry = table[index];
        if (entry==null){
            table[index] = newEntry(k,v,null);
            size++;
        }else {
            table[index] = newEntry(k,v,entry);
        }
        return table[index].getValue();
    }

    public int getIndex(K k){
        int m = defaultLength;
        int index = k.hashCode()%m;
        return index>=0?index:-index;
    }

    public Entry<K,V> newEntry(K k,V v,Entry<K,V> next){
        return new Entry<K,V>(k,v,next);
    }

    public V get(K k) {
        int index = getIndex(k);
        if (table[index]==null){
            return null;
        }
        return (V) findValueByEqualKey(k,table[index]);
    }

    public V findValueByEqualKey(K k,Entry<K,V> entry){
        if (k==entry.getKey()||k.equals(entry.getKey())){
            return entry.getValue();
        }else {
            if (entry.next!=null){
                return findValueByEqualKey(k,entry.next);
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    // 内部类
    class Entry<K,V> implements Map.Entry {
        // 成员变量
        K k;
        V v;
        Entry<K,V> next;

        // 构造函数
        public Entry(K k,V v,Entry<K,V> next){
            this.k=k;
            this.v=v;
            this.next=next;
        }

        // 方法
        public Object getKey() {
            return k;
        }

        public V getValue() {
            return v;
        }
    }
}
