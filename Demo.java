
class Demo implements Runnable
{
public void run()
{
for(int i=1 ;i<=20;i++)
{
System.out.println("i="+i);
}
}
public static void main(String args[])
{
Demo d=new Demo();
Thread t=new Thread(d);
t.start();
for(int x=1; x<=20 ;x++)
{
System.out.println("x="+x);
}
}
}
