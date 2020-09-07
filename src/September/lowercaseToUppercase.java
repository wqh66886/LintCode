package September;

/**
 * @author: 王其浩
 * @ClassName: lowercaseToUppercase
 * @Description:
 * @Date 2020/9/3
 * @version:
 */
public class lowercaseToUppercase {
    public static void main(String[] args) {
        System.out.println(new lowercaseToUppercase().LowercaseToUppercase('A'));
    }
    public char LowercaseToUppercase(char character) {
        // write your code her
        char c = 0;
        if(character >= 'A' && character <='Z' ){
            c = (char) ((int)character+ 32);
        }else if(character >= 'a' && character <= 'z' ) {
            c = (char) ((int)character - 32);
        }
        return c;
    }
}
