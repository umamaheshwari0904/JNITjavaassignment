abstract class Laptop
{
abstract void memory(int m);
abstract void cost(int c);
void charger()
{
System.out.println("this laptop comes with charger");
}
}
class Dell extends Laptop
{
void memory(int m)
{
System.out.println("minimum memory for dell laptop is "+m+"gb");
}
void cost(int c)
{
System.out.println("starting cost of dell laptop is $"+c);
}
}
class Lenovo extends Laptop
{
void memory(int m)
{
System.out.println("minimum memory for Lenovo laptop is "+m+"gb");
}
void cost(int c)
{
System.out.println("starting cost of Lenovo laptop is $"+c);
}
}
class AbstractOverloadingDemo
{
public static void main(String args[])
{
Laptop l;
l=new Dell();
l.memory(512);
l.cost(399);
l=new Lenovo();
l.memory(256);
l.cost(299);
}
}
