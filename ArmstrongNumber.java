class ArmstrongNumber
{
public static void main(String args[])
{
int n=370,c=0,rem=0,x=0,i;
i=n;
while(n>0)
{
rem=n%10; 
c=rem*rem*rem; 
x=x+c; 
n=n/10; 
}

if(x==i)
{
System.out.println("given number is Armstrong number");
}
else
{
System.out.println("given number is not Armstrong number");
}
}
}