import java.io.FileOutputStream;//for writing in file

public class Stream {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("testManual.txt",true);//to append data use true
            String s="\n Appending new data";//to append data in file use 
            byte b[]=s.getBytes();//convert string to byte array
            fout.write(b);//write byte array in file
            fout.write(65);//write byte in file
            fout.close();//close the file
            System.out.println("Successfully written");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}