package September;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangqh
 * @Create 2020/9/2
 * @Version 1.0
 */
public class day03 {
    public static void main(String[] args) {
        fizzBuzz(15).forEach(e-> System.out.println(e));
    }
    public static List<String> fizzBuzz(int n) {
        // write your code here
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                list.add("fizz buzz");
            }else if(i % 3 == 0){
                list.add("fizz");
            }else if(i % 5 == 0){
                list.add("buzz");
            }else{
                list.add(""+i);
            }
        }
        return list;
    }
}
