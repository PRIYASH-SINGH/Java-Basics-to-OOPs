import java.util.*;
import java.util.stream.*;
public class Student {
    int id;
    String name;
    String department;
    int marks;
      public Student(int id,String name,String department,int marks){
             this.id=id;
             this.name=name;
             this.department=department;
             this.marks=marks;
      }
      public int getID(){
        return id;}
      public String getName(){
        return name;}
      public String getDepartment(){
        return department;}
      public int getMarks(){
        return marks;}
     @Override 
     public String toString(){
            return id+" "+name+" "+department+" "+marks;}
      public static void main(String[]args){
         List<Student> students=new ArrayList<>();
        students.add(new Student(100,"Priyash", "CS", 95));
        students.add(new Student(200,"Yash", "CSE", 80)); 
        students.add(new Student(300,"Anshu", "CSE", 40));
        students.add(new Student(400,"Priya", "CS", 90));
        students.add(new Student(500,"Harsh", "IT", 80));
        students.add(new Student(600,"Dharamveer","CS",70));
        students.add(new Student(700,"Kavita","IT",95));
        students.add(new Student(800,"Rishu","IT",55));
        students.add(new Student(900,"Sakshi","CSE",90));
        students.add(new Student(1000,"Akash","IT",85));
    
        students.stream().forEach(System.out::println);
        students.stream().filter(s->s.getMarks() >=80).forEach(s->System.out.println(s.getName()+"-"+s.getMarks()));
        students.stream().map(Student::getName).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
        long count = students.stream().filter(s->s.getDepartment().equals("CSE")).count();
        students.stream().filter(s->s.getDepartment().equals("CSE")).forEach(System.out::println);
        System.out.println("TOTAL CSE STUDENTS :"+count);  
        Optional<Student> topstudent=students.stream().max(Comparator.comparing(Student::getMarks));
        System.out.println("HIGHEST MARKS : "+topstudent);
        Optional<Student> worststudent=students.stream().min(Comparator.comparing(Student::getMarks));
        System.out.println("LOWEST MARKS : "+ worststudent);
        double avgMarks = students.stream().mapToInt(Student::getMarks).average().orElse(0);
        System.out.println("Average Marks = " + avgMarks);
        students.stream().map(Student::getDepartment).distinct().forEach(System.out::println);
        boolean Above90=students.stream().anyMatch(s->s.getMarks() >=90);
        System.out.println("ABOVE 90 :"+Above90);
        boolean allPassed=students.stream().allMatch(s->s.getMarks() >=40);
        System.out.println("ALL PASSED : "+allPassed); 
        Optional<Student> firstStudent = students.stream().findFirst();
        System.out.println("TASK 13 FIRST STUDENT:"+firstStudent.get()); 
        List<Student> above75 = students.stream().filter(s -> s.getMarks() > 75).collect(Collectors.toList()); 
        System.out.println("TASK 14 : "+above75);
        int TotalMArks=students.stream().mapToInt(Student::getMarks).reduce(0,Integer::sum);
        System.out.println("TASK 15 TOTAL MARKS :"+TotalMArks);
      }   
}