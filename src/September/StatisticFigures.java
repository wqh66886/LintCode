package September;

import java.util.Scanner;

/**
 * @author: 王其浩
 * @ClassName: StatisticFigures
 * @Description: 统计数字
 * @Date 2020/8/26
 * @version:
 */
public class StatisticFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(digitCounts(k, n));
    }

    public static int digitCounts(int k, int n) {
        // write your code here
        int count = 0;
        String str = String.valueOf(k);
        for(int i = 0;i <= n; i++){
            String temp = String.valueOf(i);
            if(temp.length()>1){
                for(int j = 0;j < temp.length();j++){
                    if(str.charAt(0) == temp.charAt(j)){
                        count++;
                    }
                }
            }else if(str.equals(String.valueOf(i))){
                count++;
            }
        }

        return count;
    }
}
