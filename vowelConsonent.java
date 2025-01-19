import java.util.*;
public class vowelConsonent{
public static void main(String args[])
{
int vow=0,con=0;
String str="i love pet";
for(int i = 0; i < str.length(); i++) {    
if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {                 
vow++;    
}
else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
con++;
}    
}    
System.out.println("Number of vowels: " + vow);    
System.out.println("Number of consonants: " + con);    
}    
}   
