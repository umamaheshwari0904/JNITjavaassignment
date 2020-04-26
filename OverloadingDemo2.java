class Car
{
   void bmw(int milage)
   {
     System.out.println("Milage of Bmw car is  " +milage+ "km");
   }
   void bmw(String color, int price)
   {
   System.out.println("color and price of this BMW car is  " +color  +price+ "lakh");
    }
  }
class OverloadingDemo2
{
   public static void main(String args[])
   {
     Car c=new Car();
     c.bmw(20);
     c.bmw("blue", 75);
  }
}