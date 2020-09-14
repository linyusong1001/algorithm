package javaArr;

/**
 * @Author YuSong-Lin
 * @Date 2020/7/28 11:47
 * @Version 1.0
 */


public class Array {

    private int[] data;
    private int size;

    /**
     * 构造函数传入数组的容量
     *
     * @param capacity
     */
    public Array(int capacity) {
        this.data = new int[capacity];
    }

    /**
     * 无参构造函数
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中的元素个数
     *
     * @return
     */
    public int getSize() {
        return this.size;
    }

    /**
     * 获取数组的容量
     *
     * @return
     */
    public int getCapacity() {
        return this.data.length;
    }

    /**
     * 获取数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return this.size == 0;
    }
}
