import java.util.Scanner;
class Sum extends Thread{
int x,y;
public void run(){
System.out.println("enter x , y values");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
}
public static void main(String args[]) throws Exception{
Sum t=new Sum();
t.start();
t.join();
int c;
c=t.x+t.y;
System.out.println("sum="+c);
}
}
