public class FindSmallestElement1
{
public static void main(String[] args)
{
int a[]={100,200,4,6,77,23,11};
int min=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
System.out.println(min);
}
}
