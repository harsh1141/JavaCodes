import java.util.*;
public class reverse {
    public static void main(String[] args) {
         int a,r;
System.out.println("enter any number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
while (a>0) {
    r=a%10;
    System.out.println("reversed order is:"+r);
    a=a/10;  
}
    }
   
}
