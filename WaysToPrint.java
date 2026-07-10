class WaysToPrint {
    public static void main(String[] args) // a main method is must 
    {
        WaysToPrint obj = new WaysToPrint(); // an instance can not be called without object
        System.out.println(obj.OneWayToPrint());// obj gives space for method to print its output
    }
    
    String OneWayToPrint (){
        return "Hello,World!";
    }

}
