public class Calculator{
    //DEMONSTRATING METHOD OVERLOADING
     //INSTEAD OF VOID USING INT,DOUBLE FOR RETURNING SOME VALUE
   public int add(int a,int b){  
        return a+b;
         }
   public int add(int a,int b,int c){
        return a+b+c;
   }
   public double add(double a,double b){
         return a+b;
    }
    public static void main(String args[]){
        Calculator cal=new Calculator();
        System.out.println("CALLING FIRST ADD FOR TWO INTEGER SUM : "+cal.add(5,2));
        System.out.println("CALLING SECOND ADD FOR three INTEGER SUM : "+cal.add(5,6,9));
        System.out.println("CALLING THIRD ADD FOR TWO DOUBLES SUM : "+cal.add(5.22d,6.22d));
    }
}