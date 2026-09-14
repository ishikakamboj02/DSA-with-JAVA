public class iterativesearch{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    

    public void addLast(int data){// method to add at the last
    Node NewNode= new Node(data);
    if(head==null){
        head= tail= NewNode;
        return;
    }
    tail.next= NewNode;
    tail= NewNode;
}

  public static void print(){// method to print linkedlist
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+ " --> ");
            temp= temp.next;
        }
        System.out.println("null");

 }

  public int iterativeSearch(int key){
    Node temp= head;
    int i= 0;

    while(temp != null){
        if(temp.data == key){//key is found
            return i;
        }
        temp= temp.next;
        i++;
    }
    return -1; //key not found
 }

  public static void main (String args[]){
    iterativesearch ll= new iterativesearch();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    print();
    System.out.println(ll.iterativeSearch(4));
    System.out.println(ll.iterativeSearch(10));
  }
}