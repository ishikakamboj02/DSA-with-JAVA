public class subarray{
    public static void printSubarrays(int array[]){
        int total_subarrays= 0;
        for(int i=0; i<array.length; i++){
            int start= i;// initial value of subarray
            for(int j=i; j<array.length; j++){
                int end= j;// last value of subarray
                for(int k= start; k<= end; k++){
                    System.out.println(array[k]+ " ");// print subarray
                    total_subarrays++;
                }
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total subarrays are: "+ total_subarrays);
    }
     public static void main (String args[]){
        int array[]= {10, 12, 14, 16, 18, 20};
        printSubarrays(array);
     }
}