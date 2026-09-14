public class array{
    public static void update(int arr[]){ 
        for(int i=0; i<arr.length; i++){
            arr[i]= arr[i]+1;
           
        }
    }
    public static void main(String args[]){
        int arr[]= {98, 97, 88};
        System.out.print("Our initial array was: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.print("Our Updated array is: ");     
        update(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
}