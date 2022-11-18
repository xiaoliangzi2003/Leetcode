import java.util.Map;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start

class Solution {
    Map<Character,Integer> symbolValues=new HashMap<Character,Integer>(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }};
    public int romanToInt(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int value=symbolValues.get(s.charAt(i));//获取字符串第i+1个字符对应的数字
            if(i<n-1&&value<symbolValues.get(s.charAt(i+1)))//下一个字符串表示的数字比前一个字符串大泽相减
            {
                ans-=value;
            }else ans+=value;//小则相加
        }    
        return ans;
    }
}
// @lc code=end

