public class recursivesearch{
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

    public void addLast(int data){
        Node NewNode= new Node(data);
        if(head==null){
            head= tail= NewNode;
            return;
        }
        tail.next= NewNode;
        tail= NewNode;
    }

    public void print(){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data + " --> ");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx= helper(head.next, key);
        if(idx== -1){
            return -1;
        }
        return idx+1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }
    public static void main (String args[]){
      recursivesearch ll= new recursivesearch();
      ll.addLast(1);
      ll.addLast(2);
      ll.addLast(3);
      ll.addLast(4);
      ll.addLast(5);
      ll.addLast(6);
      ll.print();
      System.out.println(ll.recursiveSearch(4));
      System.out.println(ll.recursiveSearch(10));
    }
}