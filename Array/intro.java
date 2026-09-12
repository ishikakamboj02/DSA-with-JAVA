import java.util.*;
public class intro{
    public static void main (String args[]){
        int array[]= new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Physics marks: ");
        array[0]= sc.nextInt();
        System.out.print("Enter your Chemistry marks: ");
        array[1]= sc.nextInt();
        System.out.print("Enter your Maths marks: ");
        array[2]= sc.nextInt();
        System.out.println("Physics marks: "+ array[0]);
        System.out.println("Chemistry marks: "+ array[1]);
        System.out.println("Maths marks: "+ array[2]);
        System.out.println("Length of our Array is " + array.length);

    }
}