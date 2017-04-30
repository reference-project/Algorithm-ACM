public class Main {
    public static void main(String[] args) {
        list a=new list(0);
        list b=new list(1);
        list c=new list(2);
        list d=new list(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        a=ReverseList.reverseList(a);
        for(list e=a;e!=null;e=e.next)
            System.out.println(e.val);
    }
}