import java.util.*;
import java.lang.*;
class Evendodd
{
public static void main(String agrs[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]%2==0)
System.out.println(a[i]+"");
}
for(i=0;i<n;i++)
{
if(a[i]%2!=0)
System.out.println(a[i]+"");
}
}
}

