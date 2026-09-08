public class Patterns2
 {
    public static void main(String args[])
    {
     for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(i==1 || i==5 || j==1 || j==5){
                System.out.print("*");
            }
            else { System.out.print(" ");
            }
       }
       System.out.println();
      }
   }
}

 /* for(int i=1;i<=5;i++) 
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j); // change to i for printing 1 22 333 4444 55555 
            }                        // change to j for 1 12 123 1234 12345
            System.out.println();
        }
   }

      int count =1;
      for(int i=1;i<=4;i++)
        {
        for(int j=1;j<=i;j++)
            {
            System.out.print(count+" ");
            count ++;
        }
        System.out.println(); // 1 23 456 78910
      }*/
