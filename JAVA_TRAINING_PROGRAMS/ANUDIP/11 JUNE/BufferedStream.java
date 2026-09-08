import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class BufferedStream {
    public static void main(String[] args){
        try{
            FileOutputStream fout =new FileOutputStream("testBuffer.txt");//byte array stream 
            BufferedOutputStream bout =new BufferedOutputStream(fout);// Bufferd output stream
            FileInputStream fin=new FileInputStream("testBuffer.txt");//byte array stream
            BufferedInputStream bin =new BufferedInputStream(fin);//Bufferd input stream
            String s="WRITING THIS DATA FROM VS CODE...";
            byte b[]=s.getBytes();//converts string to byte array
            bout.write(b);//writes byte array to file
            bout.close();//close the output stream
            fin.close();//close the input stream
            fout.close();//close the output stream
        System.out.println("SUCCESSFUL WRITTEN DATA TO FILE");
            int i=0;//it is used to store the data from the file
            while((i=bin.read())!=-1)//reads data from the file
            {
               System.out.print((char)i); //prints the data from the file
               
            }
            //Sequencinputstream
            FileInputStream fin1=new FileInputStream("testBuffer.txt");//
            FileInputStream fin2=new FileInputStream("testBuffer.txt");//
            SequenceInputStream sin=new SequenceInputStream(fin1,fin2);
            int j=0;
            while((j=sin.read())!=-1)
            {
                System.out.print((char)j);
            }
            sin.close();
            fin1.close();
            fin2.close();
            bin.close();
    }catch(Exception e){
        System.out.println(e);
    }

    }
    
}
