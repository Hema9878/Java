import java.util.Scanner;
public class Adding2Numbers {
public static void main(String args[])
{
int x,y,sum;
Scanner obj=new Scanner(System.in);
System.out.println("enter the first number(x)");
x=obj.nextInt();
System.out.println("enter the second number(y)");
y=obj.nextInt();
sum=x+y;
System.out.println("adding two numbers"+sum);
}
}
