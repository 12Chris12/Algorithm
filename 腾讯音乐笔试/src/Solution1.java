import java.util.*;

public class Solution1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 返回满足题意的最小操作数
     * @param str string字符串 给定字符串
     * @return int整型
     */
    public int minOperations (String str) {
        // write code here
        int[] num = new int[26];
        for (int i = 0; i < 26; i++) num[i] = 0;
        StringBuffer s = new StringBuffer(str.substring(0, str.length()));
        // System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }
        int sum = 0;
        int n = 0;
        for (int i = 0; i < 26; i++) {
            // System.out.println(num[i]);
            if (num[i] > 0) {
                sum += (num[i] / 2);
                n += (num[i] % 2);
            }
        }
        int res = sum - (26 - n);
        if (res > 0) sum = sum + res;
        return sum;
    }
}
