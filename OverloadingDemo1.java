class Flower
{
   void rose(String color1)
   {
     System.out.println("color of the rose is " +color1 );
   }
   void rose(String color1, String color2)
   {
   System.out.println("color of the rose flowers are " +color1  +color2);
    }
  }
class OverloadingDemo1
{
   public static void main(String args[])
   {
     Flower f=new Flower();
     f.rose("red");
     f.rose("pink","yellow");
  }
}