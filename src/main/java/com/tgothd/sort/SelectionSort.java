package main.java.com.tgothd.sort;

/**
 * 选择排序
 * @author ShrJanLan
 * @create 2020-07-06 16:34
 */
public class SelectionSort {

    public int[] sort(int[] arr) {
        int len = arr.length;
        int minIndex,temp;
        for(int i=0;i<len-1;i++) {
            minIndex=i;
            for (int j=i+1;j<len;j++) {
                if (arr[j] < arr[minIndex]) {//寻找最小的数
                    minIndex=j;//将最小数的索引保存
                    break;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

}
