public class Deletemiddlenode {
        public ListNode deleteMiddle(ListNode head) {
            ListNode t =head;ListNode t1 =head;
             int l =0;
            while(t!=null){
                t=t.next;
                l++;
            }
            if(l==1){
                head=null;
                return head;
            }
            l=l/2;
            while(l>1){
                t1=t1.next;
                l--;
            }
            t1.next=t1.next.next;
            return head;
            
        }
    }

