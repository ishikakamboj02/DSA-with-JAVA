public class Linearsearch{
    public static int LinearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]== key){
                return i;
            }

        }
        return -1;

    }
    public static void main(String args[]){
        int arr[]= {2, 8, 4, 9, 10, 23, 6};
        int key= 10;
        int index= LinearSearch(arr,key);

        if(index== -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found at index: "+ index);
        }       
         }
    }

