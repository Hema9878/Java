import java.util.Scanner;
public class studentDetails {
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the std rollNumber");
int rollNumber=obj.nextInt();
System.out.println("enter the stdname");
String name=obj.nextLine();
System.out.println("enter the stdclass");
String stdcls=obj.nextLine();
System.out.println("enter the stdSection");
String studentSec=obj.nextLine();
System.out.println("enter the mark1:");
double mark1=obj.nextDouble();
System.out.println("enter the mark2:");
double mark2=obj.nextDouble();
System.out.println("enter the mark3:");
double mark3=obj.nextDouble();
System.out.println("enter the mark4:");
double mark4=obj.nextDouble();
System.out.println("enter the mark5:");
double mark5=obj.nextDouble();
double totalMarks=mark1+mark2+mark3+mark4+mark5;
double averageMarks=totalMarks/5;
System.out.println("rollNumber:"+rollNumber);
System.out.println("stdName:"+name);
System.out.println("stdcls:"+stdcls);
System.out.println("studentSec:"+studentSec);
System.out.println("mark1:"+mark1);
System.out.println("mark2:"+mark2);
System.out.println("mark3:"+mark3);
System.out.println("mark4:"+mark4);
System.out.println("mark5:"+mark5);
System.out.println("averageMarks:"+averageMarks);
obj.close();
}
}