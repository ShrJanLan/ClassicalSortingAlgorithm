package main.java.com.tgothd.sort;


/**
 * 冒泡排序
 * @author ShrJanLan
 * @create 2020-07-06 15:36
 */
public class BubbleSort {

    public int[] sort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){//相邻元素两两对比
                    int temp = arr[j + 1];//元素交换
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
