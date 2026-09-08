class BEAN{
    private String name;//private data member
    private int age;//private data member
    
    public void setName(String name){//setter method
        //why we use this.name = name? -> because name is already defined 
        // in the class as private data member and we are passing same name 
        // in the setter method
        this.name = name;
    }
    public void setAge(int age){//setter method
        this.age = age;
    }
    public String getName(){
        return name;//`getter method
    }
    public int getAge(){
        return age;//getter method
    }
}
public class Main{
    public static void main(String[] args){
        BEAN bean = new BEAN();
        bean.setName("Priyash");
        bean.setAge(21);
        System.out.println(bean.getName());
        System.out.println(bean.getAge());
    }
}