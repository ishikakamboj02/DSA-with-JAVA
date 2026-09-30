public class findremoventh{
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


    //iterative approach
    public void deleteNthfromEnd(int n){
        //calculate size first
        int size= 0;
        Node temp= head;
        while(temp != null){
            temp= temp.next;
            size ++;
        }
        if(n == size){// delete first node or remove first 
            head= head.next;
            return;
        }

        //to delete nth
        int i= 1;
        int iToFind= size-n;
        Node prev= head;
        while(i < iToFind){// node previous to deleted node
            prev= prev.next;
            i++;
        }
        prev.next= prev.next.next;
        
    }


    public static void main(String args[]){// main function
        findremoventh ll= new findremoventh();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        print();
        ll.deleteNthfromEnd(3);
        print();
        ll.deleteNthfromEnd(1);
        print(); 
        
    }
}

