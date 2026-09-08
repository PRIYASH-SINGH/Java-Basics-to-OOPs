import java.util.*;

public class PROG4{
    public static void main(String args[]){
        int arr[]=new int[7]; 
        //intialized arrya of size 7 to store 7 days temp
        Scanner scan=new Scanner(System.in); 
        //intialized scanner to take input from user
        for(int i=0;i<7;i++) //for taking input
        {
            System.out.println("ENTER TEMPERATURE OF DAY "+i);
            arr[i]=scan.nextInt(); 
            //Taking input
        }   
        scan.close(); 
         //closing scanner  
        int Highest=arr[0]; //to store highest
        int Lowest=arr[0];  //to store lowest
        
        for(int i=0;i<7;i++) //for checking highest and lowest
        {
                if(arr[i]>Highest) //checks if current temp is greater than highest
                {
                Highest=arr[i]; //stores current temp in highest
                }
                if(arr[i]<Lowest) //checks if current temp is lower than lowest
                {
                Lowest=arr[i]; //stores current temp in lowest
                }
         }
        System.out.println("HIGHEST TEMP OF THE DAY : "+Highest); //prints highest temp
        System.out.println("LOWEST TEMP OF THE DAY  : "+Lowest); //prints lowest temp
         }}

