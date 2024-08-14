import java.io.*;
import java.util.Scanner;
class Patient
{
Scanner sc=new Scanner(System.in);
 String name=sc.nextLine();
 double weight=sc.nextDouble();
 double height=sc.nextDouble();
 Patient()
{
  this.name=name;
  this.weight=weight;
  this.height=height;
}
public double bmi()
{
 double a=(weight/(height *height )*703);
System.out.println(a);
return a;
}
}
class Main
{
public static void main(String agrs[])
{
 Patient p=new Patient();
 p.bmi();
}
}
