import java.io.*;
class FilesExample{
public static void main(String args[]) throws IOException, FileNotFoundException{
FileOutputStream ft= new FileOutputStream("example.txt");
String s="welcome to file concept";
byte b[]=s.getBytes(); //byte can store info
ft.write(b);



}
}