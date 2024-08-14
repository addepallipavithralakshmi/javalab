class Sum1
{
 public static int series(int n)
{
 if (n==0||n<0)
  return 0;
  return n+series(n-1);
}
public static void main(String [] args)
{
int n=5;
System.out.println(series(n));
}
}
