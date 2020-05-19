class InterruptDemo extends Thread{
public void run(){
try{
Thread.sleep(1000);
System.out.println("hello");
}
catch(Exception e){
//e.printStackTrace();
}

System.out.println("thread contuing to running");
}
public static void main(String args[]){
InterruptDemo id=new InterruptDemo();
id.start();
id.interrupt();
}
}