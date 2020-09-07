package newKonwlage;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author: 王其浩
 * @ClassName: DoubleColon
 * @Description:
 * @Date 2020/9/7
 * @version:
 */
public class DoubleColon {
    public static void main(String[] args) {
        //字符串转整型
        Function<String,Integer> function = Integer::parseInt;
        Integer value = function.apply("123");
        System.out.println(value);


        //字符串分割
        String content = "Hello World";
        Function<Integer,String> func = content::substring;
        String str = func.apply(1);
        System.out.println(str);

        BiFunction<String,Integer,User> biFunction = User::new;
        User user = biFunction.apply("王其浩",23);
        System.out.println(user);
    }
}
