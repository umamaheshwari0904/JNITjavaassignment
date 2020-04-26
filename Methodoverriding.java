class Zero
{
void comparsion()
{
System.out.println("numbers comparsion");
}
}
class Twenty extends Zero
{
void comparsion()
{
System.out.println("20 is greater than 0");
}
}
class MinusOne extends Zero
{
void comparsion()
{
System.out.println("-1 is smaller than 0");
}
}
class Methodoverriding
{
public static void main(String args[])
{
Zero z=new Zero();
z.comparsion();

z=new Twenty();
z.comparsion();

z=new MinusOne();
z.comparsion();
}
}


