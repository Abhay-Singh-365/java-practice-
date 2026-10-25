//  subarray 

  /*public class subarrays {
    public static void printsubarray( int numbers[]){
        int ts=0;
        for( int i=0; i<numbers.length; i++){
            int start = i;
            for( int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
       System.out.print("total sub ="+ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printsubarray(numbers);
        }
}  */

           // max subarray;!

   /*public class subarrays{

public static void maxsubarraysum( int numbers[]){
    int currsum =0;
    int maxsum = Integer.MIN_VALUE;
  for( int i=0; i<numbers.length; i++){
      int start = i;
      for( int j= i; j<numbers.length; j++){
        int end = j;
        currsum = 0;
        for( int k= start; k<=end; k++){
            currsum += numbers[k];
        }
        System.out.println(currsum);
        if(maxsum<currsum){
            maxsum = currsum;
        }
      }
  }
  System.out.println("maxsum="+maxsum);
}

    public static void main( String args[]){
int numbers[] = {2,4,6,8,10};
    maxsubarraysum(numbers);
    }

}*/



public class subarrays {

    public static void maxsubarraysum( int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];
        prefix[0]=numbers[0];
        for( int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1]+numbers[i];
        }
        for( int i=0; i<numbers.length; i++){
            int start = i;
            for( int j=i; j<numbers.length; j++){
                int end = j;
                currsum = start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }

        }
        System.out.println("maxsum="+maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxsubarraysum(numbers);
    }
}

