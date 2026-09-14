public class pairs_array{
    public static void printPairs(int array[]){
        int total_pairs= 0;
        for(int i=0; i< array.length; i++){
            int current= array[i];
            for(int j= i+1; j< array.length; j++){
                System.out.println("( "+ current+ " , "+ array[j]+ " )");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are: "+ total_pairs);

    }
    public static void main (String args[]){
        int array[]= {2, 4, 6, 8, 10};
        printPairs(array);
    }
}