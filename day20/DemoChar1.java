import java.io.*;
public class DemoChar1 {
    public static void main(String[] args)throws Exception {
       
        FileReader fin;
        fin=new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\java training\\files\\download(1).jpg");
       
        FileWriter fout;
        fout=new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\java training\\files\\download1(2).jpg");
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
    