import java.io.serializable;
import java.io.*;
class Student implements Serializable{
int id;
String name;
public Student(int id,String name);
this.id=id;
this.name=name;
}
}
class SerialableDemo
{
public static void main(String args[]) throws Exception
{
Student rahul=new Student(1023,"rahul");
FileOutputStream ft=new FileOutputStream("ex.txt");
ObjectOutputStream ot=new ObjectOutputSTream(ft);
ot.writeObject(rahul);
ot.close();

}
}
