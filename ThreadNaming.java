class ThreadNaming extends Thread{
public void run(){
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[]){
System.out.println(Thread.currentThread().getName());
ThreadNaming tn=new ThreadNaming();
ThreadNaming tm=new ThreadNaming();

// setting priority for the thread 
tn.setPriority(Thread	.MIN_PRIORITY);
tm.setPriority(Thread.MAX_PRIORITY);
//tn.run();
tn.setName("First-Thread");


tm.setName(" Second-Thread");

tm.start(); 
tn.start(); 

}
}
