interface Electronics{
void memory();
void cost();
}
abstract class Laptop implements Electronics{
void keyboard(){
System.out.println("All the laptop have keywboards");
}

}
abstract class Mobiles implements Electronics{
void simslot(){
System.out.println("All the mobiles has slot for sim");
}
}
class Dell extends Laptop{
public void memory(){
System.out.println("Dell laptop memory varies from  32gb to 256 gb");
}
public void cost(){
System.out.println("Dell laptop cost varies from 299$ to 999$");
}
}
class Lenovo extends Laptop{
public void memory()
{
System.out.println(" Lenovo laptop memory varies from  16gb to 256 gb");
}
public void cost(){
System.out.println("Lenovo laptop cost varies from 259$ to 899$");
}
}
class Iphone extends Mobiles{
public void memory(){
System.out.println("Iphone memory varies from  3gb to 64gb");
}
public void cost(){
System.out.println("Iphone cost varies from 99$ to 1299$");
}
}
class Samsung extends Mobiles{
public void memory(){
System.out.println("Samsungphone  memory varies from  4gb to 512gb");
}
public void cost(){
System.out.println("Samsung phone cost varies from 199$ to 1399$");
}
}
class Interface{
public static void main(String args[]){

Laptop l=new Dell();
l.memory();
l.keyboard();
l.cost();
l=new Lenovo();
l.keyboard();
l.memory();
l.cost();
Mobiles m=new Iphone();
m.memory();
m.cost();
m.simslot();
m=new Samsung();
m.memory();
m.cost();
m.simslot();
}
}
