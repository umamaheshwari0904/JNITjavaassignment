import java.io.*;
class DeserializeDemo{
public static void main(String args[]) throws Exception
{
FileInputStream ft=new FileInputStream("ex.txt");
ObjectInputStream in= new ObjectInputStream(ft);
Object o=in.readObject();
Student rahul=(Student)o;
System.out.println(rahul.id);
System.out.println(rahul.name);
}
}
