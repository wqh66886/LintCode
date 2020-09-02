package September;

/**
 * @Author wangqh
 * @Create 2020/9/1
 * @Version 1.0
 */
public class day02 {
    public static void main(String[] args) {
        String str = "abcdefg";
        int offset = 3;
        rotateString(str.toCharArray(),offset);
        System.out.println(str);
    }
    public static void rotateString(char[] str, int offset) {
        // write your code here
        if(str.length == 0 || null == str){
            return;
        }
        StringBuffer newStr = new StringBuffer();
        int index = 0;
        for(int i = offset+1;i < str.length;i++){
            newStr.append(str[i]);
        }
        for(int i = 0;i <= offset;i++){
            newStr.append(str[i]);
        }
        str = newStr.toString().toCharArray();
    }
}
