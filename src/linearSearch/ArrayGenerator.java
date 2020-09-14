package linearSearch;

/**
 * @Author YuSong-Lin
 * @Date 2020/7/17 11:56
 * @Version 1.0
 */


public class ArrayGenerator {

    private ArrayGenerator() {
    }

    public static Integer[] generatorOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
