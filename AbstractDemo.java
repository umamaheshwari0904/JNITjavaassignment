abstract class Laptop
{
abstract void harddisk();
abstract void cost();
void charger()
{
System.out.println("charger are 45watts");
}
}

class Lenovo extends Laptop
{
void harddisk()
{
int h = 512;
System.out.println("harddisk of the lenvo laptop is "+h+ "gb");
}
void cost()
{
int c=499;
System.out.println("cost of the lenovo laptop is $"+c);
}
}

class AbstractDemo
{
public static void main(String args[])
{
Laptop v;

v=new Lenovo();
v.harddisk();
v.cost();
v.charger();
}
}

   