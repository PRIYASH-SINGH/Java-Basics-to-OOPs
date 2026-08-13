public class strings223 {
    public static void main(String args[]){
        String s1="hello";
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i)); 
            // prints each character at index in new line
        }

        // StringBuffer : makes string mutable
        //only one thread can access StringBuffer one at a time being sync
        //its faster and consumes less memory then String class
        // no overriden equals method
        // if two StringBuffer have same content they are not equal 
        //unless we compare using .toString().equals()
    
        StringBuffer sb=new StringBuffer("Priyash ");
        sb.append("Singh");//changes to original content of sb as stringBuffer is mutable 
        System.out.println(sb);  // now we can print the content of sb  
        
        // .insert(index,string)
        sb.insert(0,"Mr.");//inserts the content 
        // stringBuffer in the index 
        //specified as the parameter 
        System.out.println(sb); 
        
        //.reverse()
        sb.reverse();
        System.out.println(sb);    

        //.delete(beginindex,endindex)
        sb.delete(0,3); // used with indices to delete the content 
        // of stringbuffer in the index 
        //specified as the parameter 
        System.out.println(sb);    

        //.capacity()
        System.out.println(sb.capacity());// this will return the 
        // default  capacity of string buffer    

    //ensure capacity()
    sb.ensureCapacity(20);// its used to set capacity of string buffer 
    System.out.println(sb.capacity());    
        

    }
    
}
