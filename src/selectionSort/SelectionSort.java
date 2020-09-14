package selectionSort;

import common.Student;

/**
 * @Author YuSong-Lin
 * @Date 2020/7/22 15:04
 * @Version 1.0
 */


public class SelectionSort {
    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 4, 2, 3, 6, 5};
        String[] a = {"a", "=", "7", "是"};
        SelectionSort.sort(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        Student[] students = {new Student("A", 98),
                new Student("B", 100),
                new Student("C", 86)};
        SelectionSort.sort(students);
        for (Student student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
