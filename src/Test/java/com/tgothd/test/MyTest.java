package Test.java.com.tgothd.test;

import main.java.com.tgothd.sort.BubbleSort;
import main.java.com.tgothd.sort.InsertionSort;
import main.java.com.tgothd.sort.SelectionSort;
import main.java.com.tgothd.sort.ShellSort;
import org.junit.Test;

/**
 * 单元测试
 * @author ShrJanLan
 * @create 2020-07-06 16:10
 */
public class MyTest {

    @Test
    public void testBubbleSort(){
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        arr = new BubbleSort().sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void testSelectionSort(){
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        arr = new SelectionSort().sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void testInsertionSort(){
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        arr = new InsertionSort().sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void testShellSort(){
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        arr = new ShellSort().sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
