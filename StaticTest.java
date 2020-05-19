

class Oracle{
static
{
System.out.println("oracle static block");
}
Oracle()
{
System.out.println("oracle constructor");
}
}
class Mysql{
static
{
System.out.println("myql static block");
}
Mysql()
{
System.out.println("mysqlConstrutor");
}

}
class StaticTest{
public static void main(String args[])throws Exception
{
System.out.println("main block");
Class c=Class.forName("Oracle");
System.out.println(c);

}
}
