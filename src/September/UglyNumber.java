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
        System.out.println(nthUglyNumber(9));
    }

    public static int nthUglyNumber(int n) {
        // write your code here
        int pos = 0;//用来计数
        if(n <= 1){
            return 1;
        }
        for(int i = 1; ;i++) {
            if (isUglyNumber(i)) {
                pos++;
                if (pos == n) {
                    return i;
                }
            }
        }
    }

    public static boolean isUglyNumber(int n){
        if (n == 1) {
            // 递归退出条件，n=1
            return true;
        } else if (n % 2 == 0) {
            // 说明可以被2整除
            return isUglyNumber(n / 2);
        } else if (n % 3 == 0) {
            // 说明可以被3整除
            return isUglyNumber(n / 3);
        } else if (n % 5 == 0) {
            // 说明可以被5整除
            return isUglyNumber(n / 5);
        } else {
            return false;
        }

    }
}
