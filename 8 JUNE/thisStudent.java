

public class thisStudent {
    //this keyword is used to refer to the current object
    //this can be used to refer to the instance variables of the current object
    int rollno;
    String name;
    float fee;
    thisStudent(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println("Roll no: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Fee: "+fee);
    }

        public static void main(String[] args){
            thisStudent s1 = new thisStudent(100,"Priyash",127019f);
            thisStudent s2 = new thisStudent(101,"Priyansh",27019f);
            s1.display();
            s2.display();
           // A a=new A(10);
            
        }
        // this to invoke current class method 
        //compiler automatically adds this keyword to invoke current class method
        //to invoke a constructor from another constructor

      /*  class A{
            A(){ // this calling constructor of same class
                System.out.println("hello A");}
            }
            A(int x){
                this(); // calling constructor of same class
                System.out.println(x);
            }} */ //depending upon constructor this() is called

            
}
    

