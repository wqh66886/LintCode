package September;

/**
 * @author: 王其浩
 * @ClassName: reverseInteger
 * @Description:
 * @Date 2020/9/3
 * @version:
 */
public class reverseInteger {
    public static void main(String[] args) {
        System.out.println(new reverseInteger().reverse(123));
    }

    public int reverse(int number){
        if(number < 100 || number > 1000){
            System.out.println("输入的数字超出反转范围!");
        }
        int a = number%10;
        int b = (number/10)%10;
        int c = number/100;

        return a*100+b*10+c;
    }
}
