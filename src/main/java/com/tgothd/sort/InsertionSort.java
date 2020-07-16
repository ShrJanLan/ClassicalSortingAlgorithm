package main.java.com.tgothd.sort;

/**
 * 插入排序
 * @author ShrJanLan
 * @create 2020-07-06 16:49
 */
public class InsertionSort {

    public int[] sort(int[] arr) {
        int len = arr.length;
        int preIndex, current;
        for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }

}
