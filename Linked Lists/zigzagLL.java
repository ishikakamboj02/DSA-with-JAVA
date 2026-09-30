public class zigzagLL{
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
        Node newNode= new Node(data);
        if(head == null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }

    public static void print(){
        Node temp= head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp= temp.next;
        }
        System.out.println("null");
    }


    public void zigZag(){
        // find middle
        Node slow= head;
        Node fast= head;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        Node mid= slow;

        //reverse 2nd half LL
        Node curr= mid.next;
        mid.next= null;
        Node prev= null;
        Node next;

        while(curr != null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }

        Node left= head;
        Node right= prev;
        Node nextL, nextR;

        //alternate merge- zig zag merge
        while(left != null && right != null){
            nextL= left.next;
            left.next= right;
            nextR= right.next;
            right.next= nextL;

            left= nextL;
            right= nextR;

        }      
    }

    public static void main (String args[]){
        zigzagLL ll= new zigzagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        print();
        System.out.print("Our Zig Zag LL is: ");
        ll.zigZag();
        print();
    }
}