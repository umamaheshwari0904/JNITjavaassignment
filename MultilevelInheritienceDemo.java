class Phones
{
void speed()
{
System.out.println("speed of the phones is measured in ghz");
}
}

class Nokia extends Phones
{
void speed()
{
System.out.println("Speed of the nokia phone is 2.4ghz");
}
}
class Iphone extends Nokia
{
void speed()
{
System.out.println("Iphone speed also 2.4ghz");
}
}
class MultilevelInheritienceDemo
{
public static void main(String args[])
{
Phones p=new Phones();
p.speed();

p=new Nokia();
p.speed();

p=new Iphone();
p.speed();
}
}

