import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int a,b,r,s=0;
Scanner what=new Scanner(System.in);
System.out.println("enter any number");
a=what.nextInt();
b=a;
while (a>0) {
    r=a%10;
    s=s*10+r;
    a=a/10;
}
if (b==s) 
    {
    System.out.println("palindrome");
}
else{
    System.out.println("not palindrome");
}
    }
}
