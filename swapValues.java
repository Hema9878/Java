import java.util.*;
public class swapValues{
public static void main(String args[]){
System.out.println("enter the x and y values:");
Scanner obj=new Scanner(System.in);
int x=obj.nextInt();
int y=obj.nextInt();
System.out.println("before swapping:"+x+""+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("after swapping:"+x+""+y);
}
}