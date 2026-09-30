public class Linkedlist{
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

    public void addFirst(int data){// method to insert at beginning
     Node newNode= new Node(data);
     size++;
     if(head == null){
        head = tail = newNode;
        return;
     }
     newNode.next= head;
     head= newNode;

    }


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
    
    public void addInMiddle(int idx, int data){// method to add in the middle
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp= head;
        int i=0;
        while(i<idx-1){
            temp= temp.next;
            i++;
        }
         newNode.next = temp.next; 
         temp.next = newNode;   
    }

    
    public static void print(){// method to print linkedlist
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+ " --> ");
            temp= temp.next;
        }
        System.out.println("null");

    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }else if(size== 1){
            int val= head.data;
            head=tail=null;
            size= 0;
            return val;
        }
        int val= head.data;
        head= head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;

        }else if(size==1){
            int val= head.data;
            head=tail=null;
            size= 0;
            return val;
        }
        Node prev= head;
        for(int i=0; i<size-2; i++){
            prev= prev.next;
        }
        int val= prev.next.data;
        prev.next= null;
        tail= prev;
        size--;
        return val;

    }

    public static void main(String args[]){// main function
        Linkedlist ll= new Linkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        print();
        ll.addLast(3);
        ll.addLast(4);
        print();
        ll.addInMiddle(2, 5);
        print();// can directly call static function in other static function 
        System.out.println("Size of our Linked list is:"+ size);
        ll.removeFirst();
        print();
        ll.removeLast();
        print();
        System.out.println("Size of our Linked list is:"+ size);
    }
}