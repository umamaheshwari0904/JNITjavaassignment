import java.util.Scanner;
class SwitchDemo{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter choice(1/2/3)");
int choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("1. c laguage");
break;
case 2:
System.out.println("2. Java laguage");
break;
case 3:
System.out.println("3. oacle laguage");
break;
default: System.out.println("wrong choice");
}
}
}
