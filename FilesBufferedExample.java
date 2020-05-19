import java.io.* ;
class FilesBufferedExample{
public static void main(String args[]) throws IOException, FileNotFoundException{
FileInputStream fi= new FileInputStream("example.txt");
BufferedInputStream bi=new BufferedInputStream(fi);
int x=bi.read();
while(x!=-1){
System.out.print((char)x);
x=bi.read();
}
}
}