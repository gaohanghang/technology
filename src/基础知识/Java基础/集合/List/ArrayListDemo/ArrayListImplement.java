package 基础知识.Java基础.集合.List.ArrayListDemo;

import java.io.Serializable;
import java.util.*;

/**
 * 实现
 * ArrayList
 *
 * @author GaoHangHang
 * @date 2018/07/16 13:59
 **/
public class ArrayListImplement<E> extends AbstractList<E> implements RandomAccess, Cloneable, Serializable {

    // 序列化id
    private static final long serialVersionUID = 3144881857248250738L;
    // 默认初始的容量
    private static final int DEFAULT_CAPACITY = 10;
    // 一个空对象
    private static final Object[] EMPTY_ELEMENTDATA = new Object[0];
    // 一个空对象，如果使用默认构造函数创建，则默认对象内容默认是该值
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = new Object[0];
    // 当前数据对象存放地方，当前对象不参与序列化
    transient Object[] elementData;
    // 当前数组长度
    private int size;
    // 数组最大长度
    private static final int MAX_ARRAY_SIZE = 2147483639;

    // 省略方法。。

    // 无参构造函数
    /*
        注意：此时我们创建的ArrayList对象中的elementData中的长度是1，
        size是0,当进行第一次add的时候，elementData将会变成默认的长度：10.

     */
    public ArrayListImplement() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    // 带int类型的构造函数
    /*
        如果传入参数，则代表指定ArrayList的初始数组长度，传入参数如果是大于等于0，
        则使用用户的参数初始化，如果用户传入的参数小于0，则抛出异常，构造方法如下：
     */
    public ArrayListImplement(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    // 带Collection对象的构造函数
    /*
        1) 将collection对象转换成数组，然后将数组的地址的赋给elementData。
        2）更新size的值，同时判断size的大小，如果是size等于0，直接将空对象EMPTY_ELEMENTDATA的地址赋给elementData
        3）如果size的值大于0，则执行Arrays.copy方法，把collection对象的内容（可以理解为深拷贝）copy到elementData中。

        注意：this.elementData = arg0.toArray(); 这里执行的简单赋值时浅拷贝，所以要执行Arrays,copy 做深拷贝
     */
    public ArrayListImplement(Collection<? extends E> c) {
        elementData = c.toArray();
        if ((size = elementData.length) != 0) {
            // c.toArray might (incorrectly) not return Object[] (see 6260652)
            if (elementData.getClass() != Object[].class)
                elementData = Arrays.copyOf(elementData, size, Object[].class);
        } else {
            // replace with empty array.
            this.elementData = EMPTY_ELEMENTDATA;
        }
    }

    /*
        add方法

        add的方法有两个，一个带参数的，一个是带两个参数的，下面我们一个个讲解。
     */

    /*
        add(E e)方法

        add主要的执行逻辑如下：
        1）确保数组已使用长度（size）加1之后足够存下 下一个数据
        2）修改次数modCount 标识自增1，如果当前数组已使用长度（size）加1后的大于当前的数组长度，
        则调用grow方法，增长数组，grow方法会将当前数组的长度变为原来容量的1.5倍。
        3）确保新增的数据有地方存储之后，则将新元素添加到位于size的位置上。
        4）返回添加成功布尔值。
     */
    public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }

    /**
     * add(int index, E element)方法
     * <p>
     * 这个方法其实和上面的add类似，该方法可以按照元素的位置，指定位置插入元素，具体的执行逻辑如下：
     * 1）确保数插入的位置小于等于当前数组长度，并且不小于0，否则抛出异常
     * 2）确保数组已使用长度（size）加1之后足够存下 下一个数据
     * 3）修改次数（modCount）标识自增1，如果当前数组已使用长度（size）加1后的大于当前的数组长度，则调用grow方法，增长数组
     * 4）grow方法会将当前数组的长度变为原来容量的1.5倍。
     * 5）确保有足够的容量之后，使用System.arraycopy 将需要插入的位置（index）后面的元素统统往后移动一位。
     * 6）将新的数据内容存放到数组的指定位置（index）上
     * <p>
     * 注意：使用该方法的话将导致指定位置后面的数组元素全部重新移动，即往后移动一位。
     */
    public void add(int index, E element) {
        // rangeCheckForAdd(index);

        ensureCapacityInternal(size + 1); //
        System.arraycopy(elementData, index, elementData, index + 1,
                size - index);
        elementData[index] = element;
        size++;
    }

    /**
     * 确保添加的元素有地方存储，当第一次添加元素的时候this.size+1 的值是1，
     * 所以第一次添加的时候会将当前elementData数组的长度变为10：
     */
    private void ensureCapacityInternal(int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }


    }

    /**
     * 将修改次数（modCount）自增1，判断是否需要扩充数组长度,
     * 判断条件就是用当前所需的数组最小长度与数组的长度对比，如果大于0，则增长数组长度。
     *
     * @param minCapacity
     */
    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;

        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    /*
        如果当前的数组已使用空间（size）加1之后 大于数组长度，则增大数组容量，扩大为原来的1.5倍。
     */
    private void grow(int arg0) {
        int arg1 = this.elementData.length;
        int arg2 = arg1 + (arg1 >> 1);
        if (arg2 - arg0 < 0) {
            arg2 = arg0;
        }

        if (arg2 - 2147483639 > 0) {
            // arg2 = hugeCapacity(arg0);
        }

        this.elementData = Arrays.copyOf(this.elementData, arg2);
    }

    @Override
    public E get(int index) {
        //rangeCheck(index);
        //checkForComodification();
        //return ArrayList.this.elementData(offset + index);
        return null;
    }

    /**
     * set方法
     * 确保set的位置小于当前数组的长度（size）并且大于0，
     * 获取指定位置（index）元素，然后放到oldValue存放，
     * 将需要设置的元素放到指定的位置（index）上，
     * 然后将原来位置上的元素oldValue返回给用户。
     *
     * @param index
     * @param element
     * @return
     */
    @Override
    public E set(int index, E element) {
        return null;
    }

    public boolean contains(Object o) {
        return indexOf(0) >= 0;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null)
                    return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i]))
                    return i;
            }
        }
        return -1;
    }

    public E remove(int index) {
        return null;
    }


    @Override
    public int size() {
        return 0;
    }


}
