public class Binarysearch{
    public static int BinarySearch(int array[], int key){
        int start= 0, end= array.length;
        while(start<= end){
            int mid= (start+end)/2;
            if(array[mid]== key){
                return mid;
            }
            if(array[mid]< key){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int array[]= {0, 2, 4, 6, 8, 10, 12, 14};
        int key= 10;

        System.out.println("Index for key is: "+ BinarySearch(array, key));
    }
    }