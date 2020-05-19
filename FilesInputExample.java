import java.io.*;
class FilesInputExample{
public static void main(String args[]) throws IOException, FileNotFoundException{
FileInputStream fi= new FileInputStream("example.txt");
int x=fi.read();

while(x!=-1){
System.out.print((char)x);
x=fi.read();
}
}
}