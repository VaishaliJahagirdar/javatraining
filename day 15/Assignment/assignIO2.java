import java.io.*;
class assignIO2{
public static void main(String args[]){

int count=0;
String s;
StringBuffer sb;
        sb=new StringBuffer();

FileInputStream fin;
        fin=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\java training\\files\\test1.txt");
        int x;
        x=fin.read();
        
while((s=x) != null){
String words[]=x.split("");
count=count+words.length;
}
System.out.println("number of words present in given file is"+count);
fin.close();
}
}