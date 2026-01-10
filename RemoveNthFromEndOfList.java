class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      int sz=0;
      ListNode temp=head;
      while(temp!=null){
        temp=temp.next;
        sz++;
      }  
      if(sz==n){
        head=head.next;
        return head;
      }
      int i=1;
      int iToFind=sz-n;
      ListNode prev=head;
      while(i<iToFind){
        prev=prev.next;
        i++;
      }
      prev.next=prev.next.next;
      return head;
    }

}
