import java.util.*;
public class sumofdigits {
    public static void hero(int a){
int r,sum=0;
 
 while (a>0) {
    r=a%10;
    sum=sum+r;
    a=a/10;
 }
  System.out.println(sum);
}
public static void main(String []args){
  System.out.println("enter any number");
 Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
 hero(a);
}
}
