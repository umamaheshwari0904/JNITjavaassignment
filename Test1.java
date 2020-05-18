class Test1 extends Thread
{
public void run(){
for(int i=1;i<=20;i++)
{
System.out.println("i=" +i);
}
}
public static void main(String args[])
{
Test1 t=new Test1();
t.start();
for(int x=1;x<=20; x++)
{
System.out.println("x=" +x);
}
}
}
