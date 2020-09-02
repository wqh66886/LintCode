package September;

/**
 * @author: 王其浩
 * @ClassName: UglyNumber
 * @Description: 丑数
 * @Date 2020/8/26
 * @version:
 */
public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1665));
    }

    public static int nthUglyNumber(int n) {
        // write your code here
        int pos = 0;//用来计数
        if(n <= 1){
            return 1;
        }
        for(int i = 1; ;i++) {
            if (isUgly(i)) {
                pos++;
                if (pos == n) {
                    return i;
                }
            }
        }
    }

    public static boolean isUgly(int num){
        if(num < 0){
            return false;
        }
        while (num % 2 == 0) num /=2;
        while (num % 3 == 0) num /=3;
        while (num % 5 == 0) num /=5;
        if(num == 1){
            return true;
        }else {
            return false;
        }
    }
}
