public class checkpalindrome{
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

    public Node findMid(Node head){
        Node slow= head;
        Node fast= head;

        while(fast != null && fast.next != null){
            slow= slow.next; //+1
            fast= fast.next.next; //+2
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next != null){
            return true;
        }
        // find the middle node
        Node midNode = findMid(head);

        //reverse 2nd half
        Node prev= null;
        Node curr= midNode;
        Node next;
        while(curr != null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= prev;
        }

        Node right= prev; //right half's head
        Node left= head;

        // check left half equal to right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]){// main function
        checkpalindrome ll= new checkpalindrome();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        System.out.print("Our Linked List is:- ");
        print();
        System.out.println(ll.checkPalindrome());
    }
}