public class FourPillar {
   
    //instance variables
    int rollno;//instance variable
    String name;//instance variable
    //instance method 
    /*void display(){

        System.out.println(rollno+" "+name);//accessing instance variable
    }*/

    static int classcode=100;//static variable

    public static void main(String args[]){
        FourPillar s1 =new FourPillar();//object 1 with default value 0 null 
        //as there is one instance var with type int and one instance var with type String 
        FourPillar s2=new FourPillar();//object 2 with default value 0 null
        //each s1 and s2 
      //  s1.display();//calling method for s1 
        //this display method shows the default value of instance variable 
       // s2.display();//calling method for s2
        //this display method shows the default value of instance variable
        s1.rollno=10;//setting value for rollno by user
        s1.name="priyash";//setting value for name by user
        s2.rollno=20;//setting value for rollno by user 
        s2.name="shubham";//setting value for name by user 
        System.out.println(s1.rollno+" "+s1.name);
        System.out.println(s2.rollno+" "+s2.name);
        // static variable is accessed by class name
        System.out.println(FourPillar.classcode+" "+s1.name+" "+s2.name);

        //Accessing static vs instance variable
        System.out.println(s1.rollno); //instance variable can be accessed by object name 
        System.out.println(FourPillar.classcode); //static variable can be accessed by class name 
        
    }
    
}
