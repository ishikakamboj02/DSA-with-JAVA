public class reverselinkedlist{
    public static class Node{// node class
        int data;
        Node next;

        public Node(int data){// node constructor
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){//method to insert at the end
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next= newNode;
        tail=newNode;
}

    public static void print(){// method to print linkedlist
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+ " --> ");
            temp= temp.next;
        }
        System.out.println("null");

    }

    public void reverse(){
        Node prev= null;//node before head is always null
        Node curr= tail= head;
        Node next;

        while(curr!= null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        head= prev;

    }
    public static void main (String args[]){
    reverselinkedlist ll= new reverselinkedlist();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    print();
    
    ll.reverse();
    print();
  }
}
