public class Middle{
    public ListNode middleNode(ListNode head) {
        ListNode t = head;
        int l =0;
        while(t!=null){
            t=t.next;
            l++;
        }
        l=l/2;
        while(l>0){
            head=head.next;
            l--;
        }
        return head;
    }
} 
    
