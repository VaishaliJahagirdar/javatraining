// Buffered IO
import java.io.*;
class Demo10
{
public static void main(String[] args)throws Exception 
{
FileInputStream fin;
fin=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\java training\\files\\images.png");
BufferedInputStream bin;
bin=new BufferedInputStream(fin);
FileOutputStream fout;
fout=new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\java training\\files\\vaishu.png");
BufferedOutputStream bout;
bout=new BufferedOutputStream(fout);
int x;
System.out.println(fin.available());
do{
x=bin.read();
if(x!=-1)
{
bout.write(x);
}
}
while(x!=-1);
bin.close();
bout.close();
System.out.println(" File Copied");
}
}