/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;//声明节点的值
 *     ListNode next;//声明下一个节点
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
 * 解题思路：
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode head=null,tail=null;
      int n1,n2;
      int carry=0;
      while(l1!=null || l2!=null){
        int sum=0;
        n1=(l1==null)?0:l1.val;//三目运算符，成立取冒号前面的，不成立取后面的
        n2=(l2==null)?0:l2.val;
        sum=n1+n2+carry;
        if(head==null){
            head=tail=new ListNode(sum%10);//分配一个新的节点
        }else{
            tail.next=new ListNode(sum%10);
            tail=tail.next;
        }
        carry=sum/10;
        if(l1!=null) l1=l1.next;
        if(l2!=null) l2=l2.next;
      }
      if(carry==1){
        tail.next=new ListNode(carry);
      }
      return head;
    }
}
// @lc code=end

