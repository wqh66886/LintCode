package September;

/**
 * @author: 王其浩
 * @ClassName: FeiBo
 * @Description:
 * @Date 2020/9/3
 * @version:
 */
public class FeiBo {
    public static void main(String[] args) {
        System.out.println(new FeiBo().fibonacci(47));
    }
    public int fibonacci(int n) {
        // write your code here
        int[] arr = new int[n];
        int index = 0;
        for(int i = 0;i < n;i++){
            if(i == 0){
                arr[index++] = 0;
            }else if(i == 1 ){
                arr[index++] = 1;
            }else {
                arr[index++] = arr[i-1]+arr[i-2];
            }
        }
        return arr[n-1];
    }
}
