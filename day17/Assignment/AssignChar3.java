 /*WAP to ask user to input folder path and count
	how many file and folders present in that
	folder*/
   import java.io.*;
class AssignChar3 {
    public static void main (String[] args) {
        
    image = "";
        byte[] arr = getBytes();
        ByteArrayInputStream ob;
        ob = new ByteArrayInputStream(arr);
        int x;
        do {
            x = ob.read();
            System.out.print((char) x);

        } while (x != -1);
        System.out.println();
    }
}
