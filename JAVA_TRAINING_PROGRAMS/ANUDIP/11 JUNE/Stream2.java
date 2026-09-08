import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Stream2 {
    public static void main(String[] args){
        try{
            FileOutputStream fout =new FileOutputStream("testManual.txt");
            FileInputStream fin=new FileInputStream("testManual.txt");
            String s="WRITING THIS DATA FROM VS CODE...";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
        System.out.println("SUCCESSFUL WRITTEN DATA TO FILE");
            System.out.println("READING DATA FROM FILE:");
            int i=0;
            while((i=fin.read())!=-1)
            {
               System.out.print((char)i); 
               
            }
            fin.close();
    }catch(Exception e){
        System.out.println(e);
    }

    }
    
}
