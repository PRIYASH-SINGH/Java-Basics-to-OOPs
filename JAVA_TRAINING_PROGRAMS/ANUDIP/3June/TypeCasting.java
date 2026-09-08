public class TypeCasting {
    public static void main (String args[]){
        byte a=10;
        byte b=120;
        byte c=(byte)(a+b); //Type casting explicit for conversion of higher data type values to lower datatypes (narrowing)
        System.out.println("EXPLICIT TYPE CASTING :"+(a+b)+"->"+c);// value printed will be 130=-128=-127=-126(127+3):as -128 to 127 for byte
        int d= a+b;
        System.out.println("IMLICIT TYPE CASTING"+d);//Implicit type casting as going from lower datatype to higher data type (widening)
    }
}