class Countries
{
    void seasons()
     {
     System.out.println("summer winter rain autumn spring summer fall");
      }
       void area()
     {
      System.out.println("100 million mi");
     }
}
class India extends Countries
  {
   void seasons()
    {
    System.out.println("seasons in India are summer winter rain autmn");
    }
    void area()
    {
    System.out.println("are of India is 1 million mi ");
    }
}
   class Usa extends Countries
    {
   void Seasons()
   {
    System.out.println("seasons in USA are spring summer fall");
    }
    void area()
    {
    System.out.println("are of USA is 3.7 million mi");  
    }
}

class OverridingDemo
{
   public static void main(String args[])
    {
    Countries c=new Countries();
     c.seasons();
     c.area();
      c=new India();
     c.seasons();
     c.area();
    c=new Usa();
    c.seasons();
    c.area();
}
}
