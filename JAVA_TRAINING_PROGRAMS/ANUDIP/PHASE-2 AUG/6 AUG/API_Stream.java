import java.util.Arrays;
import java.util.List; 
//why not util.*; becase it will only check for list and array 
// function only not whole program

public class API_Stream {
    public static void main(String[] args){
        List<String> names = Arrays.asList("ABC", "BCD","ACD","PRIYASH");
        //asList method use to create a list
        //stream()method use to create a stream
        //filter()method use to filter the elements
        //forEach()method use to print the elements
        List<Integer> rollno=Arrays.asList(1,2,3,5,2,4,6,4);
        //print the names start with AB
        names.stream().filter(n -> n.startsWith("AB")).forEach(System.out::println);
        //printing roll no larger than 3
        rollno.stream().filter(n->n>3).forEach(System.out::println);
        //convert into lowercase of names
        names.stream().map(String::toLowerCase).forEach(System.out::println);
        //how many duplicates exists in rollno list
        //duplicate functon
        //filter out the duplicates
       long duplicateCount= rollno.stream().filter(n->java.util.Collections.frequency(rollno,n)>1).count();
       System.out.println("Duplicates="+duplicateCount);
       //distinct()function use to print the distinct elements
       rollno.stream().distinct().forEach(s->System.out.println("Distinct elements="+s));
       //sorted function it sorts elements in ascending order
       //what if i want to print both ascending and descending in one stream mapping : not possible :( 
       //sort descending order
       rollno.stream().sorted(java.util.Collections.reverseOrder()).distinct().forEach(System.out::println);
       //map and then filter
       names.stream().map(String::toLowerCase).filter(n->n.startsWith("a")).forEach(System.out::println);
       //collect()function use to collect the elements
       List<String> newNames=names.stream().map(String::toLowerCase).collect(java.util.stream.Collectors.toList());
       System.out.println(newNames);
       //using skip function
       names.stream().skip(2).forEach(System.out::println);
       
    }
}
