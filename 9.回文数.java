/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        //特殊情况：x<0,x!=0时最后一位为0都不是回文数
        if(x<0||(x%10==0&&x!=0))  return false;
        int revertedNumber=0;
        //回文数具有对称性，所以将对称轴右边的数字反转和左边的数字比较，如果相等则是回文数
        //当位数为奇数时，去掉中间的数和x相比较
        while(x>revertedNumber){
            revertedNumber=revertedNumber*10+(x%10); 
            x/=10;
        }
        return (revertedNumber==x)||(revertedNumber/10==x);

    }
        
}
// @lc code=end

