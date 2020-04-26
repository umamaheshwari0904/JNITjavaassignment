class Food
{
   void taste()
   {
      System.out.println("taste of food");
   }
}
class Biryani extends Food
{
   void taste()
   {
      System.out.println("biryani is the spicest food");
   }
}
class Pulav extends Biryani
{
  void taste()
  {
     System.out.println("pulav is not spice than biryani");
  }
}
class Pulihara extends Pulav
{
  void taste()
  {
     System.out.println("Pulihara is tanggy in taste");
  }
}
class HierarchicalInheritanceDemo
{
public static void main(String args[])
{
Food f=new Food();
f.taste();

f=new Biryani();
f.taste();

f=new Pulav();
f.taste();

f=new Pulihara();
f.taste();
}
}