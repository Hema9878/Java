import java.util.*;
public class wordCount{
public static void main(String args[]){
String str="hii guys";
int countWords=str.split("\\s").length;
System.out.println("no of words:"+countWords);
}
}