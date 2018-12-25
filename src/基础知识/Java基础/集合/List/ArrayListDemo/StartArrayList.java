package 基础知识.Java基础.集合.List.ArrayListDemo;

/**
 * @author GaoHangHang
 * @date 2018/07/16 17:36
 **/
/*
    泛型generic
    java的泛型只存在于编译期，在运行期runtime会被擦除为Object
 */
public class StartArrayList<E> {

   /* private E object;

    public void setObject(E Object) {
        this.object = object;
    }*/

    private Object[] array;
    private final int DEFAULT_SIZE = 20;
    private final double RESIZE_RATE = 1.5;
    private int size;

    //无参数构造方法
    public StartArrayList() {
        array = new Object[DEFAULT_SIZE];
    }

    //有参数构造方法
    public StartArrayList(int capacity) {
        array = new Object[capacity];
    }

    //得到当前元素总数
    public int size() {
        return this.size;
    }

    //但会该arraylsit是否为空
    public boolean isEmpty() {
        return this.size == 0;
    }

    //核心的方法，用于数组的扩容，实现动态数组的功能
    public void ensureCapacity() {
        Object[] old = this.array;
        this.array = new Object[(int) (old.length * RESIZE_RATE)];
        //iterate through the old array
        for (int i = 0; i < old.length; i++) {
            array[i] = old[i];
        }
    }

    //尾部添加数据
    public boolean add(E data) {
        //要对参数进行一个判断
        if (data == null)
            return false;
        //如果已经添加到了最后一个，那么就要扩容
        if (this.size == array.length)
            ensureCapacity();
        array[this.size] = data;
        this.size++;

        return true;
    }

    //不是尾部添加，而是在中间怎么办？
    public boolean add(E data, int index) {
        if (index < 0 || index >= this.size || data == null)
            return false;
        if (this.size == array.length)
            ensureCapacity();
        for (int i = this.size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = data;
        this.size++;

        return true;
    }

    //remove 同样有两种情况，第一种根据index来移除，第二种是根据内容来移除（equals）
    public E remove(int index) {
        if (index < 0 || index >= this.size)
            //非法参数异常
            //throw new IllegalArgumentException("ddd");
            return null;
        E data = (E) array[index]; //原本取出的是object
        for (int i = index; i < this.size - 1; i++) {
            array[i] = array[i + 1];
        }

        this.size--;
        return data;
    }

    public boolean remove(E data) {
        if (data == null)
            return false;
        for (int i = 0; i < this.size; i++) {
            if (array[i].equals(data)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean set(E data, int index) {
        if (index < 0 || index >= this.size)
            return false;
        array[index] = data;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= this.size)
            return null;
        return (E) array[index];
    }

    //返回传入元素在arraylist里面的位置
    public int indexOf(E data) {
        int index = 0;
        for (int i = 0; i < this.size; i++) {
            if (array[i].equals(data))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        StartArrayList<Integer> list = new StartArrayList<>();
        System.out.println(list.size);
        list.add(20);
        list.add(30);
        list.remove(20);
        System.out.println(list.size);
        list.set(40, 1);
        System.out.println(list.get(1));
    }
}
