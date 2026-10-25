/* 
public class Qn {
    public static int getLargest( int numbers[]){
      int largest = Integer.MIN_VALUE;
        for ( int i=0; i<numbers.length; i++){
            if( largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
      
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,9,3,5};
        System.out.println("largest value is:"+getLargest(numbers));
     
}
    
}
*/


public class Qn {
    public static int getLargest( int numbers[]){
      int largest = Integer.MAX_VALUE;
        for ( int i=0; i< numbers.length; i++){
            if( largest>numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
      
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,12,30,50};
        System.out.println("largest value is:"+getLargest(numbers));
     
}
    
}

