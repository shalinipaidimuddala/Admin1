public class ReverseString{
public static void main(String[]args){
String input="Tech Mahindra";
String reversed =reverseString(input);
System.out.println("Reversed String:"+reversed);
}
public static String reverseString(String str){
StringBuilder reversed=new StringBuilder();
for(int i=str.length() - 1;i>=0;i--){
reversed.append(str.charAt(i));
}
return reversed.toString();
}
}