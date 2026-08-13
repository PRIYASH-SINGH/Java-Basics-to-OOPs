public class substring {
        public static void main(String[] args) {
        String s="Priyash Singh";
        System.out.println(s.substring(0,4)); 
        // return char from index 0 
        // to index 4(not including index 4)
        System.out.println(s.substring(4)); 
        //return char from index 4 to end 

        //concat : already know that from strings123
        System.out.println(s.substring(0,4).concat(s.substring(4))); 
        
        //case
        //convert string to lowercase 
        System.out.println(s.toLowerCase());
        //convert string to uppercase
        System.out.println(s.toUpperCase());    
        

        //trim : removes leading and trailing spaces
        // trim removes white spaces
        String s2="  Hello World  ";
        System.out.println(s2.trim());
        System.out.println(s.length());    

        //startsWith
        //check if string starts with given string 
        System.out.println(s.startsWith("Pri"));    
        //endsWith
        //check if string ends with given string 
        System.out.println(s.endsWith("ing"));

        //contains
        //check if string contains given string 
        System.out.println(s.contains("yash"));    

        //length
        //return length of string 
        System.out.println(s.length());    

        //charAt
        //return char at given index 
        System.out.println(s.charAt(0));    

        //indexOf
        //return index of first occurrence of given string 
        System.out.println(s.indexOf("yash"));   
        
        //lastIndexOf
        //return index of last occurrence of given string 
        System.out.println(s.lastIndexOf("yash"));    
        //replace
        //replace given string with another string 
        System.out.println(s.replace("yash","raj"));    

        //isEmpty
        //check if string is empty 
        System.out.println(s.isEmpty());    

        //String value of 
        //convert any data type to string 
        int num=10;
        System.out.println(String.valueOf(num));    
        System.out.println(s+10);

        //String to int
        String s1="10";
        int num1=Integer.parseInt(s1);
        System.out.println(num1);
        


        }
}
