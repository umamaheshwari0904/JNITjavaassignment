class School
{
int nos=300;
School()
{
System.out.println("default constructor.");
}
}
class ConstructorDemo
{
public static void main (String ar[]) 
{
School obj = new School();
System.out.println(obj.nos);
}
}