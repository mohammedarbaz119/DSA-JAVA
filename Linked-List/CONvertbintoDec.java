public class CONvertbintoDec{
    public int getDecimalValue(ListNode head) {
        int l =0;
        int num=0;
        ListNode t = head;
        while(t.next!=null){
            t=t.next;
            l++;
        }
       while(l>=0&&head!=null){
           num += Math.pow(2,l)*head.val;
           l--;
           head=head.next;
       }
        return num;
    }
} 
    

