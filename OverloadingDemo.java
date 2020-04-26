class Add
{
   void sum(int a, int b)
   {
     System.out.println("sum of the numbers is "+(a+b));
   }
   void sum(float a,int b)
   {
   System.out.println("sum of decimals is " +(a+b));
    }
  }
class OverloadingDemo
{
   public static void main(String args[])
   {
     Add a=new Add();
     a.sum(5,7);
     a.sum(4.8f,2);
  }
}