package firstpackage;
import secondpackage.Calculator;
import thirdpackage.ODDEVEN;
public class Testclass {
    public static void main(String args[]){
        Calculator c=new Calculator();
        c.sum(5,10);
        c.diff(5,10);
        c.prod(5,10);
        c.div(5,10);
        ODDEVEN o=new ODDEVEN();
        

        
    }

}
