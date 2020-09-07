package September;

import java.util.Arrays;

/**
 * @author: 王其浩
 * @ClassName: day04
 * @Description:
 * @Date 2020/9/3
 * @version:
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 4, 5};
        new Sort().sortIntegers(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void sortIntegers(int[] A) {
        // write your code here
        for(int i = 0;i < A.length-1;i++){
            for(int j = 0;j < A.length-i-1;j++){
                if(A[j] > A[j+1]){
                    A[j] = A[j+1]^(A[j+1]=A[j])^A[j];
                }
            }
        }
    }
}
