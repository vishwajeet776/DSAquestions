
public class ReversLL {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void reversList(){
        if (head==null&&head.next==null){
            return;
        }
        Node prev=head;
        Node current = head.next;
        while(current!=null){
            Node next=current.next;
            current.next=prev;

//            update
            prev=current;
            current=next;
        }
        head.next=null;
        head=prev;
    }
    public  void addLast(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }
    public void print(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
        ReversLL list=new ReversLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.print();
        list.reversList();
        list.print();
    }
}
