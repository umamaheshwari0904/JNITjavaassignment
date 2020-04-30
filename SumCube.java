class SumCube
{
public static void main(String args[])
{
int n=123,rem=0,c=0,x=0;

while(n>0)
{
rem=n%10; 
c=rem*rem*rem; 
x=x+c; 
n=n/10; 
}
System.out.println("Sum of the cube of the intergers of number is " +x);
}
}
