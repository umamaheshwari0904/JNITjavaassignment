import java.util.*;
  
class Methods
    {
      void sum(int a, int b)
    {
     int c=a+b;
     System.out.println("sum of the numbers is "+c);
    }
    
    String city()
    {
      return "dallas";
            }

       void emp()
      { 
         System.out.println("emp name is priya");
     }
     
        String food(int price)
        {
             System.out.println( "cost of food is " +price);
             return "confirmed";        
     }
  }

class MethodsDemo
  {
    public static void main(String args[])
    {
        Methods md= new Methods();
         md.sum(5,9);
         md.emp();
             
          System.out.println("cityname is " +md.city());
          System.out.println("food " +md.food(13));
               
     }
}
