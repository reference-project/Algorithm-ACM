//翻转单链表，时间复杂度o(n)，空间复杂度o(1)
public class ReverseList{
    class list{
        int val;
        list next;
        list(int n){
            val=n;
            next=null;
        }
    }
    public static list reverseList(list head){
        if(head==null)return head;
        list p,q;
        p=head;
        q=head.next;
        while (q!=null){
            p.next=q.next;
            q.next=head;
            head=q;
            q=p.next;
        }
        return head;
    }
}
