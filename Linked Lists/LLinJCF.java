//Creating Linked List using Java Frameworks
import java.util.LinkedList;
public class LLinJCF{
    public static void main(String args[]){
        //create Linked List
        LinkedList <Integer> ll= new LinkedList<>();

        // add 
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);

        // print the list
        System.out.println(ll);

        // remove
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);

    }

}