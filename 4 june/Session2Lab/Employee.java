public class Employee{
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;
    //int age = 35.5;
    // shows loosy conversion error 
    //as higher datatype to lower datatype
    public static void main(String args[]){
        double d=35.5;
        int age=(int) d;
        System.out.print("Successfully started")
;
    } 


}