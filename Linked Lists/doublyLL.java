public class doublyLL{
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data= data;
            this.next= null;
            this.prev= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head == null){
            head= tail= newNode;
            return;
        }

        newNode.next= head;
        head.prev= newNode;
        head= newNode;

    }

    // print the LL
    public void print(){
        Node temp= head;
        while(temp != null){
            System.out.print(temp.data + " <--> ");
            temp= temp.next;
        }
        System.out.println("null");

    }

    public static void main(String args[]){
        doublyLL dll= new doublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println("size of our LL is: "+ size);
    }

    
}