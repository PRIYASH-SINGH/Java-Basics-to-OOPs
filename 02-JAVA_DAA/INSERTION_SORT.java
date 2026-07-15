import java.util.*;

public class INSERTION_SORT {
    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
        System.out.print("WELCOME !!! THIS IS THE SORTING ALGORITHM\nTHIS WORKS ON THE PRINCIPLE OF TAKING FIRST ELEMENT AS SORTED\nTHEN COMPARING ELEMENTS ONE BY ONE TO THE SORTED ELEEMENT THEN PUTTING THEM LEFT OR RIGHT OF THE ALREADY SORTED ELEMENT:)\nENTER THE SIZE OF THE ARRAY >>> ");
        int n=scan.nextInt();        
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++){
            System.out.print("ENTER ANY VALUE AT INDEX "+i+" >>> ");
            arr[i]=scan.nextInt();
            
        }
        for(int i=1;i<=n-1;i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        } 
        System.out.print("INSERTION SORTED ARRAY IS >>> ");
        for(int i=0;i<=n-1;i++){
            System.out.print("["+arr[i]+"]");
        }
        System.out.println();
    }
}