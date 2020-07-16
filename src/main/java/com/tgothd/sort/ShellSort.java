package main.java.com.tgothd.sort;

/**
 * 希尔排序
 * @author ShrJanLan
 * @create 2020-07-06 16:59
 */
public class ShellSort {

    public int[] sort(int[] arr) {
        int temp;
        //控制增量序列,增量序列为1的时候为最后一趟
        for (int i = arr.length/2; i >0; i/=2) {
            //根据增量序列，找到每组比较序列的最后一个数的位置
            for (int j = i; j < arr.length; j++) {
                //根据该比较序列的最后一个数的位置，依次向前执行插入排序
                for (int k = j-i; k >=0; k-=i) {
                    if(arr[k]>arr[k+i]){
                        temp = arr[k];
                        arr[k]  = arr[k+i];
                        arr[k+i] = temp;
                    }
                }
            }
        }
        return arr;
    }

}
