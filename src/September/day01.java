package September;

import java.util.Arrays;

/**
 * @Author wangqh
 * @Create 2020/9/1
 * @Version 1.0
 */
public class day01 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[] B = {2,4,5,6};
        System.out.println(Arrays.toString(mergeSortedArray(A, B)));
    }

    public static int[] mergeSortedArray(int[] arrOne,int[] arrTwo){
        int[] arr = new int[arrOne.length+arrTwo.length];

        int index = 0;
        for (int i = 0; i < arrOne.length; i++) {
            arr[index++] = arrOne[i];
        }
        for (int i = 0; i < arrTwo.length; i++) {
            arr[index++]  = arrTwo[i];
        }
        quick(arr,0,arr.length-1);
        return arr;
    }

    public static int getPos(int[] arr,int start,int end){
        int i = start;
        int j = end;
        int x = arr[i];
        while (i < j){
            while (i < j && x < arr[j]){
                j--;
            }
            if(i < j){
                arr[i] = arr[j];
                i++;
            }
            while (i < j && x > arr[i]){
                i++;
            }
            if(i < j){
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = x;
        return i;
    }

    public static int[] quick(int[] arr,int start,int end){
        if(start < end){
            int pos = getPos(arr,start,end);
            quick(arr,start,pos-1);
            quick(arr,pos+1,end);
        }
        return arr;
    }
}
