class Display
{
public synchronized void wish(String name)
{
for(int i=1; i<=10; i++)
{
System.out.println("good morning");
try{
Thread.sleep(1000);
System.out.println(name);
}catch(Exception e){
e.printStackTrace();
}
}
}
}

class MyThread extends Thread
{
Display d;
String name;
MyThread(Display d,String name)
{
this.d=d;
this.name=name;
}
public void run()
{
d.wish(name);
}
}
class SynchronizedDemo
{
public static void main(String args[])
{
Display d=new Display();
MyThread t1=new MyThread(d,"rahul");
MyThread t2=new MyThread(d,"shiva");
t1.start();
t2.start();
}
}
