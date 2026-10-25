// linear search
  /*public class array {
    public static int linearsearch ( int number[], int key){
        for( int i=0; i<number.length; i++){
            if (number[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key= 20;
      int index = linearsearch(numbers, key);
      if (index==-1) {
        System.out.println (" not found ");
        
      }else{
        System.out.println("key is at index:" + index);
      }

        
    }
} */


                    // reverse an array 

 public class array {

  public static void reverse ( int numbers[]){
    int first = 0, last = numbers.length -1 ;
    while( first<last){
      int temp = numbers[first];
      numbers[first]= numbers[last];
      numbers[last] = temp;
      first++;
      last--;

    }
      
  }

  public static void main(String[] args) {
    int numbers[] = {1,2,3,4,5,6};
    reverse (numbers);
    for(int i=0; i < numbers.length; i++ ){
      
      System.out.print(numbers[i]+" ");

    }
     System.out.println();
  }
}


           // pairs in a array


  /*public class array{

  public static void printpairs( int numbers[] ){
  int  tp = 0;
    for( int i = 0; i<numbers.length; i++){
     
      int curent = numbers[i];
      for( int  j=i+1; j<numbers.length; j++){
        System.out.print("("+curent+","+numbers[j]+")");
        tp++;
      }
      System.out.println();
    }
    System.out.println("total pairs ="+tp);
    
  }



  public static void main ( String  args[] ){
       int numbers[] = {2,4,6,8,10};
       printpairs(numbers);
  }
}*/