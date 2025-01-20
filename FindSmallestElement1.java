public class FindSmallestElement1
{
public static void main(String[] args)
{
int a[]={99,4,33,9,19};
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
