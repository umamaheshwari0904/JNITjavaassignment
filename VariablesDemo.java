class City
{
  int pop;
  static String name;
  int zipcode;
}
class Person
{
   int age;
   static String lname;
   double height;
}
class VariablesDemo
{
  public static void main(String args[])
   {
       City dallas=new City();
       Person priyanka=new Person();
       System.out.println(dallas.pop);
       System.out.println(dallas.name);
       System.out.println(dallas.zipcode);
       priyanka.age=25;
       priyanka.lname= "reddy";
       priyanka.height= 5.5;
       System.out.println("person lname="+priyanka.lname);
        System.out.println("person lname="+priyanka.age);
         System.out.println("person lname="+priyanka.height);
   }
}