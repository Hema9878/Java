import java.util.*;
public class letterCount{
public static void main(String[] args){
int count=0;
String str="way to succes";
for(int i=0;i<=str.length();i++){
if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A'  && str.charAt(i)<='Z'))
count++;
}
System.out.println("total no of characters:"+count);
}
}
