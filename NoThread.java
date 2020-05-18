class NoThread{
void show()
{
for(int i=1; i<=20;i++)
{
System.out.println("i="+i);
}
}
public static void main(String args[])
{
NoThread nt=new NoThread();
nt.show();
for(int x=1; x<=20; x++){
System.out.println("x="+x);
}
}
}
