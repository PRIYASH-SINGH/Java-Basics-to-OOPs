public class arrays1 {
    public static void main(String args[]){
        int arr[]; //declaring an array 
        arr=new int[5]; //allocating memory for 5 integers of size 4 bytes each

        int arr2[]=new int[5]; //allocates memory for 5 integers of size 4 bytes each
       //size of int =4 bytes
       //size of int array of size 5 = 5*4 = 20 bytes
          
        arr[0]=1; //harcoded value , assigned during compile time 
        int arr3[]={10,20,30,40,50};//array initialized with values

        //user defined values dynamically assigned 
        int count=1;
        for(int i=1;i<arr.length;i++){
            arr[i]=count++;
        }
     
        //traversing or iterating
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");    
        }
     //enhanced for loop or for each loop for traversing
        for(int i:arr){
            System.out.print(i+" ");    
        }

        //print in reverse order
        for(int i=arr3.length-1;i>=0;i--){
            System.out.print(arr3[i]+"rev");    

            //2D array simple declaration and initialization
            int arr4[][]={{1,2,3},{4,5,6},{7,8,9}}; 
            int count2=1;
           for( i=0;i<arr4.length;i++){
               for(int j=0;j<arr4[i].length;j++){
              arr4[i][j]=count2++;
                }
            System.out.println();
            }

        }    
    } 
}
