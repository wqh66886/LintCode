package September;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 王其浩
 * @ClassName: KthLargestElement
 * @Description: 第K大元素
 * @Date 2020/8/28
 * @version:
 */
public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{9,3,2,4,8};
        System.out.println(new KthLargestElement().LargestElement(3, arr));
    }

    public int  LargestElement(int n,int[] nums){
        int[] arr = quick(nums,0,nums.length-1);
        Map<Integer,Integer> map = new HashMap<>();
        int index = 1;
        for(int i = arr.length-1; i >= 0; i--){
            map.put(index++,arr[i]);
        }
        return map.get(n);
    }

    public static int getPos(int[] arr,int start,int end){
        int i = start;
        int j = end;
        int x = arr[i];
        while(i < j){
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
