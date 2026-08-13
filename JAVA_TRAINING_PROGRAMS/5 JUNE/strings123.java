public class strings123 {
    public static void main(String args[]) {
        String s4 = new String("String"); // error if class name is String
        String s1 = "String"; // naming class same as a data type
                              // is shadowwing

        char ch[] = { 'x', 'y', 'a', 'b' };
        String s2 = new String(ch);
        // java.lang.String s2=new java.lang.String(ch); // if class name "String"
        // this will only work in that case not String s=" ";
        /// java.lang.String s1= "String";
        // _got_assigned_string_literal_to_s1
        // jvm checks string constant pool area for existing string objects.
        // all these string values are stored in a heap
        System.out.println(s1 + " " + s2 + " " + s4);

        // CONCATENATION : only use + operator for concatention
        System.out.println(s1 + s2);
        System.out.println(7 + 8 + 10 + s1 + " " + 30 + 40 + s2);
        // if + b/w integer its sum
        // if + b/w integer + string = int converted to string

        // .concat("String to cocatenatee") its a in built func
        String s3 = "BYE";
        s3.concat("WORLD!");
        System.out.println(s3); // it will print BYE as string is immutable
        s3 = s3.concat("WORLD"); // this will print concatenation as reference var
        System.out.println(s3);

        System.out.println(s1.equals(s2)); // returns false 
        // string obj may be different but their content should be identical
        // case should be same to
        
        //if want to ignore the cases : .equalsIgnoreCase(argument)
        String s5="XYAB";
        System.out.println(s2.equalsIgnoreCase(s5)); //returns true


        // == refers to same objes , returns ture if both objescts are same 
        System.out.println(s2==s5);
        System.out.println(s1==s4); // false 
        s1=s4;
        System.out.println(s1==s4); //true

        // .compareTo , compare the first letter of both the strings
        // if same it return 0 , if s1<s2 
        // (letter of s1 comes first than s2 in alpha order)
        //  it return -ve value 
        //  if s1>s2 it return +ve value 
        System.out.println(s1.compareTo(s2));    
        //  it will returns the difference of their ascii values
        
    
        
    }

}
