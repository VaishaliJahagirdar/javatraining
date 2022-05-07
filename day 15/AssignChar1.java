//1. WAP to copy the content of one file to another 
	//by using CHAR IO classes.
import java.io.*;
class DemoChar1 {
    public static void main(String[] args)throws Exception {
       
        FileReader fin;
        fin=new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\java training\\files\\test3.txt");
       
        FileWriter fout;
        fout=new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\java training\\files\\test7.txt");
        int x;
        System.out.println(fin.available());       
        do{
            x=fin.read();
            while((x=fin.readLine())!=null){
            System.out.println(x);
            fout.write();
        
              fin.close();
              }
        System.out.println("File Copied");
        
          }
        }
     }
        



