import java.util.*;
class Leaders
{
 public static void main(String []args)
{
 scanner sc=new scanner(System.in);
 int n=sc.nextInt();
int a[]=new int[];
int i,j,max,res;
for(i=0;i<n;i++)
 a[i]=sc.nextInt();
for(i=0;i<n-1;i++)
{ 
  max=a[i];
for (j=i+1;i<n;i++)
{
 if(a[j]>max)
  max=a[j];
}
if(a[i]==max)
System.out.println(max);
}
}
}