class Display
{
public static synchronized void wish(String name)//synchronized(this)
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

String name;
MyThread(String name)
{
this.name=name;
}
public void run()
{
Display.wish(name);
}
}
class StaticSynchronizedDemo
{
public static void main(String args[])
{

MyThread t1=new MyThread("rahul");
MyThread t2=new MyThread("shiva");
t1.start();
t2.start();
}
}
