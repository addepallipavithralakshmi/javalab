public class Stringepermutations
{
private static void swap(char[]arr,int i,int j)
{
 char temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
}
private static void generatePermutations(char[]arr,int currentIndex)
{
if(currentIndex==arr.length-1)
{
System.out.println(string.valueof(arr));
}
else
{
for(int i=currentIndex;i<arr.length;i++)
{
swap(arr,currentIndex,i);
generatePermutations(arr,currentIndex,i);
swap(arr,currentIndex,i);
}
}
}
public static void main(String[] args)
{
 String str="abc";
 generatePermutations(str.tocharArray(),0);
}
}
