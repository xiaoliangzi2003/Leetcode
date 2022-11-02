import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
/* 解法1：暴力枚举，时间复杂度:O(n²)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[0];
        //throw new IllegalArgumentException("No two sum solution found");

    }
}
*/

/*conclusion:
 * 1.java声明数组：type[]arrayName,
 * 2.解法思路：遍历数组，如果有nums[i]+nums[j]=target，则返回下标数组；如果没有，则返回0数组
*/

//解法2：哈希表,在遍历的同时，记录一些信息
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);//将数组第i个元素存放到哈希表中第i个位置
        }
        return new int[0];
    }
}




// @lc code=end

