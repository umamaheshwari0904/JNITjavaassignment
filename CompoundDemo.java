class CompoundDemo{
public static void main (String args[]){
int a=10,b=20; 
System.out.println("Using += operator: " + (b += a));
System.out.println("Using -= operator: " +(b-=a));
System.out.println("Using *= operator: " +(a*=b));
}
}