package java知识.公众号.骇客与画家.a2020.a1_13;

import java.util.Arrays;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-01-13 02:12
 **/
public class Test {

    public static void main(String[] args) {
        givenArrayOfIntegers_whenUsingArraysSortMethod_thenSortFullArrayInAscendingOrder();
        givenArrayOfIntegers_whenUsingArraysSortMethodWithRange_thenSortRangeOfArrayInAscendingOrder();
        givenArrayOfIntegers_whenUsingArraysParallelSortMethod_thenSortFullArrayInAscendingOrder();
        givenArrayOfIntegers_whenUsingArraysParallelSortMethodWithRange_thenSortRangeOfArrayInAscendingOrder();
    }

    public static void givenArrayOfIntegers_whenUsingArraysSortMethod_thenSortFullArrayInAscendingOrder() {
        int[] array = { 10, 4, 6, 2, 1, 9, 7, 8, 3, 5 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void givenArrayOfIntegers_whenUsingArraysSortMethodWithRange_thenSortRangeOfArrayInAscendingOrder() {
        int[] array = { 10, 4, 6, 2, 1, 9, 7, 8, 3, 5 };
        Arrays.sort(array, 2, 8);
        System.out.println(Arrays.toString(array));
    }

    public static void givenArrayOfIntegers_whenUsingArraysParallelSortMethod_thenSortFullArrayInAscendingOrder() {
        int[] array = { 10, 4, 6, 2, 1, 9, 7, 8, 3, 5 };

        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void givenArrayOfIntegers_whenUsingArraysParallelSortMethodWithRange_thenSortRangeOfArrayInAscendingOrder() {
        int[] array = { 10, 4, 6, 2, 1, 9, 7, 8, 3, 5 };

        Arrays.parallelSort(array, 2, 8);
        System.out.println(Arrays.toString(array));
    }

}
