import java.util.*;
class Pattern1
{
public static void main(String args[])
{
int i,j,r;
Scanner sc=new Scanner(System.in);
System.out.print("enter the row value =");
r=sc.nextInt();
for(i=0;i<=r;i++)
{
for(j=1;j<=i;j++)
System.out.print("*");
System.out.println();
}
}
}
