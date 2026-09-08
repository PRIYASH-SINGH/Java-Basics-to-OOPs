import java.util.*;

public class Arrays2 {
    public static void main(String args[]){
        int [][] arr =new int[3][];
        arr[0]=new int[1];
        arr[1]=new int[2];
        arr[2]=new int[3];

        // Storing user defined values
        int count=1;
        for(int i=0;i<arr.length;i++){ //it traverses rows
            for(int j=0;j<arr[i].length;j++){ //it traverses columns
                arr[i][j]=count++;
            }
        }
        //TRAVERSING THE ARRAY
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");//print keeps in same line
            }
            System.out.println();
        }

        // Printing the array using enhanced for loop (for-each)
       /* for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " "); // print keeps in the same line
            }
            System.out.println(); // println breaks the line
        }
    }*/

        //Taking n input from user for 1D array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int n=sc.nextInt();

        int [] [] arr1=new int [n][];

        //taking inputs in arr1
        for(int i=0;i<n;i++){
            System.out.println("Enter number of elements in row "+i);
            int m=sc.nextInt();
            arr1[i]=new int[m];
            for(int j=0;j<m;j++){
                System.out.println("Enter element "+j+" of row "+i);
                arr1[i][j]=sc.nextInt();
            }
        }

        //printing arr1
        for(int i=0;i<n;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }


    }
}