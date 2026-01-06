//Matrix addition problem
import java.util.Scanner;
public class m
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int mid=n/2;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
int x=sc.nextInt();
if(i==j||i+j==n-1||i==mid||j==mid)
{
sum+=x;
}
}
}
System.out.println(sum);
}
}
