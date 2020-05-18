class NoThreads{
void run(){
for(int i=1;i<=20;i++)
{
System.out.println("i="+i);
}
}
public static void main(String args[])
{
NoThreads nt=new NoThreads();
nt.run();
for(int x=1;x<=20;x++){
System.out.println("x="+x);
}
}
}
