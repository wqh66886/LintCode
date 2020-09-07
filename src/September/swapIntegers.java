package September;

import java.util.Arrays;

/**
 * @author: 王其浩
 * @ClassName: swapIntegers
 * @Description:
 * @Date 2020/9/3
 * @version:
 */
public class swapIntegers {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        new swapIntegers().swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
    }
    public void swap(int[] A, int index1, int index2) {
        // write your code here
        int a = A[index1];
        int b = A[index2];
        for (int i = 0; i < A.length; i++) {
            if(i == index1){
                A[i] = b;
            }else if(i == index2){
                A[i] = a;
            }
        }
    }
}
