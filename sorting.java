
               // bubble Sort

   /*public class sorting {
  public static void bubblesort(int arr[]){
    int swap=0;
    for( int turn = 0; turn<arr.length-1; turn++ ){
       for( int j=0; j<arr.length-1-turn; j++){
        if( arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1]=temp ;
          swap++;
        }
       }
       if( swap==0){
        break;
           }
    }
  }
   public static void printArr(int arr[]){
     for( int i=0; i<arr.length; i++ ){
        System.out.print(arr[i]+" ");
     }
     System.out.println();
   }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubblesort(arr);
        printArr(arr);
    }
    
}*/


public class sorting {

 public static void selectionSort( int arr[]){
   for( int i=0; i<arr.length-1; i++){
    int minPos = i;
    for( int j=i+1; j<arr.length; j++){
       if(arr[minPos]>arr[j]){
        minPos = j;
       }
      int temp=arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;
    }
   }

 }
  public static void printArr( int arr[]){
    for(int i= 0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
   }
   System.out.println();
  }
public static void main(String[] args) {
  int arr[] = {5,4,1,3,2};
  selectionSort(arr);
  printArr(arr);
 }
}
