public class LinkedListDemo {
    class Node 
    {
        int val;
        Node next;

        public Node(int val )
        {
            this.val=val;
            
        }
    }
    Node head=null;
    Node tail=null;
    public void createList(int val){
        Node nn=new Node(val);
        if(head==null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            tail=tail.next;
        }
    }
    public void displayList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+" ---> ");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LinkedListDemo l1=new LinkedListDemo();
        l1.createList(10);
        l1.createList(20);
        l1.createList(30);
        l1.displayList();
    }

}