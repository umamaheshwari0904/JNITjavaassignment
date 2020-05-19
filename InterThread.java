
class Customer
{
int amount=10000;
synchronized void withdraw(int amount)
{
System.out.println("going to withdraw");//1
if(this.amount<amount)
{
System.out.println("less balane ,waiting for deposit");//2
try
{
wait();// 3
}
catch(Exception e){
e.printStackTrace();
}
this.amount=this.amount-amount;//9
System.out.println("withdrawl completd");//10
}
}
synchronized void deposit(int amount)
{
System.out.println("going to deposit"); //6
this.amount=this.amount+amount;
System.out.println("going back to wait"); //7
notify(); //8
}
}
class OneThread extends Thread{
Customer c;
OneThread(Customer c){
this.c=c;
}
public void run(){
c.withdraw(12000);
}
}
class SecondThread extends Thread{
Customer c;
SecondThread(Customer c){
this.c=c;
}
public void run(){
c.deposit(5000); // 5
}
}
class InterThread{
public static void main(String args[])
{
Customer c=new Customer();
OneThread ot=new OneThread(c);
SecondThread st=new SecondThread(c);
ot.start();
st.start();//4 
}
}
